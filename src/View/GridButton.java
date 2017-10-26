package View;
import javax.swing.JButton;
import Items.*;
import java.awt.Image;
import javax.swing.ImageIcon;


public class GridButton extends JButton
{
    private Item[] item;
    private ImageIcon image;
    
    
    public GridButton()
    {
        item = new Item[1];
    }
    
    public void addItem(Item i)
    {
        this.item[0] = i;
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
        item[0] = null;
        image = null;
        this.setIcon(image);
    }
    
}
