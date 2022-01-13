import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        if(args.length!=3){
            System.out.println("Niepoprawne wywolanie!\n \tPodaj 3 parametry.");
            return;
        }


        int nx = Integer.parseInt(args[1]);
        int ny = Integer.parseInt(args[0]);
        double p = Double.parseDouble(args[2]);

        Board gameBoard = new Board(nx, ny, p);
        System.out.println("Dostępne opcje: ");
        System.out.println(Option.RESET + "\n" + Option.LEFT + "\n" + Option.RIGHT+ "\n" + Option.UP + "\n" + Option.DOWN + "\n" + Option.EXIT + "\n");
        System.out.println();
//        gameBoard.printBoard();

        Scanner sc = new Scanner(System.in);
        char znak=' ';
        System.out.print("Wybierz opcje: ");

            while (znak!='q') {
                System.out.println();
                gameBoard.printBoard();
                if(gameBoard.checkWin()){ System.out.println("Wygrales!"); return;}
                System.out.print("Wybierz opcje: ");

                    znak = sc.next().charAt(0);
                    switch (znak) {
                        case 'r':
                            gameBoard = new Board(nx,ny,p);
                            gameBoard.resetBoard();
                            System.out.println();
                            break;
                        case 'a':
                            gameBoard.makeStep(Direction.DOWN);
                            System.out.println();
                            break;
                        case 'd':
                            gameBoard.makeStep(Direction.UP);
                            System.out.println();
                            break;
                        case 'w':
                            gameBoard.makeStep(Direction.LEFT);
                            System.out.println();
                            break;
                        case 's':
                            gameBoard.makeStep(Direction.RIGHT);
                            System.out.println();
                    }
                }
        sc.close();
        System.out.println("Koniec gry");
    }

}