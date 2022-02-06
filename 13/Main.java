import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        System.out.print("Podaj nazwe pliku do wczytania: ");
        String str="";
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int horizontalPosition =0;
        int depth = 0;
        int aim=0;

        try{
            str = input.readLine();
            str+=".dat";
            
            BufferedReader bufferedReader = Files.newBufferedReader(Paths.get(str));
            String line =null;

            while((line=bufferedReader.readLine())!=null){
                String command = line.split(" ")[0];
                int val = Integer.valueOf(line.split(" ")[1]);
                
                if(command.equals("forward")){
                    horizontalPosition+= val;
                    depth+=aim*val;
                }
                else if(command.equals("down")){
                    aim+=val;
                }
                else if(command.equals("up")){
                    aim-=val;
                }
                else{System.out.println("Nie wiem co zrobic w tym wypadku :(");}
            }
            
            boolean noexist = true;
            String tn ="";

            while(noexist){
                System.out.print("Podaj nazwe pliku do ktorego maja zostac zapisane dane: ");
                str = input.readLine();
                str+=".dat";

                if(Files.exists(Paths.get(str))){
                    System.out.print("Plik o tej nazwie juz istnieje! \n\tCzy chcesz go nadpisac? [T/N] ");
                    tn = input.readLine();

                    if(tn.equals("T") || (tn.toUpperCase()).equals("T")) noexist = false;
                    else if(tn.equals("N") || (tn.toUpperCase()).equals("N")) noexist = true;
                    else System.out.println("Wybrano niepoprawny znak!");

                }
                else noexist = false;

            }
            BufferedWriter bufferedWriter = Files.newBufferedWriter(Paths.get(str));
            bufferedWriter.write("koncowa pozioma pozycja: " + horizontalPosition + "\nKoncowa glebokosc: " + depth);
            // bufferedWriter.flush();

            bufferedWriter.close();
            input.close();
            bufferedReader.close();

        }catch(IOException e){
            System.out.println("Blad przy wczytywaniu pliku lub niepoprawna nazwa pliku!");
            System.exit(1);
        }
    }
}
