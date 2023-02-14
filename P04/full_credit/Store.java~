/*
Name: Mary-Rose Tracy 
ID#:1001852753 
Assignment: P04 Store Taxed & untaxed Items
TODO: see program comments below
*/
//let's do the imports
import java.util.ArrayList;
import java.util.Scanner;

public class Store 
{
    

    public static void main(String[] args) 
    {
        //let's set ThetaxRate, and let's set it before we plug in the taxed and untaxed items
        Taxed.setTaxRate(0.0825);
        //now let's plug in the TaxFree java products.
        products.add(new TaxFree("Flour", 3.40));
        products.add(new TaxFree("Milk", 3.38));
        products.add(new TaxFree("Cheese", 5.98));
        //suprising I know. it says it's taxfree on the website
        products.add(new TaxFree("Cake Mix", 1.38)); 
        //now the taxed which I know are gonna give me problems 
        //now let's plug in the Taxed.java products.
        products.add(new Taxed("Gum", 6.82));
        products.add(new Taxed("Nerds", 3.98));
        products.add(new Taxed("Popcorn", 2.98));
        products.add(new Taxed("Poptart", 4.68));

        Scanner scanner = new Scanner(System.in);
        while(true) 
        {
        
            System.out.println("========================");
            System.out.println(" Welcome to the Store ");
            System.out.println("========================");
            System.out.println();
            
            System.out.println("Available Products:");
            for(int i=0;i<products.size();i++) 
            {
                System.out.println(i+") "+products.get(i));
                //this is to get the #) on the end
            }
            System.out.println();
            //THE PROBLEMM
            //so if shoppingcart is NOT empty then show the total cost of the price
            if(!(shoppingCart.isEmpty()))
            {
                double total = 0.0;
                System.out.println("Current Order \n-------------");
                System.out.println();
                for(int i=0;i<shoppingCart.size();i++)
                {
                    System.out.println(shoppingCart.get(i)); //tried: itemNumber, item, 
                    total+=shoppingCart.get(i).price();
                }
                
                System.out.printf("Total Price: $%.2f",total); //new
                System.out.println();
            }
            //I got everything working except for the total part so I went over & redid the the total cost
            /*
            System.out.println("Current Order \n-------------");
            double total = 0.0; //new
            for (Product product : shoppingCart) //Edit Here!!!
            {
                
               
                System.out.println(product);
            }
            System.out.printf("Total Price: $%.2f", total); //new
            System.out.println(); //new
            //The Problem
            */
            System.out.print("Buy which product?\n");
            //intialize item Number to scan it
            int itemNumber =scanner.nextInt();
            //if item number is less than 0 which it is break, and then add it to shopping cart
            if (itemNumber < 0) 
            {
                break;
            }
            try 
            {
                //Total+=shoppingCart.get(index).price(); NEW
                shoppingCart.add(products.get(itemNumber));
            } 
            catch(IndexOutOfBoundsException e) //meaning if we say 10 and the computer can't read it then it'll say invalid 
            {
                System.out.println("Invalid item number. Please try again.");
            }
        }
        //just want to be extra with my code. not in the example code at all
        //could just do exit, but meh
        System.out.println("Exiting the store...");
    }
    private static ArrayList<Product> products = new ArrayList<>();
    private static ArrayList<Product> shoppingCart = new ArrayList<>();
}
