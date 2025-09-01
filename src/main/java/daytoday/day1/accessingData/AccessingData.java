/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daytoday.day1.accessingData;

/**
 *
 * @author admin
 */

import daytoday.day1.abstraction.Employee;
public class AccessingData {
    public void mandatoryDeductions(Employee data) {
        int salary = data.getSalary();
        
        double philhealth = (salary * 0.05) / 2;
        double pagibig = 10000 * 0.02;
        double sss = (salary >= 30000 ? 30000 * 0.05 : salary * 0.05);
        double salaryWithDeductions = salary - philhealth - pagibig - sss;
        double tax = salaryWithDeductions / 12;
        
        data.setPhilhealth(philhealth);
        data.setPagibig(pagibig);
        data.setSss(sss);
        data.setTax(tax);
    }
    
    public double totalDeductions(Employee data) {
        return data.getPhilhealth() + data.getPagibig() + data.getSss() + data.getTax();
    }
    
    public double takeHomePay(Employee data) {
        return data.getSalary() - data.getPhilhealth() - data.getPagibig() - data.getSss() - data.getTax();
    }
}
