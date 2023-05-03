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
import java.io.File;
import java.util.Objects;

public class Customer implements Comparable<Customer>, Saveable {
    public Customer(String name, String email) {
        int atIndex = email.indexOf('@', 0);
        int dotIndex = (atIndex >= 0) ? email.indexOf('@', 0) : -1;
        if (dotIndex < 0) // will be true if atIndex < 0, so don't check that
            throw new IllegalArgumentException("Invalid email address: " + email);
        this.name = name;
        this.email = email;
        this.active = true;
    }

    public Customer(String name, String email, boolean active) {
        this(name, email);
        this.active = active;
    }

    public Customer(BufferedReader br) throws IOException {
        this.name = br.readLine();
        this.email = br.readLine();
        this.active = Boolean.parseBoolean(br.readLine());
    }

    @Override
    public void save(BufferedWriter bw) throws IOException {
        bw.write(name + '\n');
        bw.write(email + '\n');
        bw.write(Boolean.toString(active) + '\n');
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
    public void setFilename(File file) {
    this.filename = file;
}

public File getFilename() {
    return filename;
}
    

    
    /*public void setFilename(File file) {
    this.filename = file;
    }
    */

   
   

    @Override
    public String toString() {
        return name + " (" + email + ")" + (active ? "" : " [INACTIVE]");
    }

    @Override
    public boolean equals(Object o) {
        try {
            if (this == o) return true;
            if (this.getClass() != o.getClass()) return false;
            Customer c = (Customer) o;
            return this.name.equals(c.name) && this.email.equals(c.email) && this.active == c.active;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, active);
    }

    @Override
    public int compareTo(Customer rhs) {
        int result = this.name.compareTo(rhs.name);
        if (result == 0) result = this.email.compareTo(rhs.email);
        if (result == 0) result = Boolean.compare(this.active, rhs.active);
        return result;
    }

    private String name;
    private String email;
    private boolean active;
    private File filename;
}
