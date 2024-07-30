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

    public class Client extends Person {
    private String email;

    public Client(int id, String name, String phone, String gender, String email) {
        super(id, name, phone, gender);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public void printExtraInfo() {
        System.out.println("Client Email: " + email);
    }
}

