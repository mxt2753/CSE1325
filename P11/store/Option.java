/*
Name: Mary-Rose Tracy 
ID#:1001852753 
Assignment: P06 Email
TODO: see program comments below
credit to prof rice
*/
package store;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Objects;
public class Option implements Saveable 
{
    public Option(String name, long cost) 
    {
        if (cost < 0) throw new IllegalArgumentException("Negative cost for " + name + ": " + cost);
        this.name = name;
        this.cost = cost;
    }
    public Option(BufferedReader br) throws IOException
    {
        this.name = br.readLine();
        this.cost = Long.parseLong(br.readLine());
    }
    public void save(BufferedWriter bw) throws IOException 
    {
        bw.write(name + '\n');
        bw.write("" + Long.toString(cost) + '\n');
    }
    public long cost() 
    {
        return this.cost;
    }

    @Override
    public String toString() 
    {
        long cents = cost % 100;
        return name + " ($" + cost / 100 + "." + ((cents < 10) ? "0" : "") + cents + ")";
    }

    @Override
    public boolean equals(Object o) 
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Option option = (Option) o;
        return cost == option.cost &&
                Objects.equals(name, option.name);
                //gotta change it 
    }
    @Override
    public int hashCode() 
    {
        return Objects.hash(name,cost);
    }
    protected String name;
    protected long cost;
}
