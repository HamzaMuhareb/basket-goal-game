package structures;

public class Level {
    public Board lvl1() {
        int rr = 3;
        int cc = 3;
        Board myBoard = new Board();

        Tile[][] retrievedTiles =new Tile[rr][cc];
        for (int r = 0; r < rr; r++) {
            for (int c = 0; c < cc; c++) {
                retrievedTiles[r][c] = new Tile(0,r,c);
            }
        }

        Tile[] m = new Tile[2];

        //basket
        m[0] = retrievedTiles[2][1];
        m[0].setValue(4);
        //balls
        m[1] = retrievedTiles[0][1];
        m[1].setValue(3);
        int ib = 1;
        myBoard.setInitialBalls(ib);
        myBoard.setBalls(ib);

        myBoard.setMovable(m);
        myBoard.setTiles(retrievedTiles);

        return myBoard;
    }
    public Board lvl2() {
        int rr = 3;
        int cc = 3;
        Board myBoard = new Board();

        Tile[][] retrievedTiles =new Tile[rr][cc];
        for (int r = 0; r < rr; r++) {
            for (int c = 0; c < cc; c++) {
                retrievedTiles[r][c] = new Tile(0,r,c);
            }
        }

        //walls
        retrievedTiles[2][0].setValue(1);
        retrievedTiles[0][2].setValue(1);

        Tile[] m = new Tile[2];
        //basket
        m[0] = retrievedTiles[1][2];
        m[0].setValue(4);
        //balls
        m[1] = retrievedTiles[1][0];
        m[1].setValue(3);
        int ib = 1;
        myBoard.setInitialBalls(ib);
        myBoard.setBalls(ib);

        myBoard.setMovable(m);
        myBoard.setTiles(retrievedTiles);

        return myBoard;
    }
    public Board lvl3() {
        int rr = 3;
        int cc = 3;
        Board myBoard = new Board();

        Tile[][] retrievedTiles =new Tile[rr][cc];
        for (int r = 0; r < rr; r++) {
            for (int c = 0; c < cc; c++) {
                retrievedTiles[r][c] = new Tile(0,r,c);
            }
        }

        //walls
        retrievedTiles[0][0].setValue(1);
        retrievedTiles[1][2].setValue(1);
        retrievedTiles[2][0].setValue(1);

        Tile[] m = new Tile[2];
        //basket
        m[0] = retrievedTiles[0][1];
        m[0].setValue(4);
        //balls
        m[1] = retrievedTiles[2][1];
        m[1].setValue(3);
        int ib = 1;
        myBoard.setInitialBalls(ib);
        myBoard.setBalls(ib);

        myBoard.setMovable(m);
        myBoard.setTiles(retrievedTiles);

        return myBoard;
    }
    public Board lvl4() {
        int rr = 4;
        int cc = 3;
        Board myBoard = new Board();

        Tile[][] retrievedTiles =new Tile[rr][cc];
        for (int r = 0; r < rr; r++) {
            for (int c = 0; c < cc; c++) {
                retrievedTiles[r][c] = new Tile(0,r,c);
            }
        }

        //walls
        retrievedTiles[0][0].setValue(1);
        retrievedTiles[2][1].setValue(1);

        Tile[] m = new Tile[2];
        //basket
        m[0] = retrievedTiles[2][2];
        m[0].setValue(4);
        //balls
        m[1] = retrievedTiles[2][0];
        m[1].setValue(3);
        int ib = 1;
        myBoard.setInitialBalls(ib);
        myBoard.setBalls(ib);

        myBoard.setMovable(m);
        myBoard.setTiles(retrievedTiles);

        return myBoard;
    }
    public Board lvl5() {
        int rr = 4;
        int cc = 3;
        Board myBoard = new Board();

        Tile[][] retrievedTiles =new Tile[rr][cc];
        for (int r = 0; r < rr; r++) {
            for (int c = 0; c < cc; c++) {
                retrievedTiles[r][c] = new Tile(0,r,c);
            }
        }

        //walls
        retrievedTiles[1][1].setValue(1);
        retrievedTiles[2][2].setValue(1);
        retrievedTiles[3][0].setValue(1);

        Tile[] m = new Tile[3];
        //basket
        m[0] = retrievedTiles[1][2];
        m[0].setValue(4);
        //balls
        m[1] = retrievedTiles[3][2];
        m[1].setValue(3);
        int ib = 1;
        myBoard.setInitialBalls(ib);
        myBoard.setBalls(ib);
        //coins
        m[2] = retrievedTiles[1][0];
        m[2].setValue(2);

        myBoard.setMovable(m);
        myBoard.setTiles(retrievedTiles);

        return myBoard;
    }
    public Board lvl6() {
        int rr = 4;
        int cc = 3;
        Board myBoard = new Board();

        Tile[][] retrievedTiles =new Tile[rr][cc];
        for (int r = 0; r < rr; r++) {
            for (int c = 0; c < cc; c++) {
                retrievedTiles[r][c] = new Tile(0,r,c);
            }
        }

        //walls
        retrievedTiles[0][1].setValue(1);
        retrievedTiles[2][0].setValue(1);
        retrievedTiles[2][2].setValue(1);

        Tile[] m = new Tile[2];
        //basket
        m[0] = retrievedTiles[1][0];
        m[0].setValue(4);
        //balls
        m[1] = retrievedTiles[2][1];
        m[1].setValue(3);
        int ib = 1;
        myBoard.setInitialBalls(ib);
        myBoard.setBalls(ib);

        myBoard.setMovable(m);
        myBoard.setTiles(retrievedTiles);

        return myBoard;
    }
    public Board lvl7() {
        int rr = 4;
        int cc = 3;
        Board myBoard = new Board();

        Tile[][] retrievedTiles =new Tile[rr][cc];
        for (int r = 0; r < rr; r++) {
            for (int c = 0; c < cc; c++) {
                retrievedTiles[r][c] = new Tile(0,r,c);
            }
        }

        //walls
        retrievedTiles[0][0].setValue(1);
        retrievedTiles[1][2].setValue(1);
        retrievedTiles[3][2].setValue(1);

        Tile[] m = new Tile[2];
        //basket
        m[0] = retrievedTiles[2][2];
        m[0].setValue(4);
        //balls
        m[1] = retrievedTiles[3][1];
        m[1].setValue(3);
        int ib = 1;
        myBoard.setInitialBalls(ib);
        myBoard.setBalls(ib);

        myBoard.setMovable(m);
        myBoard.setTiles(retrievedTiles);

        return myBoard;
    }
    public Board lvl8() {
        int rr = 4;
        int cc = 3;
        Board myBoard = new Board();

        Tile[][] retrievedTiles =new Tile[rr][cc];
        for (int r = 0; r < rr; r++) {
            for (int c = 0; c < cc; c++) {
                retrievedTiles[r][c] = new Tile(0,r,c);
            }
        }

        //walls
        retrievedTiles[0][1].setValue(1);
        retrievedTiles[2][1].setValue(1);

        Tile[] m = new Tile[4];
        //basket
        m[0] = retrievedTiles[0][2];
        m[0].setValue(4);
        //balls
        m[1] = retrievedTiles[1][1];
        m[1].setValue(3);
        m[2] = retrievedTiles[3][1];
        m[2].setValue(3);
        int ib = 2;

        //coins
        m[3] = retrievedTiles[2][0];
        m[3].setValue(2);
        myBoard.setInitialBalls(ib);
        myBoard.setBalls(ib);

        myBoard.setMovable(m);
        myBoard.setTiles(retrievedTiles);

        return myBoard;
    }

