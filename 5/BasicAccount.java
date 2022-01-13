import java.lang.Math;

public abstract class BasicAccount{
    protected String dane;
    protected double saldo;
    protected String pin;

    BasicAccount(String imie_nazwisko, double saldo, String pin){
        this.dane=imie_nazwisko;
        this.saldo=saldo;
        this.pin=pin;
    }

    public void withdraw(double kwota){
        if(kwota<=this.saldo || kwota<0)
            this.saldo-=kwota;
        else System.out.println("Niewystarczajaca liczba pieniedzy lub zla kwota!");

    }

     public double getBalance(){
        return this.saldo;
    }

    public void deposit(double kwota){
        if(kwota<0)
            System.out.println("Zla kwota!");
        else this.saldo+=kwota;
    }

    public void monthlyUpdate(){
        this.saldo-= Math.min(10., 0.1*this.saldo );
    }

    public String getDane(){return this.dane;}

    public String toString(){
        return "owner: "+this.dane+", balance "+saldo;
    }

     public boolean verifyPin(String pinCheck){
        if(this.pin.equals(pinCheck))
            return true;
        return false;
     }

     public boolean equals(Object obj){
        if(obj==null) return false;
        if(obj==this) return true;
        if(!obj.getClass().equals(this.getClass())) return false;

        BasicAccount tmp = (BasicAccount)obj;

        if(this.dane.equals(tmp.dane) && this.pin==tmp.pin  && this.saldo == tmp.saldo) //sprawdzenie podstawowych danych
            return true;
        return false;
        
    }
}