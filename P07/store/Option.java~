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
//NEW IMPORTS:
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
public class Option {
    public Option(String name, long cost) {
        if(cost < 0) throw new IllegalArgumentException("Negative cost for " + name + ": " + cost);
        this.name = name;
        this.cost = cost;
    }
    //NEWWWWW
     public Option(BufferedReader br)throws IOException
     {
        this.name=br.readLine();
        this.cost=Long.parseLong(br.readLine());
    }
    public void save(BufferedWriter bw)throws IOException 
    {
        bw.write(this.name+'\n');
        bw.write(""+this.cost+'\n');
    }
    //NEWW^^^
    public long cost() {
        return this.cost;
    }
    @Override
    public String toString() {
        return name + " ($" + String.format("%.2f", cost / 100.0) + ")";
    }
    @Override
    public boolean equals(Object o) {
        try {
            if(this == o) return true;
            if(this.getClass() != o.getClass()) return false;
            Option p = (Option) o;
            return this.name.equals(p.name) && (this.cost == p.cost);
        } catch (Exception e) {
            return false;
        }
    }

    protected String name;
    protected long cost;
}
