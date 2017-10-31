package Model;

public class Weapon extends Item
{
    Type type;
    private int damage;
    private String wepType;
    
    public enum Type{Sword, Dagger, Bow}
   
    public Weapon()
    {
        
    }
    
    public String toString()
    {
        return "";
    }
}
