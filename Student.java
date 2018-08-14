/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home.work8b;

import java.io.Serializable;

/**
 *
 * @author safordog
 */
public class Student implements Serializable {
    
    private static final long serialVersionUID = 1L;
    private String surname;
    private String name;
    private int age;
    private double averMark;
    private String group;

    public Student() {
        
    }

    public Student(String surname, String name, int age, double averMark, String group) {
        this.surname = surname;
        this.name = name;
        this.age = age;
        this.averMark = averMark;
        this.group = group;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAverMark() {
        return averMark;
    }

    public void setAverMark(double averMark) {
        this.averMark = averMark;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" + "surname=" + surname + ", name=" + name + ", age=" 
                + age + ", averMark=" + averMark + ", group=" + group + '}';
    }
    
    
    
    
    
    
    
    
}
