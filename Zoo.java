/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WeekFiveLabAct;

/**
 *
 * @author jesse
 */
public class Zoo {

    private Animal[] cages;
    int animals = 0;
    Animal[] tempCages;

    public Zoo() {
        this.cages = new Animal[10];

    }

    public boolean addAnimal(Animal animal) {
        if (animals >= cages.length) {
            extendZoo();
            //
            return false;
        }

        cages[animals] = animal;
        animals++;
        return true;
    }

    @Override
    public String toString() {
        return "Zoo{" + "cages=" + cages + '}';
    }

    public void print() {
        for (int i = 0; i <= cages.length - 1; i++) {
            if (cages[i] != null) {
                System.out.println("Here is what is in cage " + i + ": " + cages[i].getName());
            } else {
                System.out.println("Cage number " + i + " is empty.");
            }

        }
    }

    public void numberOfAnimals() {
        int count = 0;
        for (int i = 0; i <= cages.length - 1; i++) {
            if (cages[i] != null) {
                count++;
            }
        }
        System.out.println("This is how many animals are in the zoo: " + count);
    }

    public int totalMass() {
        int mass = 0;
        for (int i = 0; i <= cages.length - 1; i++) {
            if (cages[i] != null) {
                mass += cages[i].getMass();
            }
        }
        System.out.println("This is the combined weight of all the animals in the zoo: " + mass);
        return mass;
    }

    public int totalLegs() {
        int legs = 0;
        for (int i = 0; i <= cages.length - 1; i++) {
            if (cages[i] != null) {
                legs += cages[i].getLegs();
            }
        }
        System.out.println("This is the total number of legs in the zoo: " + legs);
        return legs;
    }

    public void removeAnimal(Animal animal) {
        for (int i = 0; i <= cages.length - 1; i++) {
            if (cages[i] == animal) {
                cages[i] = null;
                animals--;
            }
        }
    }

    public void reorder() {
        for (int i = 0; i < cages.length - 1; i++) {
            if (cages[i] == null) { 
                for (int j = i; j < cages.length - 1; j++) {
                    cages[j] = cages[j + 1]; 
                }
                cages[cages.length - 1] = null; 
                break; 
            }
        }
    }


    public boolean makeBaby() {
        for (int i = 1; i < cages.length - 1; i++) {
            if (cages[i] != null && cages[i - 1] != null) {
                if (cages[i] == cages[i - 1]) {
                    Animal baby = new Animal(cages[i].getMass() + cages[i - 1].getMass() / 2 * 0.10, cages[i].getName(), cages[i].getLegs());
                    for (int x = 0; x <= cages.length - 1; x++) {
                        if (cages[x] == null) {
                            cages[x] = baby;
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public void extendZoo() {
        int len = (int) (cages.length * 1.5);
        if (animals == cages.length) {
            tempCages = new Animal[len];
            for (int i = 0; i < cages.length; i++) {
                tempCages[i] = cages[i];
            }
            cages = tempCages;
        }
    }
}
