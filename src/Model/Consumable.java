package Model;

public class Consumable extends Item
{
    //Removed due to time constraints
    public enum Type{HealthPotion, ManaPotion}
    
    public Consumable(){}
    
    public Consumable(int value, String name)
    {
        super(value, name);
        this.picPath = "/Images/consumable.png";
    }
    
     public String toString()
    {
         return  "Weapon Name: " + this.getName() + ".\n " + "Value: " + 
                 this.getValue() + " gp.\n";
    }
    
}
