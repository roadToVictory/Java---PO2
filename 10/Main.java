import java.lang.reflect.*;
import java.util.Arrays;
import java.lang.Class;

public class Main {
    public static String[] splitArgs(String arg) {
        return Arrays.stream(arg.split("[\\s+(),]")).filter(w -> w.isEmpty() == false).toArray(String[]::new);
    }

    public static void main(String[] args) {
        try{
            String[] split = splitArgs(args[0]);
            //  for(String a: split)
            //      System.out.println(a);

            if(split.length>1 && split.length<=3){
                try{
                    Class<?> maths = Class.forName("java.lang.Math");
                    var parameterTypes = new Class[split.length-1];
                    for(int i=0; i<split.length-1; i++)
                        parameterTypes[i] = double.class;
                    
                    double[] values = new double[split.length-1];
                    for(int i=0; i<split.length-1;i++)
                        values[i] = Double.parseDouble(split[i+1]);
                
                    Method m = maths.getMethod(split[0], parameterTypes);
                        
                    if(m.getParameterCount()==1)
                        System.out.println(args[0] + " = " + m.invoke(null, values[0]));

                    if(m.getParameterCount()==2)
                        System.out.println(args[0] + " = " + m.invoke(null, values[0], values[1]));
                
                }catch(NoSuchMethodException e){
                    System.out.println("Nie znaleziono takiej funkcji!");
                }catch(NumberFormatException e){
                    System.out.println("Argumentami funkcji musza byc liczby!");
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            }
            else{System.out.println("Niepoprawna ilosc argumentow! Podaj jedna lub dwie liczby.");}
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Nie podano nic do obliczenia!\n Poprawne wywolanie programu: java Main \"nazwa_funkcji(argumenty)\"");
        }
    }
}