    public Board lvl9() {
        int rr = 4;
        int cc = 3;
        Board myBoard = new Board();

        Tile[][] retrievedTiles =new Tile[rr][cc];
        for (int r = 0; r < rr; r++) {
            for (int c = 0; c < cc; c++) {
                retrievedTiles[r][c] = new Tile(0,r,c);
            }
        }

        //walls
        retrievedTiles[0][1].setValue(1);
        retrievedTiles[2][0].setValue(1);
        retrievedTiles[3][0].setValue(1);
        retrievedTiles[3][2].setValue(1);

        Tile[] m = new Tile[4];
        //basket
        m[0] = retrievedTiles[0][0];
        m[0].setValue(4);
        //balls
        m[1] = retrievedTiles[1][0];
        m[1].setValue(3);
        m[2] = retrievedTiles[1][1];
        m[2].setValue(3);
        m[3] = retrievedTiles[1][2];
        m[3].setValue(3);
        int ib = 3;
        myBoard.setInitialBalls(ib);
        myBoard.setBalls(ib);

        myBoard.setMovable(m);
        myBoard.setTiles(retrievedTiles);

        return myBoard;
    }

    public Board lvl10() {
        int rr = 4;
        int cc = 3;
        Board myBoard = new Board();

        Tile[][] retrievedTiles =new Tile[rr][cc];
        for (int r = 0; r < rr; r++) {
            for (int c = 0; c < cc; c++) {
                retrievedTiles[r][c] = new Tile(0,r,c);
            }
        }

        //walls
        retrievedTiles[0][2].setValue(1);
        retrievedTiles[1][0].setValue(1);
        retrievedTiles[2][2].setValue(1);
        retrievedTiles[3][0].setValue(1);

        Tile[] m = new Tile[2];
        //basket
        m[0] = retrievedTiles[1][2];
        m[0].setValue(4);
        //balls
        m[1] = retrievedTiles[2][0];
        m[1].setValue(3);
        int ib = 1;
        myBoard.setInitialBalls(ib);
        myBoard.setBalls(ib);

        myBoard.setMovable(m);
        myBoard.setTiles(retrievedTiles);

        return myBoard;
    }

