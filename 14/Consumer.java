public class Consumer extends Thread{
    Bufor bufor;

    Consumer(Bufor b){
        bufor = b;
    }

    public void run(){
        
            try{
                while(true){
                    Thread.sleep((int)(Math.random() * 10000));
                    bufor.get();
                }
            }catch(InterruptedException e){
                e.printStackTrace();
            } 
        

           
    }


}
