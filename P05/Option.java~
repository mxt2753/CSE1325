/*
Name: Mary-Rose Tracy 
ID#:1001852753 
Assignment: P05 Email
TODO: see program comments below
*/
public class Option 
{
    //+ Option(String name, cost long)
    public Option(String name, long cost) 
    {
        this.name = name;
        this.cost = cost;
        //as the instructuons say make the cost have an illegalargument exceptions
        if(cost<0) 
        {
            throw new IllegalArgumentException("Cost cannot be negative");
        } 
    }
    //+ cost long
    public long cost() 
    {
        return cost;
        //just as simple as that.
    }
    //+ String toString()
    public String toString() 
    {
        double costInDollars=cost/100.0;
        return name+" ($"+costInDollars+ ")";
    }
    //+ boolean equals(Object o)
    public boolean equals(Object o)
    {
        if(o instanceof Option)
        {
            Option other=(Option) o;
            return this.name.equals(other.name)&&this.cost==other.cost;
        }
        return false;
    }
    //I thought this would be private, but the UML Diagram says otherwise
    protected long cost; //private 
    protected String name; //private
}
