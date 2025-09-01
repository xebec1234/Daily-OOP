/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daytoday.day1.abstraction;

/**
 *
 * @author admin
 */
public class Employee {
    
    private String name;
    private int salary;
    
    private double philhealth;
    private double pagibig;
    private double sss;
    private double tax;
    
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    
    public String getName() {
        return name;
    }
    
    public int getSalary() {
        return salary;
    }
    
    public void setPhilhealth(double philhealth ) { this.philhealth = philhealth; }
    public void setPagibig( double pagibig) { this.pagibig = pagibig; }
    public void setSss(double sss) { this.sss = sss; }
    public void setTax(double tax) { this.tax = tax; }
    
    public double getPhilhealth() {
        return philhealth;
    }
    
    public double  getPagibig() {
        return pagibig;
    }
    
    public double getSss() {
        return sss;
    }
    
    public double getTax() {
        return tax;
    }
}
