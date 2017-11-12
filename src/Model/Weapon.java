package Model;

public class Weapon extends Item
{
    //Removed due to time constraints
    public enum Type{Sword, Dagger, Bow}
    
    public Weapon(){}
    
    public Weapon(int value, String name)
    {
        super(value, name);
        this.picPath = "/Images/weapon.png";
    }
    

    
   
    
    public String toString()
    {
         return  "Weapon Name: " + this.getName() + ".\n" + "Value: " +
                 this.getValue() + " gp.\n";
    }
}
