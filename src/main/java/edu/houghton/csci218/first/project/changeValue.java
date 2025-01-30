/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.houghton.csci218.first.project;

/**
 *
 * @author jesse
 */
public class changeValue {
    private int value1;
    private int value2;
    
    
    public changeValue(int value1, int value2) {
        if (value1 > 5) {
            this.value1 = value1;
        } else {
            this.value1 = value1 + value2;
        } 
        if (value2 < 10) {
            this.value2 = value2 * value2 + 5;
        } else {
            this.value2 = value2;
        }
    } 

    public void print() {
        int sum = value1 * value2;
        System.out.println("This is the first number " + this.value1);
        System.out.println("This is the second number " + this.value2);
        System.out.println("This is the two numbers multiplyed: " + sum);
    }


}
