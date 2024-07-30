/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication52;

/**
 *
 * @author Haneen
 */
public class Person {
    protected int id;
    protected String name;
    protected String phone;
    protected String gender;

    public Person(int id, String name, String phone, String gender) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getGender() {
        return gender;
    }

  
}
