/*
Name: Mary-Rose Tracy 
ID#:1001852753 
Assignment: P05 Email
TODO: see program comments below
Computer.java
*/
import java.util.ArrayList;
public class Computer 
{
    public Computer(String name, String model)
    {
        //lets do this= Name & model
        this.name = name;
        this.model = model;
        //also we need an aarraylist
        options = new ArrayList<Option>();
    }
    //+addOption
    public void addOption(Option option)
    {
        options.add(option); //kept on getting errors so i made option with an s
    }
    //+long cost 
    public long cost() 
    {
        long TotC=0;
        //aka or total cost
        for (Option option  :  options) 
        {
            TotC+=option.cost();
        }
        return TotC;
    }
    //It sounds like we are suppose to do 
    //I thought we would do an @Override, but I guess not
    //+ String toString()
    public String toString()
    {
        StringBuilder StrB = new StringBuilder();
        StrB.append(name).append(" (").append(model).append(")\n");
        for (Option option : options) 
        {
            StrB.append(" ").append(option.toString()).append("\n");
        }
        return StrB.toString();
    }
    //+ boolean equals object o
    public boolean equals(Object o) 
    {
        //mirroring alot like order
        if(o==this) 
        {
            return true;
        }
        if(!(o instanceof Computer))
        {
            return false;
        }
        Computer c=(Computer) o;
        return this.toString().equals(c.toString());
    }
    private ArrayList<Option> options;
    private String model;
    private String name;
}
