package actions;
import structures.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.PriorityQueue;

public class GameSolver {
    
    private boolean isVisited(ArrayList<Tile[][]> visitedStates, Tile[][] tiles) {
        for (Tile[][] visitedState : visitedStates) {
            if (new Action().equalTiles(tiles, visitedState)) {
                return true;
            }
        }
        return false;
    }

    public void solveGameBFS(Board initialBoard) {
        Queue<Board> queue = new LinkedList<>();
        ArrayList<Tile[][]> visitedStates = new ArrayList<>();

        queue.add(initialBoard);
        visitedStates.add(initialBoard.getTiles());

        while (!queue.isEmpty()) {
            Board currentBoard = queue.poll();

            if (currentBoard.isFinal()) {
                System.out.println();
                System.out.println("Found a winning state:");
                currentBoard.printBoard();
            } else {
                currentBoard.printBoard();
                ArrayList<Board> nextStates = new Action().GetNextStates(currentBoard);
                for (Board nextState : nextStates) {
                    if (!isVisited(visitedStates, nextState.getTiles())) {
                        visitedStates.add(nextState.getTiles());
                        queue.add(nextState);
                    }
                }
            }
        }
    }
    public void  solveGameDFS(Board initialBoard){
        ArrayList<Tile[][]> visitedStates = new ArrayList<>();
        DFS(initialBoard, visitedStates);
    }
    public void DFS(Board currentBoard, ArrayList<Tile[][]> visitedStates) {
        if (currentBoard.isFinal()) {
            System.out.println();
            System.out.println("Found a winning state:");
            currentBoard.printBoard();
        } else {
            currentBoard.printBoard();
            ArrayList<Board> nextStates = new Action().GetNextStates(currentBoard);

            for (Board nextState : nextStates) {
                if (!isVisited(visitedStates, nextState.getTiles())) {
                    visitedStates.add(nextState.getTiles());
                    DFS(nextState, visitedStates);
                }
            }
        }
    }

    public void solveGameBFSPath(Board initialBoard) {
        boolean f = false;
        Queue<Node> priorityQueue = new LinkedList<>();
        ArrayList<Tile[][]> visitedStates = new ArrayList<>();
        LinkedList<Node> pathToGoal = new LinkedList<>();

        Node initialNode = new Node(initialBoard, null);
        priorityQueue.add(initialNode);

        while (!priorityQueue.isEmpty()) {
            Node currentNode = priorityQueue.poll();
            Board currentBoard = currentNode.getBoard();

            if (currentBoard.isFinal()) {

                Node node = currentNode;
                f =true;
                while (node != null) {
                    pathToGoal.addFirst(node);
                    node = node.getParent();
                }
                break;
            } else {
                visitedStates.add(currentBoard.getTiles());

                ArrayList<Board> nextStates = new Action().GetNextStates(currentBoard);

                for (Board nextState : nextStates) {
                    if (!isVisited(visitedStates, nextState.getTiles())) {
                        Node nextNode = new Node(nextState, currentNode);
                        priorityQueue.add(nextNode);
                    }
                }
            }
        }
        if(f) {
            int n = 0;
            for (Node node : pathToGoal) {
                System.out.println("Step " + n + ":");
                node.getBoard().printBoard();
                n++;
            }
            System.out.println("Finished finding the shortest path by bfs algorithm");
        }
        else {
            System.out.println("Failed finding the shortest path by bfs algorithm");
        }
    }



    public void solveGameUCS(Board initialBoard) {
        boolean f = false;
        PriorityQueue<NodeCost> priorityQueue = new PriorityQueue<>();
        ArrayList<Tile[][]> visitedStates = new ArrayList<>();
        LinkedList<NodeCost> pathToGoal = new LinkedList<>();

        NodeCost initialNode = new NodeCost(initialBoard, 0, null);
        priorityQueue.add(initialNode);

        while (!priorityQueue.isEmpty()) {
            NodeCost currentNode = priorityQueue.poll();
            Board currentBoard = currentNode.getBoard();

            if (currentBoard.isFinal()) {
                NodeCost node = currentNode;
                f =true;
                while (node != null) {
                    pathToGoal.addFirst(node);
                    node = node.getParent();
                }
                break;
/*
                System.out.println();
                System.out.println("Found a winning state:");
                System.out.println("cost " + currentNode.getCost());
                currentBoard.printBoard();
                */

            } else {

/*
                System.out.println("cost " + currentNode.getCost());
                currentBoard.printBoard();
                */

                visitedStates.add(currentBoard.getTiles());
                ArrayList<Board> nextStates = new Action().GetNextStates(currentBoard);
                for (Board nextState : nextStates) {
                    if (!isVisited(visitedStates, nextState.getTiles())) {
//                        int cost = nextState.checkBoardCost();
                        int costToReachNextState = currentNode.getCost() + 1;
                        NodeCost nextNode = new NodeCost(nextState, costToReachNextState, currentNode);
                        priorityQueue.add(nextNode);
                    }
                }
            }
        }

        if(f) {
            int n = 0;
            for (NodeCost node : pathToGoal) {
                System.out.println("Step " + n + ":");
                System.out.println("cost " + node.getCost());
                node.getBoard().printBoard();
                n++;
            }
            System.out.println("Finished finding the lowest cost path by ucs algorithm");
        }
        else {
            System.out.println("Failed finding the lowest cost path by ucs algorithm");
        }
    }


