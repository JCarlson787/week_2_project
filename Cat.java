/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.houghton.csci218.first.project.LabAct;

/**
 *
 * @author jesse
 */
public class Cat extends Animal{

    @Override
    public void speak() {
        System.out.println("Cat is meowing");
    }
    public void superSpeak() {
        super.speak();
    }
}
