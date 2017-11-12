package Model;

public class Defense extends Item
{
    //Removed due to time constraints
    public enum Type{Buckler, Kite, Spiked};
    
    public Defense(){}
    
    public Defense(int value, String name)
    {
        super(value, name);
        this.picPath = "/Images/defense.png";
    }
    
     public String toString()
    {
        return  "Item Name: " + this.getName() + ".\n" + "Value: " +
                this.getValue() + " gp.\n";
    }
    
}
