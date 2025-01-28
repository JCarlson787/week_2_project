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
public class pracitce_3_task5 {
    
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Please input a subtotal.");
        float subtotal = input.nextFloat();
        System.out.println("Please chose a tip percent.");
        float percent = input.nextFloat();
        float true_percent = percent / 100;
        double gratuity = true_percent * subtotal;
        double total = subtotal + gratuity;
        System.out.printf("Here is the gratuity: $%.2f ", gratuity);
        System.out.println();
        System.out.printf("Here is your total: $%.2f ", total);
    }
}
