package Model;

public abstract class Item 
{
    private int value;
    private String name;
    protected String picPath;
    
    
    public Item(){}
    
    
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
