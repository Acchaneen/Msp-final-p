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

    public class Employee extends Person {
    private float salary;
    private String workingTime;

    public Employee(int id, String name, String phone, String gender, float salary, String workingTime) {
        super(id, name, phone, gender);
        this.salary = salary;
        this.workingTime = workingTime;
    }

    public float getSalary() {
        return salary;
    }

    public String getWorkingTime() {
        return workingTime;
    }

    @Override
    public void printExtraInfo() {
        System.out.println("Employee Salary: " + salary + ", Working Time: " + workingTime);
    }
}

