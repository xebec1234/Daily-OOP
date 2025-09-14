/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sept14.day2.listonoop;

/**
 *
 * @author admin
 */
import java.util.Scanner;
public class ListOnOOP {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        StudentServices service = new StudentServices();
        
        service.addStudent(new Student(1, "Manuel", "Computer Science"));
        service.addStudent(new Student(2, "Raine", "Hospitality Management"));
        service.addStudent(new Student(3, "Baluga", "Computer Science"));
        System.out.println("All Student");
        for(Student stud: service.getAllStudents()){
            System.out.println(stud);
        }
        
        System.out.print("Find Student Using ID: ");
        int findStud = input.nextInt();
        Student found = service.findById(findStud);
        System.out.println("Found Student: \n" + found);
        
        input.nextLine();
        
        System.out.println("You want to remove student on the list? Type Yes or No ");
        String res = input.nextLine();
        if ("Yes".equals(res)) {
            System.out.println("Remove Student Using ID: ");
            int removeStud = input.nextInt();
            service.removeStudent(removeStud);
            System.out.println("After Removal: " + service.getAllStudents());
        } else {
            for(Student stud: service.getAllStudents()){
                 System.out.println(stud);
            }
        }
    }
}
