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
public class Circle {
    private double radius = 1.0;
    private String color = "red";
    
    public Circle() {
        
    }
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    
    public double getRadius() {
        return radius;
    }

    public double getArea() {
        double area = Math.PI * Math.pow(radius, 2);
        return Math.round(area);
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    
    public String getColor() {
        return color;
    }

}