    public Board lvl11() {
        int rr = 4;
        int cc = 4;
        Board myBoard = new Board();

        Tile[][] retrievedTiles =new Tile[rr][cc];
        for (int r = 0; r < rr; r++) {
            for (int c = 0; c < cc; c++) {
                retrievedTiles[r][c] = new Tile(0,r,c);
            }
        }

        //walls
        retrievedTiles[1][1].setValue(1);
        retrievedTiles[2][0].setValue(1);
        retrievedTiles[2][3].setValue(1);
        retrievedTiles[3][2].setValue(1);

        Tile[] m = new Tile[3];
        //basket
        m[0] = retrievedTiles[2][1];
        m[0].setValue(4);
        //balls
        m[1] = retrievedTiles[2][2];
        m[1].setValue(3);
        int ib = 1;
        myBoard.setInitialBalls(ib);
        myBoard.setBalls(ib);
        //coins
        m[2] = retrievedTiles[1][2];
        m[2].setValue(2);

        myBoard.setMovable(m);
        myBoard.setTiles(retrievedTiles);

        return myBoard;
    }

    public Board lvl12() {
        int rr = 4;
        int cc = 4;
        Board myBoard = new Board();

        Tile[][] retrievedTiles =new Tile[rr][cc];
        for (int r = 0; r < rr; r++) {
            for (int c = 0; c < cc; c++) {
                retrievedTiles[r][c] = new Tile(0,r,c);
            }
        }

        //walls
        retrievedTiles[0][1].setValue(1);
        retrievedTiles[0][2].setValue(1);
        retrievedTiles[1][1].setValue(1);
        retrievedTiles[1][2].setValue(1);
        retrievedTiles[3][0].setValue(1);
        retrievedTiles[3][3].setValue(1);

        Tile[] m = new Tile[2];
        //basket
        m[0] = retrievedTiles[0][0];
        m[0].setValue(4);
        //balls
        m[1] = retrievedTiles[0][3];
        m[1].setValue(3);
        int ib = 1;
        myBoard.setInitialBalls(ib);
        myBoard.setBalls(ib);

        myBoard.setMovable(m);
        myBoard.setTiles(retrievedTiles);

        return myBoard;
    }

