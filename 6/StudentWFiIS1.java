public class StudentWFiIS1 extends Student implements StudentUSOS {
    private String[] przedmioty;
    private int rok;

    /* IMPLEMETACJA METOD: */

    public StudentWFiIS1(String imie, String nazwisko, int indeks, int rok, String p1, double o1, String p2, double o2, String p3, double o3){
        super(imie,nazwisko,indeks,o1,o2,o3);
        przedmioty = new String[] {p1,p2,p3};
        this.rok=rok;
    }

    @Override
    public String toString(){
        return "["+this.rok+"] " + super.toString();
    }

    @Override
    public double srednia(){
        return super.average();
    }

    @Override
    public void listaPrzedmiotow(){
        for(int i=0; i<przedmioty.length;i++)
            System.out.println("\t"+(i+1)+". "+przedmioty[i]+": "+getGrade(i));
    }
//("Marek", "Styczen", 211150, 5, "Java", 4.5, "Fizyka", 3.0, "Elektronika", 5.0);
}
