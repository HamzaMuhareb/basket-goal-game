package structures;

import actions.Action;
import actions.PublicFunction;

import java.util.Scanner;
public class Board {
    private Tile[][] tiles;
//    private Tile[] coins;
//    private Tile[] balls;
//    private Tile basket;
    private Tile[] movable;
    private int initialBalls;
    private int balls;
    //value 0 means the tile is empty
    //value 1 means the tile is a wall
    //value 2 means there is a coin in the tile
    //value 3 means there is a ball in the tile
    //value 4 means there is a basket in the tile


    public int getInitialBalls() {
        return initialBalls;
    }

    public void setInitialBalls(int initialBalls) {
        this.initialBalls = initialBalls;
    }

    public int getBalls() {
        return balls;
    }

    public void setBalls(int balls) {
        this.balls = balls;
    }

    public Tile[][] getTiles() {
        return tiles;
    }

    public void setTiles(Tile[][] tiles) {
        this.tiles = tiles;
    }

//    public Tile[] getCoins() {
//        return coins;
//    }
//
//    public void setCoins(Tile[] coins) {
//        this.coins = coins;
//    }
//
//    public Tile[] getBalls() {
//        return balls;
//    }
//
//    public void setBalls(Tile[] balls) {
//        this.balls = balls;
//    }
//
//    public Tile getBasket() {
//        return basket;
//    }
//
//    public void setBasket(Tile basket) {
//        this.basket = basket;
//    }

    public Tile[] getMovable() {
        return movable;
    }

    public void setMovable(Tile[] movable) {
        this.movable = movable;
    }
//
//    public void Update(Tile[] movable){
//        for(int i = 0; i< movable.length ;i++){
//            int r = movable[i].getRow();
//            int c = movable[i].getCol();
//            this.tiles[r][c] = movable[i];
//        }
//    }

    public Board(){}

    public Board(Board other) {
        // Copy 'tiles' array
        this.tiles = new Tile[other.tiles.length][other.tiles[0].length];
        for (int i = 0; i < other.tiles.length; i++) {
            for (int j = 0; j < other.tiles[i].length; j++) {
                this.tiles[i][j] = new Tile(other.tiles[i][j]);
            }
        }
        this.initialBalls = other.initialBalls;
        this.balls = other.balls;
//        // Copy 'balls' array
//        this.balls = new Tile[other.balls.length];
//        for (int i = 0; i < other.balls.length; i++) {
//            this.balls[i] = new Tile(other.balls[i]);
//        }
//
//        // Copy 'basket' (assuming 'Tile' has a copy constructor)
//        this.basket = new Tile(other.basket);

        // Copy 'movable' array
        this.movable = new Tile[other.movable.length];
        for (int i = 0; i < other.movable.length; i++) {
            this.movable[i] = new Tile(other.movable[i]);
        }
    }


    public int checkBoardCost (){
        int cost =24;
        int m =this.movable.length;
        int sum = 0;
//        int numRows = tiles.length;
//        int numCols = tiles[0].length;
        for(int i=1;i<m;i++) {
            sum += movable[i].getValue();
            if(movable[i].getValue() == 3 || movable[i].getValue() == 2){
                if (movable[i].getCol() == movable[0].getCol()) {
                    cost -= 3;
                }
                if (movable[i].getRow() < movable[0].getRow()) {
                    int c = movable[0].getRow() - movable[i].getRow();
                    cost -= (6/c);
                }
            }
            if(movable[i].getValue() == 2){
                cost += 6;
            }
            if(movable[i].getValue() == 0){
                cost -= 3;
            }
        }
        if(cost<0 || sum == 0){
            cost = 0;
        }
        return cost;
    }


    public void printBoard() {
        System.out.println();

        int numRows = tiles.length;
        int numCols = tiles[0].length;

//        action act = new action();
//        boolean[] v = act.checkMoves(this);
//        System.out.print("up: "+v[0] +"    ");
//        System.out.print("down: "+v[1] +"    ");
//        System.out.print("left: "+v[2] +"    ");
//        System.out.print("right: "+v[3] +"    ");
////        for (boolean w:v) {
////            System.out.print("move : "+w +"\t");
////        }
//        System.out.println();

        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                int value = tiles[row][col].getValue();
                  if (value == 1) {
                    System.out.print("[X]");
                } else if (value == 2) {
                    System.out.print(" c ");
                } else if (value == 3) {
                      System.out.print(" * ");
                  } else if (value == 4) {
                    System.out.print(" # ");
                  } else {
                      System.out.print("   ");
                  }
                if (col < numCols - 1) {
                    System.out.print("|");
                }
            }
            System.out.println(); // Move to the next row

