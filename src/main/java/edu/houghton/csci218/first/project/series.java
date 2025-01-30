/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.houghton.csci218.first.project;
import java.lang.Math;
/**
 *
 * @author jesse
 */
public class series {
    public static void main(String[] args) {
        int num = 100;
        double sum = 0.0;
        for (int i = 1; i <= num; i++) {
            sum += Math.pow(-1, i+1) / i;
        }
        System.out.println("This is the sum of the series: " + sum);
    }
}
