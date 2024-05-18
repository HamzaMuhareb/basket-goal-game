package structures;

public class NodeCost implements Comparable<NodeCost> {
    private Board board;
    private int cost;
    private NodeCost parent;
    private int steps;

    public NodeCost(Board board, int cost, NodeCost parent) {
        this.board = board;
        this.cost = cost;
        this.parent = parent;
    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public Board getBoard() {
        return board;
    }

    public int getCost() {
        return cost;
    }

    public NodeCost getParent() {
        return parent;
    }

    @Override
    public int compareTo(NodeCost other) {
        // Compare nodes based on their cost (used for priority queue).
        return Integer.compare(this.cost, other.cost);
    }
}