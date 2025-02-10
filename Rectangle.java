/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.houghton.csci218.first.project.LabAct;

/**
 *
 * @author jesse
 */
public class Rectangle extends Shape {
    
    public Rectangle(String name, String color, int base, int height) {
        super(name, color, base, height);
    }
    
    @Override
    public int getArea() {
        return this.base * this.height;
    }
}
