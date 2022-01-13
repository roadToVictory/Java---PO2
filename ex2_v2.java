import java.util.Random;

public class ex2_v2 {
    public static void main(String[] args) {

        try {
            int n = Integer.parseInt(args[0]);
            int min = Integer.parseInt(args[1]);
            int max = Integer.parseInt(args[2]);

            System.out.println("Input arguments: n=" + n + " min=" + min + ", max=" + max);
            float positive = 0f;  //wtedy nie trzeba rzutowac przy obliczaniu stosunku
            Random r = new Random(); //obiekt klasy Random do losowania liczb

            int min_s=max, max_s=min;

            for (int i = 0; i < n; i++) {
                int a = r.nextInt(max + 1 - min) + min;
                System.out.println(a);
                if (a > 0) positive++;
                if (a > max_s) max_s = a;
                if (a < min_s) min_s = a;
            }
            System.out.println("Positive/negative=" + positive / (n - positive) + " minVal=" + min_s + ", maxVal=" + max_s);
        }
        catch (Exception exception){
            System.out.println("Poprawne uruchomienie: java ex2_v2 <ilosc> <min> <max>");
        }
    }
}

