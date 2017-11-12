package Model;

public class Wearable extends Item
{
    //Removed due to time constraints
    public enum Type{Helmet, Gauntlet, ChestPlate}
    
    public Wearable(){}

    
    public Wearable(int value, String name)
    {
        super(value, name);
        this.picPath = "/Images/wearable.png";
    }
    
    
      public String toString()
    {
         return  "Wearable Name: " + this.getName() +  ".\n " + "Value: " +
                 this.getValue() + " gp.\n";
    }
}
