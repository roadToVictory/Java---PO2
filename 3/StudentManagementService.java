import java.util.*;

public class StudentManagementService {
    private ArrayList<Student> listaS = new ArrayList<Student>();

    public void addStudent(Student s){
        if(listaS.contains(s)){
            System.out.println("Student is already in database!");
            return;
        }
        listaS.add(s);
    }

    public void removeStudent(Student s){
        if(listaS.contains(s))
            listaS.remove(s);
        else System.out.println("Student is not exist in database!");
    }

    public void printAllStudents(){
        System.out.println("***Students***");
        for(int i=0; i<listaS.size(); i++)
            System.out.println(listaS.get(i));
    }

    public Student findStudentWithTheHighestAverage(){
        double avr = listaS.get(0).getAverage();
        Student best = listaS.get(0);
       /*  //1. Iterator -> szybsze(ale niezauwazalne przy takiej ilosci danych :< ) ale bardziej skomplikowane
        Iterator<Student> it = listaS.iterator();
        while(it.hasNext()){
            Student tmp = it.next();    //trzeba przechowywac tutaj referencje do obiektu
            double tmp_avr = tmp.getAverage();
            if(tmp_avr > avr){
                avr = tmp_avr;
                best = tmp;
            }
        }
        */ 

        //2. for-each 
        for(Student s:listaS){
            if(s.getAverage()>avr){
                avr = s.getAverage();
                best = s;
            }
        }

        return best;
    }
}