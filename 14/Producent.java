public class Producent extends Thread{
    Bufor bufor;

    Producent(Bufor b){
        bufor = b;
    }

    public void run(){
        
            try{
                while(true){
                    Thread.sleep((int)(Math.random() * 10000));
                    bufor.put();
                }
            }catch(InterruptedException e){
                e.printStackTrace();
            }

            bufor.get();
            
        }
}

    

