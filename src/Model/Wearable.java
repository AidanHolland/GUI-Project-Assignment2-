package Model;

public class Wearable extends Item
{
    Type type;
    
    public enum Type{Helmet, Gauntlet, ChestPlate}
    
    public Wearable(){}
    
    public Type getType()
    {
        return type;
    }
    
      public String toString()
    {
         return  "Item Name: " + this.getName() +  ".\n " + "Value: " +
                 this.getValue() + " gp.\n" + "Weapon Type: " +  this.getType() + ".\n";
    }
}
