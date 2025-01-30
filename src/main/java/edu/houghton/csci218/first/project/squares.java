/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.houghton.csci218.first.project;
import java.util.ArrayList;
import java.lang.Math;
/**
 *
 * @author jesse
 */
public class squares {
    public static void main(String[] args) {
        int top = 389;
        int bot = 23;
        ArrayList<Double> nums = new ArrayList<>();
        while (bot <= top) {
            nums.add(Math.pow(bot, 2));
            bot += 2;
        }
        int sum = 0;
        for (double num : nums) {
            sum += (int) num;
        }
        System.out.println("This is the sum " + sum);
    }
}
