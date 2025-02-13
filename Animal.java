/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WeekFiveLabAct;

/**
 *
 * @author jesse
 */
public class Animal {
    private double mass;
    private String name;
    private int legs;
    boolean isAlive;
    static int counter = 0;
    static int animals_alive = 0;

    public void setMass(double mass) {
        this.mass = mass;
    }

    public String getName() {
        return name;
    }

    public int getLegs() {
        return legs;
    }

    public double getMass() {
        return mass;
    }
    public Animal(String name) {
        this.name = name;
        this.mass = 0;
        this.legs = 0;
        this.counter++;
        this.animals_alive++;
        this.isAlive = true;
    }
    public Animal(double mass, String name, int legs) {
        this.mass = mass;
        this.name = name;
        this.legs = legs;
        this.isAlive = true;
        this.counter++;
        this.animals_alive++;
    }
    public void printInfo() {
        System.out.println("This is the animal's mass: " + this.mass);
        System.out.println("This is the animal's name: " + this.name);
        System.out.println("This is the animal's number of legs: " + this.legs);
        System.out.println("This is the animal's life status: " + this.isAlive);
    }
    public int getAnimalPopulation() {
        return this.counter;
    }
    public Animal reproduce() {
        return new Animal(mass / 2, name, legs);
    }
    
    public void die() {
        if (isAlive) {
        this.isAlive = false;
        this.animals_alive--;   
        }
        
    }

}
