public class RegularAccount extends BasicAccount{
    private boolean fl = false;
    
    RegularAccount(String imie_nazwisko, double saldo, String pin){
        super(imie_nazwisko, saldo, pin);
    }

    public String toString(){
        return "type: regular account, "+super.toString();
    }

    public void monthlyUpdate(){
        super.monthlyUpdate();
        if(fl==true) this.saldo-=10.0;
    }

    public void withdraw(double kwota){
        super.withdraw(kwota);

        if(this.saldo<500.) fl=true;        

    }
}