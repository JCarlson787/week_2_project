/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.houghton.csci218.first.project;

/**
 *
 * @author jesse
 */
public class Student2Driver {
    public static void main(String[] args) {
        Student2 student1 = new Student2("Mr", "Bob", "Tony", 6573, 11, 19, 99);
        student1.calcGrade();
        student1.printInfo();
    }
}
