/*
Name: Mary-Rose Tracy 
ID#:1001852753 
Assignment: P06 Email
TODO: see program comments below
Credit to Prof Rice
*/
package store;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
//NEW IMPORTS:
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
public class Customer 
{
    public Customer(String name, String email) 
    {
        int atIndex = email.indexOf('@', 0);
        int dotIndex = (atIndex >= 0) ? email.indexOf('.', atIndex) : -1;
        if(dotIndex < 0) // will be true if atIndex < 0, so don't check that
            throw new IllegalArgumentException("Invalid email address: " + email);
        this.name = name;
        this.email = email;
    }
    //NEWWWW
    public Customer(BufferedReader br) throws IOException 
    {
        name=br.readLine();
        email=br.readLine();
    }

    public void save(BufferedWriter bw) throws IOException
    {
        bw.write(name+"\n");
        bw.write(email+"\n");
    }
    //NEWW ^^^
    @Override
    public String toString() {
        return name + " (" + email + ")";
    }
    @Override
    public boolean equals(Object o) {
        try {
            if(this == o) return true;
            if(this.getClass() != o.getClass()) return false;
            Customer c = (Customer) o;
            return this.name.equals(c.name) && this.email.equals(c.email);
        } catch (Exception e) {
            return false;
        }
    }
    private String name;
    private String email;
}

