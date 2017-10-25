package Items;

public class Weapon extends Item
{
    Type type;
    private int damage;
    private String wepType;
    
    public enum Type{Sword, Dagger, Bow}
   
    public Weapon()
    {
        
    }
}
