package Model;

public class Consumable extends Item
{
    Type type;
    public enum Type{HealthPotion, ManaPotion}
    
    public Consumable(){}
    
     public Consumable(Type type, int value, String name)
    {
        super(value, name);
        this.picPath = "/Images/consumable.png";
        this.type = type;
    }
    
     public String toString()
    {
         return  "Item Name: " + this.getName() + ".\n " + "Value: " + 
                 this.getValue() + " gp.\n" + "Consumable Type: " +  this.type + ".\n";
    }
    
}
