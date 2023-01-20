/*
Name: Mary-Rose Tracy 
ID#:1001852753 
Assignment: P01 saying hello 
TODO: makng the program automatically say your name without even prompting it 
NOTE: I dont know why but i cant change my name from student. so maybe ill show pngs from other compilers, but it does work!
*/
import java.util.Scanner;
public class Hello
{
	public static void main(String[] args) 
	{
	    String username = System.getProperty("user.name");
		System.out.println("Hello, "+ username + "!"); 
	}
}
