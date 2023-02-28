/*
Name: Mary-Rose Tracy 
ID#:1001852753 
Assignment: P05 Email
TODO: see program comments below
*/
public class Customer 
{
    //+ Customer name : String email : String 
    public Customer(String name, String email) 
    {
        //this ==name & Email
        this.name=name;
        this.email=email;
        /*
          I'm not gonna  do this to complicated                  Not? -1?
        if (email.contains("@")||email.indexOf(".")<email.indexOf("@")+1) 
        {
            throw new IllegalArgumentException("Invalid email address!");
        }
        ooohoohohoohho it's the rice DOT
       */
       //now illegal argument 
        if(!IVE(email)) 
        {
            throw new IllegalArgumentException("Invalid email address: "+email);
        } 
    }
    //I think it's better to make another function that tells if it's a valid email or not.rather than doing it all in the if illegal argument exception.
    private boolean IVE(String email) 
    {
        int AIX=email.indexOf('@');
        int DIX=email.indexOf('.',AIX);
        return (AIX>0&&DIX>AIX);
    }
    //+ String toString, but I don't think we are gonna override
    public String toString() 
    {
        return name+" ("+email+")";
    }
    //public equals & all the function is going to be boolean
    public boolean equals(Object o) 
    {
        /*
        public boolean equals(Object obj) 
        {
        if (obj instanceof Customer) 
        {
            Customer other = (Customer) obj;
            return this.name.==(other.name) && this.email.==(other.email);
       
        */
        //we are going to be using boolean operations so yeee.
        //if object or o equals This exact thing then say it's true
        if(this==o) 
        return true;
        //if object is not that then yeet 
        if(o==null || getClass()!=o.getClass())
        return false;
        //Customer is an obejct
        Customer customer=(Customer) o;
        //pretty sure we are gonna go and spit out the email eventually.
        return email.equals(customer.email);
    }
    //all the privates
    private String name;
    private String email;
}

