package View;
import Model.*;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.util.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.Icon;

public class GridButton extends JButton implements MouseListener
{
    private Item item;
    private ImageIcon image;
    private boolean statsShowed = false;
    
  
    
    public GridButton(String classInput)
    {
       
      checkClass(classInput);  
      addMouseListener(this);
      try
      {
        image = new ImageIcon("/Images/empty.png");
        
        
      }
      catch(Exception e)
      {
        System.out.println(e);
      }
      
     
    }
    
    public void addItem(Item i)
    {
        
        this.item = i;
        try
        {
            image = new ImageIcon(i.getPicPath());
            this.setIcon(image);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    public void deleteItem()
    {
        item = null;
        image = null;
        this.setIcon(image);
    }
    
    //Check which subclass to instantiate
    private void checkClass(String classInput)
    {
        switch(classInput)
        {
            case "Consumable":
                item = new Consumable();
                break;
            case "Defense":
                item = new Defense();
                break;
            case "Weapon":
                item = new Weapon();
                break;
            case "Wearable":
                item = new Wearable();
                break;
            case "Bag":
                break;
         
        }   
    }

   public void showStats()
   {
       //Create new box with stats from toString, 
       try
       {
            if(item.getName() != null)
            {
                Inventory.i.createStatsBox(item);
                statsShowed = true;
            }
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
   }
    
  
    public void mousePressed(MouseEvent e) 
    {
        //If mouse has started moving
        //Create new image at mouse coordinates and follow
        //Stop showing stats
        
    }

  public void mouseReleased(MouseEvent e) 
  {
    //Remove image
      
  }

  public void mouseClicked(MouseEvent e) 
  {
      //Create list of things that can be done
      //
  }

  public void mouseEntered(MouseEvent e) 
  {
      //Highlight
      
      //Show stats
      showStats();
  }

  public void mouseExited(MouseEvent e) 
  {
      //Un-highlight
      //Stop showing stats
      try
      {
            if(statsShowed == true)
            {
                Inventory.i.deleteStatsBox();
                statsShowed = false;
            }
      }
      catch(Exception ex)
      {
            System.out.println(ex);
      }
  }
 
    
    
}
