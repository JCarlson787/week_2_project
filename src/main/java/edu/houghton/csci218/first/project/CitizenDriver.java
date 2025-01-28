/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.houghton.csci218.first.project;

/**
 *
 * @author jesse
 */
public class CitizenDriver {
    public static void main(String[] args) {
        CitizenTax person1 = new CitizenTax("john", 70000.00);
        CitizenTax person2 = new CitizenTax("bob", 20500.00);
        CitizenTax person3 = new CitizenTax("chris", 500.00);
        
        person1.calculateTax();
        person1.printInfo();
        person2.calculateTax();
        person2.printInfo();
        person3.calculateTax();
        person3.printInfo();
    }
    
    
}
