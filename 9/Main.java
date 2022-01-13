import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int x=0;
        
       
        while(x<2){
            System.out.println("Podaj rozmiar planszy:");
            try{
                x = SystemInWrapper.sc.nextInt();

                if(x<2)
                    throw new ArithmeticException("BLAD: Zbyt mala wartosc nx: "+x+"!");
            }
            catch(InputMismatchException e){
                System.out.println("BLAD: Podaj liczbe calkowita!");
                SystemInWrapper.sc.nextLine();
            } 
            catch (ArithmeticException e){
                System.out.println(e.getMessage());    
                SystemInWrapper.sc.nextLine();
            }
        }

        Board gameBoard = new Board(x,0.3);
        System.out.println("Dostępne opcje: ");
        System.out.println(Option.RESET + "\n" + Option.LEFT + "\n" + Option.RIGHT+ "\n" + Option.UP + "\n" + Option.DOWN + "\n" + Option.EXIT + "\n");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        char znak = ' ';
        System.out.print("Wybierz opcje: \n\n");

        while(znak!='q'){
            
            gameBoard.printBoard();
        try{
            System.out.println();
            znak = sc.next().charAt(0);
            System.out.println("\n----------------------------");
            switch (znak) {
                case 'r':
                    gameBoard = new Board(x,0.3);
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
                    break;
                default:
                    if(znak!='q')
                        throw new OptionNotRecognizedException("Podano: " + znak+"!\t Brak takiej opcji w menu!");

            }
             }catch (OptionNotRecognizedException e){
                System.out.println(e.getMessage());}
    
        }
        sc.close();
    }


     

}