            if (row < numRows - 1) {
                for (int col = 0; col < numCols; col++) {
                    System.out.print("---");
                    if (col < numCols - 1) {
                        System.out.print("+");
                    }
                }
                System.out.println(); // Move to the next row
            }
        }
        System.out.println();
    }

    public void printBalls(){
        int b = this.initialBalls - this.balls;
        System.out.println("\nscore: ("+b+"/"+this.initialBalls+") ");
    }

    public boolean isFinal() {
//
//        Tile ball = new Tile();
//        Tile basket = new Tile();
//        ball.setValue(0);
//        int r = tiles.length;
//        int c = tiles[0].length;
//        for (int col = 0; col < c; col++) {
//            for (int row = 0; row < r; row++) {
//                if (tiles[row][col].getValue() == 2) {
//                    ball.setCol(col);
//                    ball.setRow(row);
//                    ball.setValue(2);
//                }
//                if (tiles[row][col].getValue() == 3) {
//                    basket.setCol(col);
//                    basket.setRow(row);
//                    basket.setValue(3);
//                }
//            }
//        }
        int m =this.movable.length;

        int sum =0;
        for(int i=1;i<m;i++){
            if(movable[i].getValue() == 3){
            sum += 1;
            }
//        if(movable[i].getCol() == movable[0].getCol()&&movable[i].getRow() +1 == movable[0].getRow()){
//            tiles[movable[i].getRow()][movable[i].getCol()].setValue(0);
//            movable[i].setValue(0);
//        }
        }
        if(sum == 0){
            return true;
        }
        return false;
    }

    public boolean fix(){
        int m =this.movable.length;
        for(int i=1;i<m;i++){
            if(movable[i].getCol() == movable[0].getCol()&&movable[i].getRow() +1 == movable[0].getRow()){
                if(movable[i].getValue() == 3){
                    this.balls--;
                }
                tiles[movable[i].getRow()][movable[i].getCol()].setValue(0);
                movable[i].setValue(0);
                return true;
            }
        }
        return false;
    }
    public void move (String a){
        Action act = new Action();

        switch (a) {
            case "up":
            case "w":
//
//                System.out.println(this.movable[1].getRow());
//                System.out.println(this.movable[0].getRow());
//
//                System.out.println(this.movable[1].getValue());
//                System.out.println(this.movable[0].getValue());

//                System.out.println("mov0val before moving : "+movable[0].getValue());
//
//                System.out.println("mov0row before moving : "+movable[0].getRow());
//
//                System.out.println("mov1val before moving : "+movable[1].getValue());
//
//                System.out.println("mov1row before moving : "+movable[1].getRow());
                this.movable = act.moveTileUp(this.tiles,this.movable);
                if(fix()){
                    this.movable = act.moveTileUp(this.tiles,this.movable);
                }
//                System.out.println("mov0val after moving : "+movable[0].getValue());
//
//                System.out.println("mov0row after moving : "+movable[0].getRow());
//
//                System.out.println("mov1val after moving : "+movable[1].getValue());
//
//                System.out.println("mov1row after moving : "+movable[1].getRow());
//                System.out.println(this.movable[1].getRow());
//                System.out.println(this.movable[0].getRow());
//
//                System.out.println(this.movable[1].getValue());
//                System.out.println(this.movable[0].getValue());

                break;
            case "down":
            case "s":
//
//                System.out.println(this.movable[1].getRow());
//                System.out.println(this.tiles[3][2].getValue());
//                System.out.println("mov0val before moving : "+movable[0].getValue());
//
//                System.out.println("mov0row before moving : "+movable[0].getRow());
//
//                System.out.println("mov1val before moving : "+movable[1].getValue());
//
//                System.out.println("mov1row before moving : "+movable[1].getRow());
                this.movable = act.moveTileDown(this.tiles,this.movable);
                if(fix()){
                    this.movable = act.moveTileDown(this.tiles,this.movable);
                }

//                System.out.println("mov0val after moving : "+movable[0].getValue());
//
//                System.out.println("mov0row after moving : "+movable[0].getRow());
//
//                System.out.println("mov1val after moving : "+movable[1].getValue());
//
//                System.out.println("mov1row after moving : "+movable[1].getRow());
//                this.tiles = act.moveTileDown(this.tiles);
//                System.out.println(this.movable[1].getRow());
//                System.out.println(this.tiles[3][2].getValue());
//                Update(movable);
//                isFinal();
//                this.tiles = act.moveTileDown(this.tiles);
//                if( isFinal()) {
//                    this.movable = act.moveTileDown(this.tiles,this.movable);
//                }
//                System.out.println(this.movable[1].getRow());
//                System.out.println(this.tiles[3][2].getValue());

                break;
            case "left":
            case "a":

                this.movable = act.moveTileLeft(this.tiles,this.movable);
//                this.tiles = act.moveTileLeft(this.tiles);
                break;
            case "right":
            case "d":

                this.movable = act.moveTileRight(this.tiles,this.movable);
//                this.tiles = act.moveTileRight(this.tiles);
                break;
            default:
                System.out.println("Invalid move");
        }
        
    }

    public void choose (){
        System.out.println("Enter the lvl number (1-15): ");
        Level lvl = new Level();
        Board b = new Board();
        PublicFunction p =new PublicFunction();
        boolean test = true;
        Scanner scanner = new Scanner(System.in);
        String l = scanner.nextLine();
        switch (l) {
            case "1":
                b = lvl.lvl1();
                break;
            case "2":
                b = lvl.lvl2();
                break;
            case "3":
                b = lvl.lvl3();
                break;
            case "4":
                b = lvl.lvl4();
                break;
            case "5":
                b = lvl.lvl5();
                break;
            case "6":
                b = lvl.lvl6();
                break;
            case "7":
                b = lvl.lvl7();
                break;
            case "8":
                b = lvl.lvl8();
                break;
            case "9":
                b = lvl.lvl9();
                break;
            case "10":
                b = lvl.lvl10();
                break;
            case "11":
                b = lvl.lvl11();
                break;
            case "12":
                b = lvl.lvl12();
                break;
            case "13":
                b = lvl.lvl13();
                break;
            case "14":
                b = lvl.lvl14();
                break;
            case "15":
                b = lvl.lvl15();
                break;
            default:
                System.out.println("Invalid");
                test = false;
        }

        if(test) {
            this.tiles = b.tiles;
            Tile[] mSorted = p.reverse(p.sortTilesByValues(b.movable));
            this.movable = mSorted;

            this.initialBalls = b.initialBalls;
            this.balls = b.balls;

            System.out.println("initial board: ");
            this.printBoard();
            System.out.println("\n_______________________\n_______________________\n");
        }
        else{
            this.choose();
        }

    }


}

