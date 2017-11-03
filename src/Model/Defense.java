package Model;

public class Defense extends Item
{
    Type type;
    private int armour;
    
    
    public enum Type{Buckler, Kite, Spiked};
    
    public Defense(){}
    
    public Defense(Type type, int armour, int value, String name)
    {
        super(value, name);
        this.picPath = "./Images/defense.png";
        this.armour = armour;
        this.type = type;
    }
    
     public String toString()
    {
        return "";
    }
    
}
