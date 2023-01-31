/*
Name: Mary-Rose Tracy 
ID#:1001852753 
Assignment: P02 getting an animals/pets w/name type age 
TODO: Need to do humang age and human life span
*/
//let's list the imports just in case
import java.util.Scanner;
import java.util.Arrays;
//need public class Pet
public class Pet 
{

    public Pet(String name, double age, Type type) 
    {
        //let's keep it short & sweet.I noticed all of them are lower case from other code so no Captials
        this.name = name;
        this.age = age;
        this.type = type;
    }
    //now it's time for the humanAge : Double
    public double humanAge()
    {
        return humanLifespan*age/type.lifespan();
    }
    //now the String <<Override>>
    
    @Override
    public String toString()
    {
        return name+" is a "+type+" of age "+age+" or "+humanAge()+" in human-equivalent years"; //not we add the Human age
        //we also are gonna remove this.(BLANK).Cuz we are doing some coversions and also other file
    }
    //I know you suppose to put them in the top, but I think it doesn't matter yet. 
    private String name;
    private double age;
    private Type type;
    //definately private static final as a const like in C.
    private static final double humanLifespan=80.0;
}
