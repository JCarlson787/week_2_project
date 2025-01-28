/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.houghton.csci218.first.project;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author jesse
 */
public class homework {
    
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Please type in your name.");
        String name = input.nextLine();
        System.out.println("Please type in the courses that you are taking.");
        String course = input.nextLine();
        System.out.println("Please type in your age.");
        int age = input.nextInt();
        
        System.out.println("This is the students name: " + name);
        System.out.println("This is the students courses: " + course);
        System.out.println("This it the students age: " + age);      
    
        
    }
    
    
}
