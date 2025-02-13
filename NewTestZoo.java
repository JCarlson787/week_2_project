/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WeekFiveLabAct;

/**
 *
 * @author jesse
 */
public class NewTestZoo {
    public static void main(String[] args) {
        Zoo the_zoo = new Zoo();
        Animal spider = new Animal(2, "spider", 8);
        Animal  elephant = new Animal(50040, " elephant", 4);
        Animal snake = new Animal(15, "snake", 0);
        the_zoo.addAnimal(snake);
        the_zoo.addAnimal(elephant);
        the_zoo.addAnimal(spider);
        the_zoo.print();
        the_zoo.totalMass();
        the_zoo.totalLegs();
        System.out.println("this is the averege mass of the zoo animals: " + the_zoo.totalMass() / 2);
        System.out.println("this is the averege number of legs the zoo animals have: " + the_zoo.totalLegs() / 2);
        
    }
}
