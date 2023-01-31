/*
Name: Mary-Rose Tracy 
ID#:1001852753 
Assignment: P02 getting an animals/pets w/name type age 
TODO:Hard code info but then print it all out. connect it to the Pet.java essentially
*/
import java.util.Scanner;
import java.util.Arrays;
//now the public class MyPets 
//Since this is the main to run it we just do "java MyPets"
public class MyPets 
{
    public static void main(String[] args) 
    {
        //let's make an array that harcodes the information about the domesticated animals
        //we need six o these things 
        Pet[] Pets = 
        {
            new Pet("Freyja",6.9,Type.Raven),new Pet("Bigwig",4.8,Type.Rabbit),new Pet("Shaun",3.0,Type.Sheep),new Pet("Otis",5.7,Type.Cow), 
            new Pet("Spirit",8.5,Type.Horse),new Pet("Mr.Finneaus",10.0,Type.Dolphin)
            //couldn't figure out for the longest why it wasn't working. it's because I totally forgot that you were suppose to put the ; out of the function. instead of inside. 
        }; 
        //then we print out the domesticated animals
        //From the Statements.java 
        for (Pet Pet:Pets) //These HAVE to be Pets vocab because it wasn't wokring with anything else cuz it's connected to Pet.java
        {
            System.out.println(Pet);
        }
    }
}
