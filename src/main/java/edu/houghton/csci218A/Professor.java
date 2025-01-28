/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.houghton.csci218A;

/**
 *
 * @author jesse
 */
public class Professor {
    private String name;
    private String office_hours;
    private String course;
    private int age;
    
    
    
    public Professor() {
        
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setOffice(String hours) {
        this.office_hours = hours;
    }
    
    public String getOffice() {
        return office_hours;
    }
    
    public void setAge(int ages) {
        this.age = ages;
    }
    
    
    public int getAge() {
        return this.age;
    }
    
    public void getCourse(String course) {
        this.course = course;
    }
    
    
    
    
    public void lecture() {
        System.out.println("this is a lecture");
    }

    public void conduct_office() {
        System.out.println("office hours");
    }
    
    public void grade() {
        System.out.println("grade");
    }

}
