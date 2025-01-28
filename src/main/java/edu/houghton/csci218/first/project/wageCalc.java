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
public class wageCalc {
    public static void main(String[] args) {
        double pay = 1.0;
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Please input your pay.");
        System.out.println("If you would like to exit the program enter 0.0 at any time.");
        double wage = 1.0;
        while (wage != 0.0) {
           wage = input.nextDouble();
           if (wage < 8.00) {
           System.out.println("That amount is invalid! Please try again");
               System.out.println("Please input your pay.");
           continue;
           }
            System.out.println("Please input the number of hours you have worked.");
        double hours = input.nextDouble();
        if (hours > 60) {
            System.out.println("That amount is invalid! Please try again");
        }else if (hours >= 40 && hours < 60) {
            wage = wage * 1.5;
            pay = hours * wage;
            System.out.println("This is your pay " + pay);
            System.out.println("Please input your pay.");
        }else {
            pay = hours * wage;
            System.out.println("This is your pay " + pay);
            System.out.println("Please input your pay.");
        }
        
       }
          
    }
}
