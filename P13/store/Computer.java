/*
Name: Mary-Rose Tracy 
ID#:1001852753 
Assignment: P06 Email
TODO: see program comments below
Computer.java
Credit to Prof Rice to get the baseline going
*/
package store;

import java.util.ArrayList;
import java.util.Objects;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.File;
public class Computer implements Saveable {
    public Computer(String name, String model) {
        this.name = name;
        this.model = model;
        this.active = true;
    }

    public Computer(String name, String model, boolean active) {
        this(name, model);
        this.active = active;
    }

    public Computer(BufferedReader br) throws IOException {
        this.name = br.readLine();
        this.model = br.readLine();
        this.active = Boolean.parseBoolean(br.readLine());
        int numOptions = Integer.parseInt(br.readLine());
        while(numOptions-- > 0)
            options.add(new Option(br));
    }

    @Override
    public void save(BufferedWriter bw) throws IOException {
        bw.write(name + '\n');
        bw.write(model + '\n');
        bw.write(Boolean.toString(active) + '\n');
        bw.write("" + options.size() + '\n');
        for(Option option : options)
            option.save(bw);
    }

    public void addOption(Option option) {
        options.add(option);
    }

    public long cost() {
        long cost = 0;
        for(Option o : options) cost += o.cost();
        return cost;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(name + " (" + model + ")" + (active ? "" : " [INACTIVE]"));
        for(Option o : options) sb.append("\n  " + o);
        return sb.toString();
    }
    public boolean hasActiveOptions() {
    for (Option option : options) {
        if (option.isActive()) {
            return true;
        }
    }
    return false;
}

    @Override
    public boolean equals(Object o) {
        try {
            if(this == o) return true;
            if(this.getClass() != o.getClass()) return false;
            Computer c = (Computer) o;
            return this.toString().equals(c.toString());
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, active, options);
    }

    private String name;
    private String model;
    private boolean active;
    private File filename;
    private ArrayList<Option> options = new ArrayList<>();
}
