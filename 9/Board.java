import  java.util.*;

public class Board {

    public char[][] board;
    private final int x;

    private int curX;
    private int curY;


    Board(int nx, double p){
        board = new char [nx][nx];
        this.x = nx;

//pozyzcja startowa
        this.curX = nx-2;  
        this.curY = 1;

        Random rnd = new Random();
        double pr;
       

        for(int i=0; i<x;i++){
            for(int j=0; j<x; j++){
                pr = rnd.nextDouble();
                if(pr<p)
                    board[i][j]='X';
                else board[i][j] = ' ';
            }
        }
        board[x-2][1]='o';  //ustawienie pozycji startowej
    }

    public void printBoard(){
        for(int i=0; i<x;i++){
            for(int j=0; j<x; j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    public void makeStep(Direction dir){
        try{
            if(board[curX+dir.getX()][curY+dir.getY()]!='X' ) {
                board[curX][curY] = ' ';
                curX += dir.getX();
                curY += dir.getY();
                board[curX][curY] = 'o';
            }
            else
                throw new WallException("Nie mozesz wejsc na pole 'X'!");
        
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Probujesz wyjsc poza plansze!");
        }catch(WallException e){
            System.out.println(e.getMessage());
        }
       
    }

    public void resetBoard(){
        curX = x-2;
        curY = 1;
        this.printBoard();
    }

}