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
public class practice_3_task7 {
    
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        
        System.out.println("Please input a time in minutes.");
        int minutes = input.nextInt();
        int minutes_per_day = 60 * 24;
        int max_days = minutes / minutes_per_day;
        int years = max_days / 365;
        int leftover_days = max_days % 365;
        String dy = "days.";
        String yr = "years";
        String ad = "and";
        System.out.printf("Your number is equal to %d %s %s %d %s ", years, yr, ad, leftover_days, dy);
        
        
    }
}