    public Board lvl13() {
        int rr = 4;
        int cc = 4;
        Board myBoard = new Board();

        Tile[][] retrievedTiles =new Tile[rr][cc];
        for (int r = 0; r < rr; r++) {
            for (int c = 0; c < cc; c++) {
                retrievedTiles[r][c] = new Tile(0,r,c);
            }
        }

        //walls
        retrievedTiles[0][0].setValue(1);
        retrievedTiles[1][1].setValue(1);
        retrievedTiles[0][3].setValue(1);
        retrievedTiles[2][3].setValue(1);
        retrievedTiles[3][0].setValue(1);

//        testing to see if the algorithm will solve an impossible level
//        retrievedTiles[1][2].setValue(1);

        Tile[] m = new Tile[4];
        //basket
        m[0] = retrievedTiles[0][1];
        m[0].setValue(4);
        //balls
        m[1] = retrievedTiles[1][0];
        m[1].setValue(3);
        m[2] = retrievedTiles[3][3];
        m[2].setValue(3);
        int ib = 2;
        myBoard.setInitialBalls(ib);
        myBoard.setBalls(ib);
        //coins
        m[3] = retrievedTiles[2][0];
        m[3].setValue(2);

        myBoard.setMovable(m);
        myBoard.setTiles(retrievedTiles);

        return myBoard;
    }

    public Board lvl14() {
        int rr = 4;
        int cc = 4;
        Board myBoard = new Board();

        Tile[][] retrievedTiles =new Tile[rr][cc];
        for (int r = 0; r < rr; r++) {
            for (int c = 0; c < cc; c++) {
                retrievedTiles[r][c] = new Tile(0,r,c);
            }
        }

        //walls
        retrievedTiles[0][3].setValue(1);
        retrievedTiles[1][1].setValue(1);
        retrievedTiles[1][2].setValue(1);
        retrievedTiles[3][3].setValue(1);

        Tile[] m = new Tile[3];
        //basket
        m[0] = retrievedTiles[1][0];
        m[0].setValue(4);
        //balls
        m[1] = retrievedTiles[1][3];
        m[1].setValue(3);
        int ib = 1;
        myBoard.setInitialBalls(ib);
        myBoard.setBalls(ib);
        //coins
        m[2] = retrievedTiles[2][3];
        m[2].setValue(2);

        myBoard.setMovable(m);
        myBoard.setTiles(retrievedTiles);

        return myBoard;
    }

