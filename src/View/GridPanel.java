package View;
import javax.swing.ImageIcon;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import javax.swing.JLabel;
import Model.Item;

public class GridPanel extends JPanel implements MouseListener
{
    private Item item;
    private BufferedImage img = null;
    private boolean statsShowed = false;
    JLabel label;
    public static GridPanel g;
    private Grid ref;
    
   public GridPanel(BorderLayout b, String classInput)
   {
        super(b);
        //Change to empty once testing complete
        setImage(classInput); 
        checkClass(classInput);
        instantiate();
        
   }
   
   public GridPanel(BorderLayout b)
   {
        super(b);
        //Change to empty once testing complete
        instantiate();
        
   }
   
   private void instantiate()
   {
       addMouseListener(this);
   }
    
   private void setImage(String path)
   {
       InputStream resourceAsStream = Grid.class.getResourceAsStream(path);
        try
        {
            //Loading image and scaling to label size
            img = ImageIO.read(resourceAsStream);
            label = new JLabel();
            label.setSize(60, 60);
            Image scaledImage = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
            label = new JLabel(new ImageIcon(scaledImage));
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
       this.add(label);
   }
    
    public void addItem(Item i)
    {
        this.item = i;
        try
        {
           setImage(item.getPicPath());
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    public void deleteItem()
    {
        item = null;
        setImage("/images/empty.png");
        
    }
    
    //Check which subclass to instantiate for item to hold.
    private void checkClass(String classInput)
    {
        switch(classInput)
        {
            case "Consumable":
                //item = new Consumable();
                break;
            case "Defense":
                //item = new Defense();
                break;
            case "Weapon":
                //item = new Weapon();
                break;
            case "Wearable":
                //item = new Wearable();
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
               //Inventory.i.createStatsBox(item);
                statsShowed = true;
            }
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
   }
    
   @Override
    public void mousePressed(MouseEvent e) 
    {
        //mousePressedGrid(e);
    }
    @Override
  public void mouseReleased(MouseEvent e) 
  {
      //releaseMouseOnGrid(e);
  }
  @Override
  public void mouseClicked(MouseEvent e) 
  {
      //If we have no temp variable
     if(g == null && this.hasItem())
     {
         g = (GridPanel)e.getSource();
         System.out.println("You clicked on" + g.getName());
     }
     else if(g != null)
     {
         if(g.hashCode() == this.hashCode())
         {
             System.out.println("You clicked on the same square (Number: " + g.getName());
             g = null;
         }
         else if(g.hashCode() != this.hashCode())
         {
             if(!this.hasItem() && g.hasItem())
             {
                 setItem(g.getItem());
             }
             else if(this.hasItem() && g.hasItem())
             {
                 Item tempItem = this.getItem();
                 //Setting this item to be what the other item is
                 setItem(g.getItem());
                 for(int i = 0; i < ref.getPanelArray().length; i++)
                 {
                     //Botched method for finding origin, go through all original references and compare to temp
                     if(ref.getPanelArray()[i].hashCode() == g.hashCode())
                     {
                         //Setting temp gridpanel with item from this gridpanel, then cloning original to this.
                         g.setItem(tempItem);
                         ref.getPanelArray()[i] = g;
                     }
                 }
             }
         }
     }
  }
    @Override
  public void mouseEntered(MouseEvent e) 
  {
    //Highlight
    statsShowed = true;
    if(this.hasItem())
    {
       Inventory.i.createStatsBox(this.getItem());
    }
    setBackground(Color.GRAY);
    GridPanel temp = (GridPanel)e.getSource();
    System.out.println("You entered: " + temp.getName() + " at: " + temp.getRef().getClassInput());
  }

    @Override
  public void mouseExited(MouseEvent e) 
  {
      //Un-highlight
      setBackground(Color.WHITE);
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
 
    public Item getItem()
    {
        return item;
    }
    
    public void setItem(Item item)
    {
        this.item = item;
        setImage(item.getPicPath());
    }
    
    public boolean hasItem()
    {
        if(this.item != null)
        {
            return true;
        }
        return false;
    }

    public GridPanel getGrid()
    {
        System.out.println("Get Grid Returning: " + this.g.getName());
        return this.g;
       
    }
    public void setGrid(GridPanel g)
    {  
        this.g = g;
        System.out.println("Set grid to:" + this.g.getName());
    }
    
    
    
    public void setRef(Grid ref)
    {
        this.ref = ref;
    }
    
    public Grid getRef()
    {
        return ref;
    }

    
}
