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
public class num_to_binary {
    
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Please input the number you would like to convert to binary.");
        int num = input.nextInt();
        int new_num = num;
        int num2 = 1;
        ArrayList<Integer> list = new ArrayList<>();
        while (new_num != 0) {
            num2 = new_num % 2;
            list.add(num2);
            new_num = new_num / 2;
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i));  
        }  
    }
}
