import  java.util.*;

public class Board {

    public char[][] board;
    private final int nx;
    private final int ny;
    private final double p;

    private int curX;
    private int curY;
    private final int finishX;
    private final int finishY;


    Board(int nx, int ny, double p){
        board = new char [nx][ny];
        this.nx = nx;
        this.ny = ny;
        this.p=p;

        this.curX = nx-2;
        this.curY = 1;

        this.finishY = ny/2;
        this.finishX = 0;

        Random rnd = new Random();
        double pr;
        for(int x=0; x<nx;x++)
            for(int y=0; y<ny; y++)
                board[x][y]='X';

        for(int x=1; x<nx-1;x++){
            for(int y=1; y<ny-1; y++){
                pr = rnd.nextDouble();
                if(pr<p)
                    board[x][y]=' ';
            }
        }
        board[0][ny/2]=' ';
        board[nx-2][1]='o';
    }

    public void printBoard(){
        for(int x=0; x<nx;x++){
            for(int y=0; y<ny; y++){
                System.out.print(board[x][y]);
            }
            System.out.println();
        }
    }

    public void makeStep(Direction dir) {
        if(board[curX+dir.getX()][curY+dir.getY()]!='X' ) {
            board[curX][curY] = ' ';
            curX += dir.getX();
            curY += dir.getY();
            board[curX][curY] = 'o';
        }
        else {
            System.out.println("Nie mozna wykonac takiego ruchu! ");
        }
    }

    public void resetBoard(){
        curX = nx-2;
        curY = 1;
        this.printBoard();
    }

    public boolean checkWin() {
        return board[curX][curY] == board[finishX][finishY];
    }

}