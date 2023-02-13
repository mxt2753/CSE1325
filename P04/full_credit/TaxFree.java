/*
Name: Mary-Rose Tracy 
ID#:1001852753 
Assignment: P04 Store Taxed & untaxed Items
TODO: see program comments below
*/
//IS ABSTRACT SO EXTENDS THE PRODUCT same with Taxed
public class TaxFree extends Product 
{
    
    public TaxFree(String name, double cost) 
    {
        //java is a reference variable that is used to refer to parent class objects
        //name & cost can be super
        super(name,cost);
    }
    //since this is the TaxFree all we need to do is return the cost
    @Override
    public double price() 
    {
        return cost;
    }
    //pretty self-explanitory
}
