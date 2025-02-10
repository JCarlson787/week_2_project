/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.houghton.csci218.first.project.LabAct;

/**
 *
 * @author jesse
 */
public class Animal {
    String name = "mamal";
    int age = 5;
    
    
    public void speak() {
        System.out.println("Making noise");
    }
    
    public void speak(String sound) {
        System.out.println("Animal is " + sound);
    }
/*
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
*/
}
