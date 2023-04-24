/*
Name: Mary-Rose Tracy 
ID#:1001852753 
Assignment: P06 Email
TODO: see program comments below
Order.java
Credit to prof-rice
*/
package store;

import java.util.ArrayList;
import java.util.Objects;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class Order implements Saveable 
{
    public Order(Customer customer) 
    {
        this.customer = customer;
        this.orderNumber = nextOrderNumber++;
    }
    public Order(BufferedReader br) throws IOException
    {
        this.orderNumber = Long.parseLong(br.readLine());
        if (nextOrderNumber <= orderNumber) nextOrderNumber = orderNumber + 1;
        this.customer = new Customer(br);
        int numOptions = Integer.parseInt(br.readLine());
        while (numOptions-- > 0)
            computers.add(new Computer(br));
    }
    public void save(BufferedWriter bw) throws IOException 
    {
        bw.write(Long.toString(orderNumber) + '\n');
        this.customer.save(bw);
        bw.write("" + computers.size() + '\n');
        for (Computer computer : computers)
            computer.save(bw);
    }
    public void addComputer(Computer computer) 
    {
        computers.add(computer);
    }
    public long cost() 
    {
        long cost = 0;
        for (Computer c : computers) cost += c.cost();
        return cost;
    }
    @Override
    public String toString() 
    {
        StringBuilder sb = new StringBuilder("Order " + orderNumber
                + " for " + customer + " at $" + cost() / 100.0);
        for (Computer c : computers) sb.append("\n\n" + c);
        return sb.toString();
    }
    @Override
    public boolean equals(Object o) 
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return orderNumber==order.orderNumber&&Objects.equals(customer,order.customer) && Objects.equals(computers, order.computers);
        //gotta change it a little bit
    }
    @Override
    public int hashCode() 
    {
        return Objects.hash(customer,orderNumber,computers); //specifially for the orders. nothing else
    }
    private static long nextOrderNumber=0;
    private long orderNumber;
    private Customer customer;
    private ArrayList<Computer> computers = new ArrayList<>();
    
}
