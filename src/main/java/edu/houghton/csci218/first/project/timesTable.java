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
public class timesTable {

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        System.out.println("   1 2 3 4 5 6 7 8 9 10 11 12 13 ");
        System.out.println("--------------------------------");
        int multi = 1;
        while (multi <= 13) {
            System.out.print(multi + "|" + " ");
            for (int num : nums) {
                System.out.print(num * multi + " ");
                
            }
            System.out.println();
        multi++;
        }

    }
}
