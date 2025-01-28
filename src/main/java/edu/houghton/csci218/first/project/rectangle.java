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
public class rectangle {
     public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
 
        double length, breadth, area, perimater;
        System.out.println("Enter length here.");
        length = input.nextDouble();
        System.out.println("Enter breadth here.");
        breadth = input.nextDouble();
        area = length * breadth;
        perimater = 2 * (length + breadth);
        System.out.println("The perimiter of the rectangle of sides " + Math.round(length) + 'x' + Math.round(breadth) + '=' + Math.round(perimater));
     }
    
}
