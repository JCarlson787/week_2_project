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
public class practice_3_task1 {
    
    public static void main(String[] args) {
        Scanner input;
        System.out.println("Please input a temp in celsius.");
        input = new Scanner(System.in);
        double celsius = input.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("Here is the temp in fahrenheit " + fahrenheit);
    }
}
