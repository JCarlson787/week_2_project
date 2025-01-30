/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.houghton.csci218.first.project;

/**
 *
 * @author jesse
 */
public class House {
    private int age;
    private String type;
    private int cost;
    
    
    public House() {
        this.age = 50;
        this.type = "Attached";
        this.cost = 100000;
    }

    public House(int age) {
        this.age = age;
        this.type = "Attached";
        this.cost = 100000;
    }

    public House(int age, int cost) {
        this.age = age;
        this.type = "Attached";
        this.cost = cost;
    }

    public House(int age, int cost, String type) {
        this.age = age;
        this.type = type;
        this.cost = cost;
    }

    public int getAge() {
        return age;
    }

    public String getType() {
        return type;
    }

    public int getCost() {
        return cost;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setAll(int age, String type, int cost) {
        this.age = age;
        this.type = type;
        this.cost = cost;
    }

    public void setTwo(int age, int cost) {
        this.age = age;
        this.cost = cost;
    }

    public int estimatePrice() {
        if (this.cost == 100000 && this.type.equals("Attached")) {
            int price = this.cost;
            int years = this.age;
            int count = 5;
            while (years > 0) {
                if (count > 0) {
                    price *= (1 + 0.01);
                    years--;
                }else {
                    price *= (1 + 0.02);
                    years--;
                } 
            count--;
            }
        this.cost = price;
        } else if (this.cost == 150000 && this.type.equals("Semidetached")) {
            int price = this.cost;
            int years = this.age;
            int count = 5;
            while (years > 0) {
                if (count > 0) {
                    price *= (1 + 0.02);
                    years--;
                }else {
                    price *= (1 + 0.03);
                    years--;
                } 
            count--;
            }
        this.cost = price;
        }
    
    return this.cost;
    }

    public String toString() {
        return String.valueOf(this.age) + " " + this.type + " " + String.valueOf(this.cost);
        
    }

    public boolean equals(House obj) {
       boolean isEqual = false;
       if (this.age == obj.age  && this.type.equals(obj.type)) {
           isEqual = true;
       } else {
           isEqual = false;
       }
    return isEqual;
    }
    
    public boolean isGreaterThan(House obj) {
        boolean thisLarger = false;
        if (this.cost > obj.cost) {
            thisLarger = true;
        } else {
            thisLarger = false;
        }
    return thisLarger;
    }
   
    public boolean isLessThan(House obj) {
       boolean thisLess = false;
       if (this.cost < obj.cost) {
           thisLess = true;
       } else {
           thisLess = false;
       }
     return thisLess;
    }
    
}
