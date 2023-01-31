/*
Name: Mary-Rose Tracy 
ID#:1001852753 
Assignment: P02 getting an animals/pets w/name type age 
TODO: Do an easy public enum type not anything else
*/
public enum Type 
{
    //The numbers in the second space is their predicted lifespan. (Not accurate to real life)
    //we need siz of these: we need to contain them with their name and avg lifespan
    Raven("Raven", 60.0),Rabbit("Rabbit", 30.0),Sheep("Sheep", 40.0),Cow("Cow", 75.0),Horse("Horse", 50.0),Dolphin("Dolphin", 20.0);
    
    Type(String TOfName, double lifespan)
    {
        this.lifespan = lifespan;
        this.TOfName = TOfName;
    }
    //both of lifespan & TOfName are going to be returned. because without it you won't see that on the terminal
    public double lifespan() 
    {
        return lifespan;
    }
    @Override
    public String toString()
    {
        return TOfName;
    }
    //since it is a this we also have to do private
    private String TOfName;
    //I got a weird error then I figured it out I forgot double
    private double lifespan;
}
