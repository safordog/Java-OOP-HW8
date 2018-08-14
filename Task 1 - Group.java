/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home.work8b;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author safordog
 */
public class Group implements Serializable {
    
    private static final long serialVersionUID = 1L;
    private Student[] group;
    private String grName;

    public Group(String grName) {
        super();
        group = new Student[5];
        this.grName = grName;
    }

    public Student[] getGroup() {
        return group;
    }

    public void setGroup(Student[] group) {
        this.group = group;
    }

    public String getGrName() {
        return grName;
    }

    public void setGrName(String grName) {
        this.grName = grName;
    }
    
    public void addStudent(String surname, String name, int age, double averMark, String group) {
        Student student =  new Student();
        student.setSurname(surname);
        student.setName(name);
        student.setAge(age);
        student.setAverMark(averMark);
        student.setGroup(group);
        for (int i = 0; i < getGroup().length; i++) {
            if (getGroup()[i] == null) {
                getGroup()[i] = student;
                break;
            } 
        }
    }
    
    public void printGroup() {
        for (Student temp : group) {
            System.out.println(temp);
        }
    }
    
    public void toSerialize(Group group) {
        try (ObjectOutputStream OOS = new ObjectOutputStream(new FileOutputStream("group" + this.grName))) {
            OOS.writeObject(group);
        } catch (IOException e) {
            System.out.println("Error during saving!");
        }
    }
    
    public void toDeserialize() {
        Group temp = null;
        try (ObjectInputStream OIS = new ObjectInputStream(new FileInputStream("group" + this.grName))) {
            temp = (Group)OIS.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error during loading!");
        }
        System.out.println(this.grName + ":");
        temp.printGroup();
    }
    
}
