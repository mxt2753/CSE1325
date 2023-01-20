/*
Name: Mary-Rose Tracy 
ID#:1001852753 
Assignment: P01 saying hello 
TODO: Prompting the program to say 1) what is your name 2) user putting in name 3) then spitting out "hello (insert weird name including weird characters)"
*/
import java.util.Scanner; // we need scanner function
public class Hello 
{
    public static void main(String[] args)
    {
		Scanner whatsTheUserName = new Scanner(System.in); 
		//first we get the users name
		System.out.print("Hello, what's your name? "); 
		//make computer prompt for a name
		String userName = whatsTheUserName.nextLine();
		//then take the string of thwe user name and put it on the next line of the promple 
		System.out.println("Hello, " + userName + "!"); 
		//the final result
		whatsTheUserName.close();
	}
}
