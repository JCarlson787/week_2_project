/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WeekFiveLabAct;

/**
 *
 * @author jesse
 */
public class testZoo {
    public static void main(String[] args) {
    Animal snail = new Animal(5, "snail", 0);
    Animal elaphant = new Animal(50000, "elaphant", 4);
    Animal lion = new Animal(500, "lion", 4);
    Animal toad = new Animal(5, "toad", 4);
    Animal millipeid = new Animal(1, "millipeid", 1000);
    snail.printInfo();
    elaphant.printInfo();
    System.out.println();
    Zoo myZoo = new Zoo();
    myZoo.addAnimal(snail);
    myZoo.print();
    myZoo.addAnimal(elaphant);
    myZoo.addAnimal(toad);
    myZoo.addAnimal(lion);
    myZoo.addAnimal(lion);
    myZoo.addAnimal(millipeid);
    myZoo.print();
    myZoo.numberOfAnimals();
    myZoo.totalMass();
    myZoo.totalLegs();
    myZoo.removeAnimal(elaphant);
    myZoo.print();
    myZoo.removeAnimal(millipeid);
    myZoo.print();
    myZoo.reorder();
    myZoo.print();
    /*
    myZoo.makeBaby();
    myZoo.print();
    lion.printInfo();
    myZoo.print();
    myZoo.addAnimal(snail);
    myZoo.addAnimal(snail);
    myZoo.addAnimal(snail);
    myZoo.addAnimal(snail);
    myZoo.addAnimal(snail);
    myZoo.addAnimal(snail);
    myZoo.addAnimal(snail);
    myZoo.addAnimal(snail);
    myZoo.addAnimal(snail);
    myZoo.print();
    */
    }
}