    public Board lvl15() {
        int rr = 4;
        int cc = 4;
        Board myBoard = new Board();

        Tile[][] retrievedTiles =new Tile[rr][cc];
        for (int r = 0; r < rr; r++) {
            for (int c = 0; c < cc; c++) {
                retrievedTiles[r][c] = new Tile(0,r,c);
            }
        }

        //walls
        retrievedTiles[0][2].setValue(1);
        retrievedTiles[0][3].setValue(1);
        retrievedTiles[1][0].setValue(1);
        retrievedTiles[2][0].setValue(1);
        retrievedTiles[3][0].setValue(1);
        retrievedTiles[2][3].setValue(1);

        Tile[] m = new Tile[2];
        //basket
        m[0] = retrievedTiles[3][3];
        m[0].setValue(4);
        //balls
        m[1] = retrievedTiles[0][0];
        m[1].setValue(3);
        int ib = 1;
        myBoard.setInitialBalls(ib);
        myBoard.setBalls(ib);

        myBoard.setMovable(m);
        myBoard.setTiles(retrievedTiles);

        return myBoard;
    }

//    hamza test levels.................................................................................................
/*
    public Board lvl1h() {
        int rr =5;
        int cc = 5;
        Board myBoard = new Board();

        Tile[][] retrievedTiles =new Tile[rr][cc];
        for (int r = 0; r < rr; r++) {
            for (int c = 0; c < cc; c++) {
                if (c == 2) {
                    retrievedTiles[r][c] = new Tile(0,r,c);
                }
                else {retrievedTiles[r][c] = new Tile(1,r,c);}}
        }
//        retrievedTiles[0][2].setValue(2);
        Tile[] m = new Tile[2];
        m[1] = retrievedTiles[0][2];
        m[1].setValue(3);

//        retrievedTiles[4][2].setValue(3);
        m[0] = retrievedTiles[3][2];
        m[0].setValue(4);
        myBoard.setMovable(m);
        myBoard.setTiles(retrievedTiles);

        return myBoard;
    }
    public Board lvl2h() {
        int rr =5;
        int cc = 5;
        Board myBoard = new Board();

        Tile[][] retrievedTiles =new Tile[rr][cc];
        for (int r = 0; r < rr; r++) {
            for (int c = 0; c < cc; c++) {
                if (r == 2||(c==0&&r>2)||(c==4&&r<2)) {
                    retrievedTiles[r][c] = new Tile(0,r,c);
                }
                else {retrievedTiles[r][c] = new Tile(1,r,c);}}
        }
        Tile[] m = new Tile[2];
        m[1] = retrievedTiles[0][4];
        m[1].setValue(3);

        m[0] = retrievedTiles[4][0];
        m[0].setValue(4);
        myBoard.setMovable(m);


        myBoard.setTiles(retrievedTiles);
        return myBoard;
    }
    public Board lvl3h() {
        int rr =7;
        int cc = 7;
        Board myBoard = new Board();

        Tile[][] retrievedTiles =new Tile[rr][cc];
        for (int r = 0; r < rr; r++) {
            for (int c = 0; c < cc; c++) {
                if (r %3== 2||c %4== 1) {
                    retrievedTiles[r][c] = new Tile(0,r,c);
                }
                else {retrievedTiles[r][c] = new Tile(1,r,c);}}
        }

        Tile[] m = new Tile[2];
        m[1] = retrievedTiles[0][4];
        m[1].setValue(3);

        m[0] = retrievedTiles[4][0];
        m[0].setValue(4);
        myBoard.setMovable(m);

        retrievedTiles[6][5].setValue(1);
        retrievedTiles[5][0].setValue(1);

        myBoard.setTiles(retrievedTiles);
        return myBoard;
    }
    public Board lvl4h() {
        int rr =7;
        int cc = 9;
        Board myBoard = new Board();

        Tile[][] retrievedTiles =new Tile[rr][cc];
        for (int r = 0; r < rr; r++) {
            for (int c = 0; c < cc; c++) {
                if ((r == 0&&c <5)||(r==4&&c<2)||(r>4&&c == 1)||(r == 0 && c<3)||(r == 5 && c>0)
                        ||(r <2 && c == 0)||(r ==2)||(r >2 &&r<6 && c == 8)) {
                    retrievedTiles[r][c] = new Tile(0,r,c);
                }
                else {retrievedTiles[r][c] = new Tile(1,r,c);}}
        }

        Tile[] m = new Tile[2];
        m[1] = retrievedTiles[0][4];
        m[1].setValue(3);

        m[0] = retrievedTiles[4][0];
        m[0].setValue(4);
        myBoard.setMovable(m);

        myBoard.setTiles(retrievedTiles);
        return myBoard;
    }
    public Board lvl5h() {
        int rr =5;
        int cc = 5;
        Board myBoard = new Board();

        Tile[][] retrievedTiles =new Tile[rr][cc];
        for (int r = 0; r < rr; r++) {
            for (int c = 0; c < cc; c++) {
                if (c == 2) {
                    retrievedTiles[r][c] = new Tile(0,r,c);
                }
                else {retrievedTiles[r][c] = new Tile(1,r,c);}}
        }
//        retrievedTiles[0][2].setValue(2);
        Tile[] m = new Tile[3];
        m[1] = retrievedTiles[0][2];
        m[1].setValue(3);

        m[2] = retrievedTiles[1][2];
        m[2].setValue(2);

//        retrievedTiles[4][2].setValue(3);
        m[0] = retrievedTiles[3][2];
        m[0].setValue(4);
        myBoard.setMovable(m);
        myBoard.setTiles(retrievedTiles);
        return myBoard;
    }
*/

}
