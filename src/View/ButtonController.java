package View;
import java.awt.event.*;

public class ButtonController implements ActionListener
{
    
    
    
    
    public void actionPerformed(ActionEvent a)
    {
        if(a.getSource() == Inventory.i.getAddButton())
        {
            
        }
        
        if(a.getSource() == Inventory.i.getDeleteButton())
        {
            
        }
    }
    
    
    public void addItem()
    {
        //Create a new window with details to add item in
            //After details entered, go through each of the jp array until you reach one with an empty item
            //Add the item to that empty item
    }
    
    
    public void deleteItem()
    {
        
    }
    
}
