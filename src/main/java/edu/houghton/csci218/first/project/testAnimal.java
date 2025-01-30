/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.houghton.csci218.first.project;

/**
 *
 * @author jesse
 */
public class testAnimal {
    public static void main(String[] args) {
        Animal obj1 = new Animal(3.5, "Snail", 1);
        obj1.print();
        System.out.println(obj1.counter);
        System.out.println(obj1.animals_alive);
        Animal obj2 = new Animal("skunk");
        obj2.print();
        System.out.println(obj2.counter);
        System.out.println(obj2.animals_alive);
        obj2.setMass(4.2);
        obj2.print();
        Animal babyAnimal1 = obj1.reproduce();
        babyAnimal1.print();
        babyAnimal1.die();
        obj1.die();
        obj2.die();
        System.out.println(obj1.animals_alive);
        Animal babyAnimal2 = obj2.reproduce();
        babyAnimal2.print();
        System.out.println(obj1.counter);
        
    }
}
