public class StudentWFiIS2 implements StudentUSOS {
    private String[] przedmioty;
    private int rok;
    private Student stud;

    /* IMPLEMETACJA METOD: */

    public StudentWFiIS2(String imie, String nazwisko, int indeks, int rok, String p1, double o1, String p2, double o2, String p3, double o3){
        stud=new Student(imie, nazwisko, indeks, o1,o2,o3);
        przedmioty = new String[] {p1,p2,p3};
        this.rok=rok;
    }

    @Override
    public String toString(){
        return "["+this.rok+"] " + stud.toString();
    }

    @Override
    public double srednia(){
        return stud.average();
    }

    @Override
    public void listaPrzedmiotow(){
        for(int i=0; i<przedmioty.length;i++)
            System.out.println("\t"+(i+1)+". "+przedmioty[i]+": "+stud.getGrade(i));
    }

}
