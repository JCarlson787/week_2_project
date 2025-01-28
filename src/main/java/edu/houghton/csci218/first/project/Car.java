/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.houghton.csci218.first.project;

/**
 *
 * @author jesse
 */
public class Car {
    String make;
    String model;
    boolean engine_on;
    int speed;
    int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.engine_on = false;
        this.speed = 0;
        this.year = year;

    }

    void display_info() {
        System.out.println("Here is some info about your car.");
        System.out.println("This is your car's make: " + this.make);
        System.out.println("This is your car's model: " + this.model);
        System.out.println("This is your car's year: " + this.year);
    }

    void start() {
        this.engine_on = true;
        System.out.printf("You have started your %s", this.model);
        System.out.println();
    }
    
    void brake() {
        if (this.speed > 0) {
        this.speed -= 25;
        System.out.println("You are braking, your speed is now " + this.speed);
        } else {
            System.out.println("Your speed is zero, you no longer need to brake.");
        }
    }
    
    void accelerate() {
        if (this.engine_on == true) {
            this.speed += 50;
            System.out.println("You are accelerating, your speed is now " + this.speed);
        
        } else {
            System.out.println("Turn on your car before moving.");
        }

    }
    
    void stop() {
        if (this.speed == 0) {
            this.engine_on = false;
            System.out.printf("You have turned of your %s", this.model);
            System.out.println();
        }else {
            System.out.println("Please reduce your speed to zero before you turn off your car.");
        }
    }






















}
