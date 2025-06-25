/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pupunisan.salary;

/**
 *
 * @author Admin
 */
public class SalaryCalClass {
    public static double Salary (double hrswrk, double rph, double tx){
        double GrossSalary = hrswrk * rph;
        double TaxAmount = GrossSalary * tx;
        double NetSalary = GrossSalary - TaxAmount;
        return NetSalary;
    }
    
    public static double Salary (int hrswrk, int rph, int tx){
        double GrossSalary = hrswrk * rph;
        double TaxAmount = (GrossSalary * tx)/100;
        double NetSalary = GrossSalary - TaxAmount;
        return NetSalary;
    }
    
}
