/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.houghton.csci218.first.project;
import java.lang.Math;
/**
 *
 * @author jesse
 */
public class CitizenTax {
    private String name = "";
    private double yearly_income = 0;
    private double tax = 0;
    
    public CitizenTax(String name, double income) {
        this.name = name;
        this.yearly_income = income;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getYearly_income() {
        return yearly_income;
    }

    public void setYearly_income(int yearly_income) {
        this.yearly_income = yearly_income;
    }


    public void printInfo() {
        System.out.println("Here is your information.");
        System.out.println("Users name: " + this.name);
        System.out.println("Users yearly income: " + Math.round(this.yearly_income));
        System.out.printf("Users tax: %.1f \n", this.tax);
    }

    public double calculateTax() {
        int paramaters[] = {1000, 10000, 20200, 30750, 50000};
        double taxRate[] = {0.00, 0.10, 0.15, 0.20, 0.25, 0.30};
        double paraMax = 0.0;
        
        for (int i = 0; i < paramaters.length; i++) {
            if (yearly_income > paramaters[i]) {
                tax += (paramaters[i] - paraMax) * taxRate[i];
                paraMax = paramaters[i];
            } else {
                this.tax += (yearly_income - paraMax) * taxRate[i];
                return this.tax;
            }
        }
        
       this.tax += (yearly_income - paraMax) * taxRate[taxRate.length - 1];
       return this.tax;
    
    
    
    
    
    
    }
 
    
    public void updateIncome(double income) {
        this.yearly_income = income;
    }
}
