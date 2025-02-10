/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.houghton.csci218.first.project.LabAct;

/**
 *
 * @author jesse
 */
public class Kite extends Shape{
    int length;
    
    public Kite(String name, String color, int height, int length) {
        super(name, color, height);
        this.length = length;
    }
   @Override
    public int getArea() {
        return this.length * this.height / 2;
    } 
}
