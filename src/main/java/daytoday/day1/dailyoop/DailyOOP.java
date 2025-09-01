/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package daytoday.day1.dailyoop;

/**
 *
 * @author admin
 */

import java.util.Scanner;

import daytoday.day1.abstraction.Employee;
import daytoday.day1.accessingData.AccessingData;

public class DailyOOP {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input Name: ");
        String name = sc.nextLine();
        
        System.out.print("Input Salary: ");
        int  salary = sc.nextInt();
        
        Employee emp = new Employee(name, salary);
        
        AccessingData calc = new AccessingData();
        calc.mandatoryDeductions(emp);
        
        double totalDeductions = calc.totalDeductions(emp);
        double takeHomePay = calc.takeHomePay(emp);
        
        System.out.println("\nMandatory Deductions");
        System.out.println("Philhealth: "  + emp.getPhilhealth());
        System.out.println("Pagibig: " + emp.getPagibig());
        System.out.println("SSS: " + emp.getSss());
        System.out.println("Tax: "+ emp.getTax());
        System.out.println("Total: " + totalDeductions + "\n");
        System.out.println("NETPAY ");
        System.out.println("Take Home Pay: " + takeHomePay);
    }
}
