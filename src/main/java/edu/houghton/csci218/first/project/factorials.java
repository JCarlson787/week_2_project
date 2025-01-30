/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.houghton.csci218.first.project;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author jesse
 */
public class factorials {
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Please input a number.");
        int top = input.nextInt();
        int counter = 1;
        while (counter <= top) {
            numbers.add(counter);
            counter++;
        }
        
        long total = 1;
        for (int num : numbers) {
            total *= num;
        }
        System.out.println("This is the factorial " + total);
    }
}
