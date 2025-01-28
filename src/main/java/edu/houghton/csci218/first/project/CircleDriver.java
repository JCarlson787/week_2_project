/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.houghton.csci218.first.project;

/**
 *
 * @author jesse
 */
public class CircleDriver {
    public static void main(String[] args) {
        Circle circleFirst = new Circle();
        System.out.println(circleFirst.getRadius());
        System.out.println(circleFirst.getArea());
        System.out.println(circleFirst.getColor());
        Circle circleSecond = new Circle(5.0);
        System.out.println(circleSecond.getRadius());
        System.out.println(circleSecond.getArea());
        System.out.println(circleSecond.getColor());
        Circle circleThird = new Circle(6.0, "blue");
        System.out.println(circleThird.getRadius());
        System.out.println(circleThird.getArea());
        System.out.println(circleThird.getColor());
    
    }
}
