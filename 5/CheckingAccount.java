public class CheckingAccount extends BasicAccount{
    private boolean fl = false;
    private int ile_operacji=0;

    CheckingAccount(String imie_nazwisko, double saldo, String pin){
        super(imie_nazwisko, saldo, pin);
    }

    public String toString(){
        return "type: checking account, " +super.toString();
    }

     public void withdraw(double kwota){
        super.withdraw(kwota);
        ile_operacji++;
        if(this.saldo<100.) fl=true;        

    }

    public void deposit(double kwota){
        ile_operacji++;
        super.deposit(kwota);
    }

   public void monthlyUpdate(){ 
        super.monthlyUpdate();
        if(fl==true) this.saldo-=10.0;
        this.saldo-=ile_operacji*0.5;
        this.saldo +=this.saldo*0.02;
    }
}