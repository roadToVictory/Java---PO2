import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
       Bufor b = new Bufor(2);
       new Producent(b).start();
       new Consumer(b).start();
       new Consumer(b).start();
       new Producent(b).start();
       new Producent(b).start();
       new Producent(b).start();
       new Producent(b).start();
       new Consumer(b).start();
       new Consumer(b).start();
       new Producent(b).start();
       new Producent(b).start();
       new Producent(b).start();
       new Producent(b).start();
       new Consumer(b).start();
       new Consumer(b).start();
       new Producent(b).start();
       new Producent(b).start();
       new Producent(b).start();
       new Producent(b).start();
       new Consumer(b).start();
       new Consumer(b).start();
       new Producent(b).start();
       new Producent(b).start();
       new Producent(b).start();
       new Consumer(b).start();
       new Consumer(b).start();
       new Consumer(b).start();
       new Consumer(b).start();
       new Consumer(b).start();
       new Consumer(b).start();
       new Consumer(b).start();
       new Consumer(b).start();
       new Consumer(b).start();
       new Consumer(b).start();
       new Consumer(b).start();
       new Consumer(b).start();
    }
}

