package Encapsulation.Student;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args){
        ArrayList<Student> S = new ArrayList<>(List.of(new Student("Ronaldo", "2020", "BTI", 2020)));
        S.add(new Student("Maria", "2019", "CeT", 2019));

        for (Student student : S) {
            System.out.printf(student.getFullName() + " " + student.getRegistration() + " " + student.getCourse() + " " + student.getYearOfAdmission());
            System.out.println();
        }
    }
}
