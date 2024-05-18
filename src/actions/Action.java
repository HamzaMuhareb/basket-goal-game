package actions;
import structures.Board;
import structures.Tile;

import java.util.ArrayList;
public class Action {

    public Tile[] moveTileUp(Tile[][] tiles, Tile[] movable1) {

        PublicFunction p =new PublicFunction();
        int m_len = movable1.length;
//        System.out.println("mov0val before sorting: "+movable1[0].getValue());
        Tile[] movable =  p.sortTilesByRows(movable1);

//        System.out.println("mov0val after sorting: "+movable1[0].getValue());
//        System.out.println("mov0val after not reversing: "+movable1[0].getValue());
//        System.out.println("mov0val+ after not reversing: "+movable[0].getValue());
//        Tile[] movable = p.reverse(movable1);

        Tile[] m = new Tile[movable.length];
        for(int i =0;i<m_len;i++) {
            int row = movable[i].getRow();
            int col = movable[i].getCol();

            int r = row;
            while (r>0&& tiles[r-1][col].getValue() == 0){
                r--;
            }
            p.SwapValues(tiles[r][col], tiles[row][col]);
            m[i] = new Tile(tiles[r][col]);

            }


        Tile[] m1 = p.reverse( p.sortTilesByValues(m));
        return m1;
    }

    public Tile[] moveTileDown(Tile[][] tiles ,Tile[] movable1) {
        PublicFunction p =new PublicFunction();
        int m_len = movable1.length;
//        System.out.println("mov0val before sorting: "+movable1[0].getValue());
//        p.sortTilesByRows(movable1);
//        System.out.println("mov0val after sorting: "+movable1[0].getValue());
//        Tile[] movable = movable1;
        Tile[] movable = p.reverse( p.sortTilesByRows(movable1));

//        System.out.println("mov0val after reversing: "+movable1[0].getValue());

//        System.out.println("mov0val+ after reversing: "+movable[0].getValue());
//        for (int col = 0; col < tiles[0].length; col++) {

//            for (int row = tiles.length -1; row >= 0; row--) {
//                System.out.println(row);
//                if (tiles[row][col].getValue() == 2 || tiles[row][col].getValue() == 3) {
//                    System.out.println(row);
        Tile[] m = new Tile[movable.length];
        for(int i =0;i<m_len;i++) {
            int row = movable[i].getRow();
            int col = movable[i].getCol();
            int r = row;
            while (r < tiles.length - 1 && tiles[r + 1][col].getValue() == 0) {
                r++;
            }
            p.SwapValues(tiles[r][col], tiles[row][col]);
            m[i] = new Tile(tiles[r][col]);
        }
//                m[i].setValue(movable[i].getValue());
//                m[i].setRow(r);
//                m[i].setCol(col);
//            movable[i].setRow(r);
//            for (int r = row; r < tiles.length - 1; r++) {
////                        System.out.println(r);
//                int rc = r + 1;
//                if (tiles[rc][col].getValue() != 0) {
////                            System.out.println("hi");
//                    //p.SwapValues(tiles[r][col], tiles[row][col]);
//                    movable1[i].setRow(r);
////                            tiles[r][col].setValue(tiles[row][col].getValue());
////                            tiles[row][col].setValue(0);
//                }
//                if (rc == tiles.length - 1 && tiles[rc][col].getValue() == 0) {
////                            System.out.println("hi");
//                    //p.SwapValues(tiles[rc][col], tiles[row][col]);
//                    //movable1[i].setRow(rc);
////                            tiles[r+1][col].setValue(tiles[row][col].getValue());
////                            tiles[row][col].setValue(0);
//                }
//
//            }
//                }
//            }
//        }

        Tile[] m1 = p.reverse( p.sortTilesByValues(m));

        return m1;
    }



    public Tile[] moveTileLeft(Tile[][] tiles,Tile[] movable1) {

        PublicFunction p =new PublicFunction();
        int m_len = movable1.length;
        Tile[] movable =  p.sortTilesByColumns(movable1);

        Tile[] m = new Tile[movable.length];
        for(int i =0;i<m_len;i++) {
            int row = movable[i].getRow();
            int col = movable[i].getCol();

            int c = col;
            while (c>0&& tiles[row][c-1].getValue() == 0){
                c--;
            }
            p.SwapValues(tiles[row][c], tiles[row][col]);
            m[i] = new Tile(tiles[row][c]);

        }
        Tile[] m1 = p.reverse( p.sortTilesByValues(m));
        return m1;
    }


