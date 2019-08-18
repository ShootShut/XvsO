package model;

public class Field {
    public static final int SIZE = 3;
    Type[][] cells = new Type[SIZE][SIZE];


    public enum Type {
        X, O, NONE;

    }

    public void init() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                cells[i][j] = Type.NONE;
            }
        }
    }

    public void showField() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                switch (cells[i][j]) {
                    case X:
                        System.out.print(" X ");
                        break;
                    case O:
                        System.out.print(" O ");
                        break;
                    case NONE:
                        System.out.print(" . ");
                        break;
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    public void shoot(Point point, Type who) {
        cells[point.getX()][point.getY()] = who;
    }

    public Type whoIsWinner() {
        if (checkWin(Type.X)) {
            return Type.X;
        }
        if (checkWin(Type.O)) {
            return Type.O;
        }
        return Type.NONE;
    }

    private boolean checkWin(Type t) {
        if (cells[0][0] == t && cells[1][0] == t && cells[2][0] == t) {
            return true;
        }
        return false;
    }
}
