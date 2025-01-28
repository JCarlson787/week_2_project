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
public class practice_3_task2 {
    
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        
        System.out.println("Please input the radius for the cylinder.");
        double radius = input.nextDouble();
        System.out.println("Please input the length for the cylinder.");
        double length = input.nextDouble();
        double area = radius * radius * Math.PI;
        double volume = area * length;
        System.out.println("This is the area of the cylinder " + Math.round(area));
        System.out.println("This is the volume of the cylinder " + Math.round(volume));
        
        
    }
}
