package Encapsulation.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String full_name , registration, course;
        int yearOfAdmission;
        ArrayList<Student> S = new ArrayList<>();

        for(int i = 0; i < 3; i++){
            System.out.print("Full name: ");
            full_name = scanner.nextLine();
            System.out.print("Registration: ");
            registration = scanner.nextLine();
            System.out.print("Course: ");
            course = scanner.nextLine();
            System.out.print("Year of Admission: ");
            yearOfAdmission = scanner.nextInt();
            if(yearOfAdmission > 0){
                scanner.nextLine();
            }
           S = Student.CreateData(full_name, registration, course, yearOfAdmission);
        }
        Student.PrintData(S);
    }
}
