/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package edu.houghton.csci218.first.project;

import java.util.Scanner;

/**
 *
 * @author jesse
 */
public class FirstProject {

    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        
        System.out.println("Hello World!");
        System.out.print("Text");
        System.out.print("Text");
        System.out.println(1990);
        System.out.println('a');
        
        int age = 27; 
        int country_size = 9999999;
        short hu_size = 200;
        char gnder = 'M';
        byte num_shoe = 50;
        long income = 1111111111;
        float weight = 60.78f;
        double world = 444444.999;
        System.out.println("my age is " + age);
        System.out.println("country size is " + country_size);
        
        int n = 5;
        int square;
        square = n * n;
        double cube = n * (double)square;
        System.out.println("cube is " + cube);
        
        double t = square / 4.0;
        System.out.println("t =" + t);
        
        
        double length, breadth, area, perimater;
        System.out.println("Enter here.");
        length = input.nextDouble();
        System.out.println("Enter here.");
        breadth = input.nextDouble();
        area = length * breadth;
        perimater = 2 * (length + breadth);
        System.out.println("The perimiter of the rectangle of sides " + length + 'x' + breadth + '=' + perimater);
        
        
//        String name = input.nextLine();
//        int age = input.nextInt();
//        byte  b = input.nextByte();
                
        
        
       // String school = "Houghton";
       // String name = "bob";
        
        //FirstProject  mary = new FirstProject();
        
        
        
                
                
             
    }
}
