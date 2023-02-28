/*
Name: Mary-Rose Tracy 
ID#:1001852753 
Assignment: P05 Email
TODO: see program comments below
Order.java
*/
import java.util.ArrayList;
public class Order 
{
    //+ order Customer customer
    public Order(Customer customer) 
    {
        this.customer=customer;
        this.computers=new ArrayList<>();
        //we are going to do nextOrder number because of the instructons sounds like it
        this.orderNumber=nextOrderNumber++; //we need to index it
    }
    //addcomputer Computer computer 
    public void addComputer(Computer computer) 
    {
        this.computers.add(computer);
        //pretty self explanitory
    }
    //+toString String
    public String toString() 
    {
        //sounds like we are going to append like we did last time for the assignement
        StringBuilder StrB = new StringBuilder();
        
        StrB.append("Order ").append(this.orderNumber).append(" for ");
        
        StrB.append(this.customer.toString()).append("\n");
        
        for (Computer c:this.computers)
        {
            StrB.append(c.toString()).append("\n");
        }
        return StrB.toString();
    }
    //there is a lot of boolean functions
    public boolean equals(Object o)
    {
        if(o==this)
        return true;
        //if the object is not the INSTANCE of the order
        //learned from other class
        if(!(o instanceof Order))
        return false;
        Order other=(Order) o;
        if(!this.customer.equals(other.customer))
        return false;
        if(this.computers.size() != other.computers.size())
        return false;
        //for loop
        for(int i=0;i<this.computers.size();i++) 
        {
            if (!this.computers.get(i).equals(other.computers.get(i))) 
            {
                return false;
            }
        }
        return true;
    }
    //the privates
    private static long nextOrderNumber=0;
    private ArrayList<Computer> computers;
    private Customer customer;
    private long orderNumber;
   
}
