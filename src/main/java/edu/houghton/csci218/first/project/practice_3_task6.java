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
public class practice_3_task6 {
    
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Please input a number between 0 and 1000.");
        String num = input.next();
        int int_num = Integer.parseInt(num);
        if (int_num >= 0 && int_num <= 1000) {
            int num_total = 0;
            String[] digits = num.split("");
            for (int i = 0; i < digits.length; i++) {
                int num_to_sum = Integer.parseInt(digits[i]);
                num_total += num_to_sum;
            }
            
            System.out.println("This is the sum of the digits of the number you inputed: " + num_total);
        } else {
            System.out.println("That number is not in the proper range!");
            }
        
        
        
    }
}

