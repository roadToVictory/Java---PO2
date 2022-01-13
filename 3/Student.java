import java.util.*;

public class Student {
    private String imie;
    private String nazwisko;
    private int indeks;
    private String email;
    ArrayList<Double> oceny = new ArrayList<Double>();


    Student(int ind, String im, String nazw){
        this.indeks=ind;
        this.imie=im;
        this.nazwisko=nazw;
    }

    String getImie(){return imie;}
    String getNazwisko(){return nazwisko;}
    String getEmail(){return email;}
    void setEmail(String mail){
        this.email=mail;
    }

    public String toString(){
        if(!oceny.isEmpty())
            return (getImie()+" "+nazwisko+" ("+indeks+") " + oceny);
        else return (getImie()+" "+nazwisko+" ("+indeks+")");
    }

    public boolean equals(Object obj){
        if(obj==null) return false;
        if(obj==this) return true;
        if(!obj.getClass().equals(this.getClass())) return false;

        Student student = (Student)obj;
        if(this.imie.equals(student.imie) && this.nazwisko.equals(student.nazwisko) && this.indeks==student.indeks && this.oceny.equals(student.oceny) && this.oceny!=null && student.oceny!=null)
            return true;
        else return false;
    }

    void addGrade(double oc){
        oceny.add(oc);
    }

    double getAverage(){
        double suma = 0.0;
        for(int i=0; i<oceny.size(); i++)
            suma+=oceny.get(i);
        
        return suma/oceny.size();
    }

}