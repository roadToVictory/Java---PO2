public class EmailService {

    void generateEmailForStudent(Student s, String fac){
        s.setEmail(s.getImie()+"."+ s.getNazwisko()+"@"+fac+".pl");
    }
}