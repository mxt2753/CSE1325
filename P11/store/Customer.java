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
import java.util.Objects;
public class Customer implements Comparable<Customer>,Saveable //lets do implements
{
    public Customer(String name, String email)
     {
        int atIndex = email.indexOf('@', 0);
        int dotIndex = (atIndex >= 0) ? email.indexOf('.', atIndex + 1) : -1;
        if (dotIndex < 0) throw new IllegalArgumentException("Invalid email address: " + email);
        this.name = name;
        this.email = email;
    }
    public Customer(BufferedReader br) throws IOException 
    {
        this.name = br.readLine();
        this.email = br.readLine();
    }
    public void save(BufferedWriter bw) throws IOException 
    {
        bw.write(name + '\n');
        bw.write(email + '\n');
    }
    @Override
    public String toString()
    {
        return name + " (" + email + ")";
    }
    @Override
    public boolean equals(Object o) 
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(name, customer.name) && Objects.equals(email, customer.email);
    }
    @Override
    public int hashCode() 
    {
        return Objects.hash(name, email);
    }
    @Override //gotta make a compare to to get the names in alphabetical order
    //we do it after the hashcode so we can have it all otgether not before
    public int compareTo(Customer other) 
    {
        int Solut=name.compareTo(other.name);
        if(Solut!=0) 
        {
            return Solut;
        }
        return email.compareTo(other.email);
    }
    private String email;
    private String name;

}
