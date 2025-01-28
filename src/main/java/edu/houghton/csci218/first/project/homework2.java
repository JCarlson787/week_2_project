/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.houghton.csci218.first.project;
import java.lang.Math;
import java.util.Scanner;

        
        public class homework2 {
    
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        
        System.out.println("Please input how many sides you would like the polygon to have.");
        int n = input.nextInt();
        System.out.println("Please input how long you would like those sides to be.");
        int s = input.nextInt();
        int answer = (int) Math.round((n * Math.pow(s,2)) / (4 * Math.tan(Math.PI / n)));
        System.out.println("The area of your polygon is " + answer); 
    }
}
