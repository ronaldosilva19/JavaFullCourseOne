package Encapsulation.Student;

public class Student {
    private String full_name;
    private String registration;
    private String course;
    private int yearOfAdmission;

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
}