    public Tile[] moveTileRight(Tile[][] tiles,Tile[] movable1) {
        PublicFunction p =new PublicFunction();
        int m_len = movable1.length;
        Tile[] movable = p.reverse( p.sortTilesByColumns(movable1));

        Tile[] m = new Tile[movable.length];
        for(int i =0;i<m_len;i++) {
            int row = movable[i].getRow();
            int col = movable[i].getCol();
            int c = col;
            while (c < tiles[0].length - 1 && tiles[row][c+1].getValue() == 0) {
                c++;
            }
            p.SwapValues(tiles[row][c], tiles[row][col]);
            m[i] = new Tile(tiles[row][c]);
        }

        Tile[] m1 = p.reverse( p.sortTilesByValues(m));

        return m1;
    }


    public boolean equalMoves(Tile tiles1[],Tile tiles2[] ) {

        int checked = 0;
        for (int i = 0; i < tiles1.length; i++) {
            for (int j = 0; j < tiles2.length; j++) {
                if (tiles1[i].getValue() == tiles2[j].getValue()
                        &&tiles1[i].getRow()==tiles2[i].getRow()
                        &&tiles1[i].getCol()==tiles2[i].getCol()) {
                    checked++;
                }
            }
        }
        if(checked == tiles1.length){
            return true;
        }
        else {
        return false;
        }
    }



    public boolean equalTiles(Tile tiles1[][],Tile tiles2[][] ) {
        int numRows = tiles1.length;
        int numCols = tiles1[0].length;

        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                if (tiles1[row][col].getValue() != tiles2[row][col].getValue()) {
                    return false;
                }
            }
        }
        return true;
    }


    public boolean checkMoveUP(Board b){
//        Tile[] m1 = b.getMovable();
        Board up = new Board(b);
//        up =b;
        up.move("up");
//        Tile[] m2 = up.getMovable();
        if(equalTiles(b.getTiles(),up.getTiles())){
            return false;
        }
        return true;
    }


    public boolean checkMoveDown(Board b){
//        Tile[] m1 = b.getMovable();
        Board Down = new Board(b);
//        Down = b;
        Down.move("down");
//        Tile[] m2 = Down.getMovable();
        if(equalTiles(b.getTiles(),Down.getTiles())){
            return false;
        }
        return true;
    }



    public boolean checkMoveLeft(Board b){
//        Tile[] m1 = b.getMovable();
        Board Left = new Board(b);
//        Left = b;
        Left.move("left");
//        Tile[] m2 = Left.getMovable();
        if(equalTiles(b.getTiles(),Left.getTiles())){
            return false;
        }
        return true;
    }

    public boolean checkMoveRight(Board b){
//        Tile[] m1 = b.getMovable();
        Board Right = new Board(b);
//        Right = b;
        Right.move("right");
//        Tile[] m2 = Right.getMovable();
        if(equalTiles(b.getTiles(),Right.getTiles())){
            return false;
        }
        return true;
    }

    public boolean[] checkMoves(Board b){
        boolean[] n = new boolean[4];

        n[0] =checkMoveDown(b);
        n[1] =checkMoveUP(b);
        // I put the down first so the algorithm tries the down first
        n[2] =checkMoveLeft(b);
        n[3] =checkMoveRight(b);
        if(b.isFinal()){
            boolean[] nf = new boolean[]{false,false,false,false};
            return nf;
        }
        return n;
    }


    public ArrayList<Board> GetNextStates(Board b){
        Board[] board = new Board[4];
        boolean[] n =checkMoves(b);
        ArrayList<Board> boards = new ArrayList<>();


        if(n[0]){
            board[1] = new Board(b);
            board[1].move("down");
            boards.add(board[1]);
//            System.out.print("down  ");

        }
        if(n[1]){
            board[0] = new Board(b);
            board[0].move("up");
            boards.add(board[0]);
//            System.out.print("up    ");
        }
        if(n[2]){
            board[2] = new Board(b);
            board[2].move("left");
            boards.add(board[2]);
//            System.out.print("left  ");
        }
        if(n[3]){
            board[3] = new Board(b);
            board[3].move("right");
            boards.add(board[3]);
//            System.out.print("right ");
        }

//        System.out.print("//");
        return boards;
    }
}