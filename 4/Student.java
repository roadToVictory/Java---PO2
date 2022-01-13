import java.util.*;
import java.util.Arrays;

public class Student{

    private String imie;
    private String nazwisko;
    private int indeks;
    private double[] oceny;


    private Student(String im, String naz, int ind, double[] oc){
        this.imie=im;
        this.nazwisko=naz;
        this.indeks=ind;
        this.oceny =oc;
    }

    
    public static class Builder{
        private String imie;
        private String nazwisko;
        private int indeks;
        private double[] oceny = new double[0];

        public Builder firstName(String imie){
            this.imie=imie;
            return this;
        }

        public Builder lastName(String nazwisko){
            this.nazwisko=nazwisko;
            return this;
        }

        public Builder indexNumber(int ind){
            this.indeks=ind;
            return this;
        }


        public Builder grade(double o){
            double[] temp = oceny;
            oceny = new double[temp.length + 1];
            for (int i = 0; i < temp.length; i++) {
                oceny[i] = temp[i];
            }
            oceny[temp.length] = o;

            return this;
        }

        public Student build(){
            if(this.imie==null){
                System.out.println("Name is required!"); //uzupelnic!
                return null;
            }
            else if (this.nazwisko==null){
                System.out.println("Last name is required!"); //uzupelnic!
                return null;
            }
            else if (this.indeks==0){
                System.out.println("Indeks is required!"); //uzupelnic!
                return null;
            }
            return new Student(this.imie,this.nazwisko, this.indeks, this.oceny);
        }
    }

    public String toString(){
        String result = imie+" "+nazwisko+"("+indeks+")";
        
        if(oceny.length!=0){
            result+=" - ";
            for(int i=0; i<oceny.length; i++){result+=oceny[i]+" ";}
        }
        return result;
    }

    public boolean equals(Object obj){
        if (obj == null)
            return false;
        if (obj == this)
            return true;
        if (!obj.getClass().equals(this.getClass()))
            return false;

        Student tmp = (Student) obj;

        if(imie.equals(tmp.imie) && nazwisko.equals(tmp.nazwisko) && indeks==tmp.indeks && Arrays.compare(this.oceny, tmp.oceny)==0 )
            return true;
        else return false;
    }

    public final double[] getGrades(){
        double[] tmp=new double[oceny.length];
        for(int i=0; i<oceny.length; i++)
            tmp[i]=oceny[i];
        
        return tmp;
    }
}