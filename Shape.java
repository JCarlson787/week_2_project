/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.houghton.csci218.first.project.LabAct;

/**
 *
 * @author jesse
 */
public class Shape {
    String name;
    String color;
    int base;
    int height;
    int length;
    
    public Shape(String name, String color, int base, int height) {
        this.name = name;
        this.color = color;
        this.base = base;
        this.height = height;
    }
    public Shape(String name, String color, int height) {
        this.name = name;
        this.color = color;
        this.height = height;
    }
    
    public int getArea() {
        return 0;
    }

    public void displayInfo() {
        System.out.println("This is the shapes name: " + this.name);
        System.out.println("This is the shapes color: " + this.color);
        System.out.println("This is the shapes area: " + getArea());
    }
}
