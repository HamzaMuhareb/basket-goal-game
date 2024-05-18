package structures;

public class Node {
    private Board board;
    private Node parent;

    public Node(Board board, Node parent) {
        this.board = board;
        this.parent = parent;
    }

    public Board getBoard() {
        return board;
    }

    public Node getParent() {
        return parent;
    }
}