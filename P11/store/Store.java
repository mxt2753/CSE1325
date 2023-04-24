/*
Name: Mary-Rose Tracy 
ID#:1001852753 
Assignment: P06 Email
TODO: see program comments below
we ain't gonna do touch this file essentially
credit to prof rice
*/
package store;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
public class Store 
{
    public Store(String name) 
    {
        this.name = name;
    }
    public Store(BufferedReader br) throws IOException 
    {
        this.name = br.readLine();
        int numItems = Integer.parseInt(br.readLine());
        while (numItems-- > 0) customers.add(new Customer(br));
        numItems = Integer.parseInt(br.readLine());
        while (numItems-- > 0) options.add(new Option(br));
        numItems = Integer.parseInt(br.readLine());
        while (numItems-- > 0) computers.add(new Computer(br));
        numItems = Integer.parseInt(br.readLine());
        while (numItems-- > 0) orders.add(new Order(br));
    }
    public void save(BufferedWriter bw) throws IOException 
    {
        bw.write(name + '\n');
        save(bw, customers);
        save(bw, options);
        save(bw, computers);
        save(bw, orders);
    }
    //instead of priave save we are doing a savable to make it shorter
    private<T extends Saveable> void save(BufferedWriter bw,Set<T>set)throws IOException
    {
        bw.write(set.size() + "\n");
        for (T item : set)
        {
            item.save(bw);
        }
    }
    public String name()
    {
        return this.name;
    }
    public void add(Customer customer) 
    {
        customers.add(customer);
    }
    public Object[] customers()
    {
        return this.customers.toArray();
    }
    public void add(Option option) 
    {
        options.add(option);
    }
    public Object[] options()
    {
        return this.options.toArray();
    }
    public void add(Computer computer)
    {
        computers.add(computer);
    }
    public Object[] computers() 
    {
        return this.computers.toArray();
    }
    public void add(Order order) 
    {
        orders.add(order);
    }
    public Object[] orders() 
    {
        return this.orders.toArray();
    }
    private String name;
    //add the UML diagram 
    private TreeSet<Customer>customers=new TreeSet<>();
    private HashSet<Option>options=new HashSet<>();
    private HashSet<Computer>computers=new HashSet<>();
    private HashSet<Order>orders=new HashSet<>();
}
