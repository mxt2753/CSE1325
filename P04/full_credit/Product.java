/*
Name: Mary-Rose Tracy 
ID#:1001852753 
Assignment: P04 Store Taxed & untaxed Items
TODO: see program comments below
*/
//The abstract product
public abstract class Product 
{

    public Product(String name, double cost) 
    {
        this.name = name;
        this.cost = cost;
        //just to make sure we don't have any errors
        if(cost<0) 
        {
            throw new RuntimeException("Cost can't be negative");
        }
        //says we need to create an exception
    }
    //we just need to class it nothing else
    //+ price () double <<abstract>>
    public abstract double price();
    //toString(): String <<override>>
    @Override
    public String toString() 
    {
        //now wee need to place the format of the program. so the Name_of_Product, the_original_cost, The_final_price(taxedoruntaxed)
        return String.format("%s ($%.2f) $%.2f",name,cost,price());
    }
    //we need protected cost W/ String Name
    protected final double cost;
    protected final String name;
}
