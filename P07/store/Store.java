/*
Name: Mary-Rose Tracy 
ID#:1001852753 
Assignment: P06 Email
TODO: see program comments below
we ain't gonna do touch this file essentially
credit to prof rice
*/
package store;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
//NEW IMPORTS:
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
public class Store 
{
    public Store(String name) {
        this.name = name;
    }
    
    public String name() {
        return this.name;
    }
    
    //NEWWWW
   public void save(BufferedWriter bw)throws IOException
   {
        bw.write(name+"\n");
        bw.write(customers.size()+"\n");
        for(Customer customer:customers)
        {
            customer.save(bw);
        }
        bw.write(options.size()+"\n");
        for(Option option:options) 
        {
            option.save(bw);
        }
        bw.write(computers.size()+"\n");
        for(Computer computer:computers)
        {
            computer.save(bw);
        }
        bw.write(orders.size()+"\n");
        for(Order order:orders) 
        {
            order.save(bw);
        }
}
/*
public String name() {
    return name;
}
*/
    //NEW^^^
    // ///////////////////////////////////////////////////////////
    // Customers
    
    public void add(Customer customer) {
        if(!customers.contains(customer)) customers.add(customer);
    }
    public Object[] customers() {
        return this.customers.toArray();
    }
    
    // ///////////////////////////////////////////////////////////
    // Options
    
    public void add(Option option) {
        if(!options.contains(option)) options.add(option);
    }
    public Object[] options() {
        return this.options.toArray();
    }
    
    // ///////////////////////////////////////////////////////////
    // Computers
    
    public void add(Computer computer) {
        if(!computers.contains(computer)) computers.add(computer);
    }
    public Object[] computers() {
        return this.computers.toArray();
    }
    
    // ///////////////////////////////////////////////////////////
    // Orders
    
    public void add(Order order) {
        if(!orders.contains(order)) orders.add(order);
    }
    public Object[] orders() {
        return this.orders.toArray();
    }

    // ///////////////////////////////////////////////////////////
    // Fields
    
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>();
    private ArrayList<Option> options = new ArrayList<>();
    private ArrayList<Computer> computers = new ArrayList<>();
    private ArrayList<Order> orders = new ArrayList<>();
}
