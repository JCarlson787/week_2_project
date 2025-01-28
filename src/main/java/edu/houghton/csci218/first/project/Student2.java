/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.houghton.csci218.first.project;

/**
 *
 * @author jesse
 */
public class Student2 {
    private String title = "Mr.";
    private String name = "John";
    private String lastName = "Smith";
    private long studentID = 884432;
    private int birthMonth = 8;
    private int birthDay = 18;
    private int birthYear = 1999;    
    private int asign1 = 87;
    private int asign2 = 44;
    private int prac = 8;
    private int finalExam = 9;
    private String finalGrade = "";
    public Student2() {
        
    }


    public Student2(String title, String name, String lastName, long studentID, int birthMonth, int birthDay, int birthYear) {
        this.title = title;
        this.name = name;
        this.lastName = lastName;
        this.studentID = studentID;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.birthYear = birthYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getStudentID() {
        return studentID;
    }

    public void setStudentID(long studentID) {
        this.studentID = studentID;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void printInfo() {
        char slash = '/';
        System.out.println("This is the student's name: " + this.name);
        System.out.println("This is " + this.name + "'s title: " + this.title);
        System.out.println("This is " + this.name + "'s surname: " + this.lastName);
        System.out.println("This is " + this.name + "'s ID: " + studentID);
        System.out.printf("This is " + this.name + "'s date of birth %d%c%d%c%d", this.birthMonth, slash, this.birthDay, slash, this.birthYear);  
        System.out.println();
        System.out.println("This is the " + this.name + "'s final grade: " + this.finalGrade);
        
    }



    public void calcGrade() {
        double avrge = (asign1 * 0.20) + (asign2 * 0.20) + (prac * 0.10) + (finalExam * 0.50);
        
        if (avrge > 80) {
            this.finalGrade = "HD";
        } else if (avrge > 70 && avrge < 80) {
            this.finalGrade = "D";
        } else if (avrge > 60 && avrge < 70) {
            this.finalGrade = "C";
        } else if (avrge > 50 && avrge < 60) {
            this.finalGrade = "P";
        } else {
            this.finalGrade = "N";
        }
    }
}
