/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sept14.day2.listonoop;

/**
 *
 * @author admin
 */
public class Student {
    private int studentID;
    private String name;
    private String course;
    
    public Student(int studentID, String name, String course){
        this.studentID = studentID;
        this.name = name;
        this.course = course;
    }
    
    public int getStudentID() {
        return studentID;
    }
    public String getName(){
        return name;
    }
    public String getCourse() {
        return course;
    }
    
    @Override
    public String toString() {
        return "Student ID: " + studentID + "\n Student Name: " + name + "\n Student Course: " + course +"\n";
    }
}
