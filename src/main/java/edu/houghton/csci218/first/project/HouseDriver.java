/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.houghton.csci218.first.project;

import edu.houghton.csci218.first.project.House;

/**
 *
 * @author jesse
 */
public class HouseDriver {
    public static void main(String[] args) {
        House house1 = new House();
        House house2 = new House(1000, 150000, "Semidetached");
        House house3 = new House(80);
        House house4 = new House(25, 110000);
        System.out.println(house1.toString());
        house1.estimatePrice();
        System.out.println(house1.toString());
        System.out.println();
        System.out.println(house2.toString());
        house2.estimatePrice();
        System.out.println(house2.toString());
        System.out.println();
        System.out.println(house3.toString());
        house3.estimatePrice();
        System.out.println(house3.toString());
        System.out.println();
        System.out.println(house4.toString());
        house4.estimatePrice();
        System.out.println(house4.toString());
        house1.setAge(900);
        house1.setType("Semidetached");
        System.out.println(house1.toString());
        System.out.println(house1.equals(house4));
        System.out.println(house1.equals(house2));
        System.out.println(house1.isGreaterThan(house3));
        System.out.println(house4.isGreaterThan(house2));
        house3.setCost(1000000);
        System.out.println(house1.isLessThan(house3));
        System.out.println(house3.isLessThan(house1));
        
        
    }
}
