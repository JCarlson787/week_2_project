/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.houghton.csci218.first.project.LabAct;

/**
 *
 * @author jesse
 */
public class Trapezium extends Shape {
    int a;
    int b;
    public Trapezium(String name, String color, int height, int a, int b) {
        super(name, color, height);
        this.a = a;
        this.b = b;
    }
   
    
    
    
    @Override
    public int getArea() {
        return (this.a + this.b) * this.height / 2;
    } 
}
