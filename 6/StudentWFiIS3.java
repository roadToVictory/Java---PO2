public class StudentWFiIS3 extends Student {
    private StudentUSOS stud;

    /* IMPLEMETACJA METOD: */

    public StudentWFiIS3(String imie, String nazwisko, int indeks, int rok, String p1, double o1, String p2, double o2, String p3, double o3){
        super(imie,nazwisko,indeks,o1,o2,o3);
        
        stud = new StudentUSOS(){
            
            @Override
            public String toString(){
                return "["+rok+"] ";
            }

            @Override
            public double srednia(){
                return average();
            }

            @Override
            public void listaPrzedmiotow(){
                System.out.println("\t1. "+p1 + ": "+o1);
                System.out.println("\t2. "+p2 + ": "+o2);
                System.out.println("\t3. "+p3 + ": "+o3);
            }
        };
    }

    public double srednia(){
        return stud.srednia();
    }

    public void listaPrzedmiotow(){
        stud.listaPrzedmiotow();
    }

    public String toString(){
        return stud.toString() + super.toString();
    }
  
   
}

