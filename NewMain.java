/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication52;
 import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Haneen
 */
public class NewMain {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 


        // Test Person, Client, and Employee classes
        Client client1 = new Client(1, "John Doe", "123456789", "Male", "john@example.com");
        Employee employee1 = new Employee(2, "Jane Smith", "987654321", "Female", 5000.0f, "9am-5pm");
        client1.printExtraInfo();
        employee1.printExtraInfo();

        // Test Product class
        Product product1 = new Product(1, "Laptop", 1500.0f);
        Product product2 = new Product(2, "Smartphone", 800.0f);
        System.out.println("Product 1: " + product1.getName() + ", Price: " + product1.getPrice());
        System.out.println("Product 2: " + product2.getName() + ", Price: " + product2.getPrice());

        // Test Order class
        List<Product> orderProducts = new ArrayList<>();
        orderProducts.add(product1);
        orderProducts.add(product2);
        Order order1 = new Order(1, "2023-07-29", true, client1, orderProducts);
        System.out.println("Order 1 ID: " + order1.getId() + ", Date: " + order1.getDate() + ", Is Paid: " + order1.isPaid());
        System.out.println("Order 1 Person: " + order1.getPerson().getName() + ", Phone: " + order1.getPerson().getPhone());

        // Test Company class
        Company company = new Company();
        company.addProduct(product1);
        company.addProduct(product2);
        company.addPerson(client1);
        company.addPerson(employee1);
        company.addOrder(order1);

        company.printPersonInfo(1);
        company.printProductDetails(1);
        company.printOrderDetails(1);
        company.printPersonOrders(1);

        company.removeProduct(1);
        company.removePerson(1);
        company.removeOrder(1);
    }
}
    
    

