/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.houghton.csci218.first.project;

import edu.houghton.csci218A.Professor;

/**
 *
 * @author jesse
 */
public class demo {
    
    public static void main(String[] args) {
        
        Professor john_case = new Professor();
        john_case.lecture();
        john_case.grade();
        john_case.conduct_office();
        
        john_case.setAge(50);
        int t = john_case.getAge();
        System.out.println(t);
    
        
        
    
    }
}


/* static non access modifier 
final cant be changed 
syncronized (for later)
non access modifier added to change small things 
final can be used on methods as well as others
abstract makes abstract classes
encapsulation way to hide data to protect it sort of wrapping accesable through methods 
almost like a bouncer or intermedeary more control for the class, read only or write only 
activity due before next class same as num 3 but not super nessary as we will work in class
*/