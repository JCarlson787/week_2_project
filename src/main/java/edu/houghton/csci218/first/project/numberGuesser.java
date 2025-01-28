/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.houghton.csci218.first.project;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jesse
 */
public class numberGuesser {

    public static void main(String[] args) {
        int howFar = 1;
        Random random = new Random();
        Scanner input;
        input = new Scanner(System.in);
        while (howFar > 0) {
            int randNum = random.nextInt(100) + 1;
            System.out.println("Try to guess a number between 1 and 100. ");
            System.out.println("Please input your guess.");
            int guessNum = input.nextInt();
            if (guessNum < 0 || guessNum < 101) {
                System.out.println("This is your guess " + guessNum);
            if (guessNum == randNum) {
                System.out.println("Yay you guessed right!");
            } else {
                System.out.println("This is the correct number: " + randNum);
                if (randNum > guessNum) {
                    howFar = randNum - guessNum;
                } else {
                    howFar = guessNum - randNum;
                }
                System.out.println("You were off by " + howFar);
                System.out.println();
                }
            }else {
                System.out.println("That number is invalid! Try again.");
                System.out.println();
            }
            
        }
    }
}
