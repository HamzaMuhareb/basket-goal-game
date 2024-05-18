import actions.GameSolver;
import structures.*;
import java.util.Scanner;
import java.time.LocalTime;
import java.time.Duration;
public class Main {

    public static void chooseWay(Board gameBoard){

        Scanner scanner = new Scanner(System.in);
        GameSolver gameSolver = new GameSolver();
        System.out.println("choose a way to play \n('User', 'BFS', 'DFS' , 'BFS_Shortest_path(type: SP)' ,\n 'UCS' , 'A_Star(type: A*)' , 'Hill_Climbing(type: HC)'): ");
        String way = scanner.nextLine().toLowerCase();
        switch (way) {
            case "user":
                gameBoard.printBalls();
                gameBoard.printBoard();
                while (true) {
                    System.out.println("Enter a move ('up', 'down', 'left', 'right', or 'quit'): ");
                    String move = scanner.nextLine().toLowerCase();

                    switch (move) {
                        case "quit":
                        case "q":
                            System.out.println("Thanks for playing!");
                            scanner.close();
                            return;
                        default:
                            gameBoard.move(move);
                            gameBoard.printBalls();
                            gameBoard.printBoard();
                            break;
                    }

                    if (gameBoard.isFinal()) {
                        System.out.println("Congratulations! You've solved the puzzle.");
                        break;
                    }
                }
                break;
            case "bfs":
                gameSolver.solveGameBFS(gameBoard);
                break;
            case "dfs":
                gameSolver.solveGameDFS(gameBoard);
                break;
            case "bfs_shortest_path":
            case "sp":
                gameSolver.solveGameBFSPath(gameBoard);
                break;
            case "ucs":
                gameSolver.solveGameUCS(gameBoard);
                break;
            case "a_star":
            case "a*":
                gameSolver.solveGameAStar(gameBoard);
                break;
            case "hill_climbing":
            case "hc":
                gameSolver.solveGameHillClimbing(gameBoard);
                break;
            default:
                System.out.println("invalid way, try again ");
                chooseWay(gameBoard);
                break;
        }

    }

    public static void main(String[] args) {
//        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the 8 Puzzle Game!");
        Board gameBoard = new Board();
        gameBoard.choose();
        chooseWay(gameBoard);

/*
        GameSolver gameSolver = new GameSolver();
        LocalTime start = LocalTime.now();
//        gameSolver.solveGameBFS(gameBoard);
//        gameSolver.solveGameDFS(gameBoard);
//        gameSolver.solveGameBFSPath(gameBoard);
        LocalTime end = LocalTime.now();
        Duration d = Duration.between(start,end);
        System.out.println("duration: "+ d.getNano() /1000000+"ms");
        */

    }
}