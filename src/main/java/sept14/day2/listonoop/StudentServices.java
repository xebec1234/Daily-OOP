/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sept14.day2.listonoop;

/**
 *
 * @author admin
 */

import java.util.*;

public class StudentServices {
    private List<Student> students = new ArrayList<>();
    
    public void addStudent(Student student) {
        students.add(student);
    }
    
    public List<Student> getAllStudents() {
        return students;
    }
    
    public Student findById(int studentID) {
        for (Student stud: students) {
            if (stud.getStudentID() == studentID) {
                return stud;
            }
        }
        return null;
    }
    
    public boolean removeStudent(int studentID) {
            return students.removeIf(stud -> stud.getStudentID() == studentID);
    }
}
