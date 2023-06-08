package Encapsulation.Student;

import java.util.ArrayList;

public class Student {
    private String full_name;
    private String registration;
    private String course;
    private int yearOfAdmission;

    public static ArrayList<Student> S = new ArrayList<>();
    Student(String full_name, String registration, String course, int yearOfAdmission){
        this.setFullName(full_name);
        this.setRegistration(registration);
        this.setCourse(course);
        this.setYearOfAdmission(yearOfAdmission);
    }

    public void setFullName(String full_name){
        this.full_name = full_name;
    }
    public void setRegistration(String registration){
        this.registration = registration;
    }
    public void setCourse(String course){
        this.course = course;
    }
    public void setYearOfAdmission(int yearOfAdmission){
        this.yearOfAdmission = yearOfAdmission;
    }
    public String getFullName(){
        return this.full_name;
    }
    public String getRegistration(){
        return this.registration;
    }
    public String getCourse(){
        return this.course;
    }
    public int getYearOfAdmission(){
        return this.yearOfAdmission;
    }

    public static ArrayList<Student> CreateData(String full_name, String registration, String course, int yearOfAdmission){
        S.add(new Student(full_name, registration, course, yearOfAdmission));
        return S;
    }
    public static void PrintData(ArrayList<Student> students){
        for(Student student : students){
            System.out.printf(
                "Full Name: " + student.getFullName() +  "\n" +
                "Registration: " + student.getRegistration() + "\n" +
                "Course: " + student.getCourse() + "\n" +
                "Year of Admission: " + student.getYearOfAdmission() + "\n") ;
        }
    }
}