    public void solveGameAStar(Board initialBoard) {
        boolean f = false;
        PriorityQueue<NodeCost> priorityQueue = new PriorityQueue<>();
        ArrayList<Tile[][]> visitedStates = new ArrayList<>();
        LinkedList<NodeCost> pathToGoal = new LinkedList<>();

        NodeCost initialNode = new NodeCost(initialBoard, 0, null);
        initialNode.setSteps(0);
        priorityQueue.add(initialNode);

        while (!priorityQueue.isEmpty()) {
            NodeCost currentNode = priorityQueue.poll();
            Board currentBoard = currentNode.getBoard();

            if (currentBoard.isFinal()) {
                NodeCost node = currentNode;
                f =true;
                while (node != null) {
                    pathToGoal.addFirst(node);
                    node = node.getParent();
                }
                break;
/*
                System.out.println();
                System.out.println("Found a winning state:");
                System.out.println("cost " + currentNode.getCost());
                currentBoard.printBoard();
                */

            } else {

/*
                System.out.println("cost " + currentNode.getCost());
                currentBoard.printBoard();
                */

                visitedStates.add(currentBoard.getTiles());
                ArrayList<Board> nextStates = new Action().GetNextStates(currentBoard);
                for (Board nextState : nextStates) {
                    if (!isVisited(visitedStates, nextState.getTiles())) {
                        int steps = currentNode.getSteps()+1;
                        int cost = nextState.checkBoardCost();
                        int costToReachNextState = cost +steps;
                        NodeCost nextNode = new NodeCost(nextState, costToReachNextState, currentNode);
                        nextNode.setSteps(steps);
                        priorityQueue.add(nextNode);
                    }
                }
            }
        }

        if(f) {
            int n = 0;
            for (NodeCost node : pathToGoal) {
                System.out.println("Step " + n + ":");
                System.out.println("cost " + node.getCost());
                node.getBoard().printBoard();
                n++;
            }
            System.out.println("Finished finding the lowest cost path by A* algorithm");
        }
        else {
            System.out.println("Failed finding the lowest cost path by A* algorithm");
        }
    }


    public void solveGameHillClimbing(Board initialBoard) {
        boolean f = false;
        PriorityQueue<NodeCost> priorityQueue = new PriorityQueue<>();
        ArrayList<Tile[][]> visitedStates = new ArrayList<>();
        LinkedList<NodeCost> pathToGoal = new LinkedList<>();

        NodeCost initialNode = new NodeCost(initialBoard, 0, null);
        priorityQueue.add(initialNode);

        while (!priorityQueue.isEmpty()) {
            NodeCost currentNode = priorityQueue.poll();
            Board currentBoard = currentNode.getBoard();

            if (currentBoard.isFinal()) {
                NodeCost node = currentNode;
                f =true;
                while (node != null) {
                    pathToGoal.addFirst(node);
                    node = node.getParent();
                }
                break;
/*
                System.out.println();
                System.out.println("Found a winning state:");
                System.out.println("cost " + currentNode.getCost());
                currentBoard.printBoard();
                */

            } else {

/*
                System.out.println("cost " + currentNode.getCost());
                currentBoard.printBoard();
                */

                visitedStates.add(currentBoard.getTiles());
                ArrayList<Board> nextStates = new Action().GetNextStates(currentBoard);
                for (Board nextState : nextStates) {
                    if (!isVisited(visitedStates, nextState.getTiles())) {
                        int costToReachNextState = nextState.checkBoardCost();
                        NodeCost nextNode = new NodeCost(nextState, costToReachNextState, currentNode);
                        priorityQueue.add(nextNode);
                    }
                }
            }
        }

        if(f) {
            int n = 0;
            for (NodeCost node : pathToGoal) {
                System.out.println("Step " + n + ":");
                int c = node.getCost();
                if(node.getParent() == null){c = 30;}
                System.out.println("score " + (30 - c));
                node.getBoard().printBoard();
                n++;
            }
            System.out.println("Finished finding the highest score path by hill climbing algorithm");
        }
        else {
            System.out.println("Failed finding the highest score path by hill climbing algorithm");
        }
    }


}
