/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.houghton.csci218.first.project.LabAct;

/**
 *
 * @author jesse
 */
public class AnimalDriver {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Animal animal = new Animal();
        Cat cat = new Cat();
        dog.speak();
        dog.speak("roaring");
        dog.superSpeak();
        animal.speak();
        cat.speak();
        cat.speak("meowing");
        cat.superSpeak();
        System.out.println(cat.name);
        System.out.println(cat.age);
        System.out.println(dog.name);
        System.out.println(dog.age);
        System.out.println(animal.name);
        System.out.println(animal.age);
    }
}
