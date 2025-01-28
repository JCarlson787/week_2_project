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
public class practice_3_task3 {
    
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Please input a length in feet.");
        int feet = input.nextInt();
        double meters = feet * 0.305;
        System.out.printf("Here is that length in meters: %.2f ", meters);
    }
}
