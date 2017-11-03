package Model;

public abstract class Item 
{
    protected int value;
    protected String name;
    protected String picPath;
    
    
    public Item(){}
    
    public enum Type{};
    
    public Item(int value, String name)
    {
        this.value = value;
        this.name = name;
    }
    
    
    public void setValue()
    {
        
    }
    
    public int getValue()
    {
        return value;
    }
    
    public void setName()
    {
        
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setPicPath()
    {
        
    }
    
    public String getPicPath()
    {
        return picPath;
    }
    
    @Override
    public abstract String toString();
   
    
    
}
