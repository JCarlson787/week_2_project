/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.houghton.csci218.first.project;
import java.util.Scanner;
/**
 *
 * @author jesse
 */
public class practice_3_task4 {
    
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        
        System.out.println("Please input a weight in pounds.");
        int pounds = input.nextInt();
        double kilograms = pounds * 0.454;
        System.out.printf("Here is that weight in kilograms: %.2f", kilograms);
    }
    
}
