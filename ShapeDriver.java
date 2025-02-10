/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.houghton.csci218.first.project.LabAct;

/**
 *
 * @author jesse
 */
public class ShapeDriver {
    public static void main(String[] args) {
        Square square = new Square("square", "red", 15, 22);
        Rectangle rectangle = new Rectangle("rectangle", "green", 13, 55);
        Triangle triangle = new Triangle("triangle", "blue", 12, 18);
        Trapezium trapezium = new Trapezium("trapezium", "pink", 14, 6, 10);
        Parallegram parallegram = new Parallegram("parallegram", "black", 30, 19);
        Rhombus rhombus = new Rhombus("rhombus", "white", 60, 12);
        Kite kite = new Kite("kite", "gold", 7, 77);
        square.getArea();
        square.displayInfo();
        System.out.println();
        rectangle.getArea();
        rectangle.displayInfo();
        System.out.println();
        triangle.getArea();
        triangle.displayInfo();
        System.out.println();
        trapezium.getArea();
        trapezium.displayInfo();
        System.out.println();
        parallegram.getArea();
        parallegram.displayInfo();
        System.out.println();
        rhombus.getArea();
        rhombus.displayInfo();
        System.out.println();
        kite.getArea();
        kite.displayInfo();
    }
}
