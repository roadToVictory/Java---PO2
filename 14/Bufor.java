public class Bufor {
    private int capacity;
    private int size;

    public Bufor(int cap){
        this.capacity = cap;
        this.size=0;
    }

    synchronized void get(){
       
        System.out.println("Rozpoczynam wyjmowanie - "+ Thread.currentThread());
        while(size==0){
            System.out.println("Bufor pusty. Czekam na dodanie elementu...");
            try{
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        
        size--;
        System.out.println("Zabrano element z bufora. Zajetosc: "+size+"/"+capacity);
        notifyAll();
        

        
    }

    synchronized void put(){
        System.out.println("Rozpoczynam dodawanie elementu do bufora. Producent: "+ Thread.currentThread());
        while(size>=capacity){
            System.out.println("Bufor pełny. Czekam na zabranie elementu...");
            try{
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        size++;
        System.out.println("Dodano element do bufora. Zajetosc: "+size+"/"+capacity);
        notifyAll();

    }
}
