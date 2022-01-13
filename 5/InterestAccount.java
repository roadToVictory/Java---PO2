public class InterestAccount extends BasicAccount{


    InterestAccount(String imie_nazwisko, double saldo, String pin){
        super(imie_nazwisko, saldo, pin);
    }

    public String toString(){
        return "type: interest account, " +super.toString();
    }

    public void monthlyUpdate(){
        super.monthlyUpdate();
        this.saldo +=this.saldo*0.02;
    }
    
}