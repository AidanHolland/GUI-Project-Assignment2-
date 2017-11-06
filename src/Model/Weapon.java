package Model;

public class Weapon extends Item
{
    Type type;
    private int damage;
    private String wepType;
    
    public enum Type{Sword, Dagger, Bow}
    
    public Weapon(){}
    
    public Weapon(Type type, int damage, int value, String name)
    {
        super(value, name);
        this.picPath = "./Images/weapon.png";
        this.damage = damage;
        this.type = type;
    }
    
    public int getDamage()
    {
        return damage;
    }
    public void setDamage(int damage)
    {
        this.damage = damage;
    }
    
    public Type getType()
    {
        return type;
    }
    
    public String toString()
    {
         return  "Item Name: " + this.getName() + ".\n" + "Damage: " + this.getDamage() + 
                ".\n " + "Value: " +this.getValue() + " gp.\n" + "Weapon Type: " +  this.getType() + ".\n";
    }
}
