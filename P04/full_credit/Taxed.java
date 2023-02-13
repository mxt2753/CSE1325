/*
Name: Mary-Rose Tracy 
ID#:1001852753 
Assignment: P04 Store Taxed & untaxed Items
TODO: see program comments below
*/
//IS ABSTRACT SO EXTENDS THE PRODUCT same with TaxFree
//now we have to do this just like TaxFree. ONLY this time we need to calculate tax with the Override
public class Taxed extends Product 
{
    
    //Taxed(name : String, cost Double)
    public Taxed(String name, double cost) 
    {
        super(name, cost);
    }
    //setTaxRate(salesTax: double) <<static>>
    public static void setTaxRate(double salesTax) 
    {
        salesTaxRate=salesTax;
    }
    //+price () double <<override>>
    @Override
    public double price() 
    {
        return cost*(1+salesTaxRate);
    }
    //we need to initialize the SalesTaxRate = 0.0 because it's a double
    //-tax: double static
    //couldnt fu=igure out why my code wasn't working but the salesTaxRate in the end has to be private static double
    private static double salesTaxRate = 0.0; //saleTaxRate NOT tax I think thats a typo in the instructions
    //because there is nowhere else to do the variable tax. unless i did the code more condensed
}
