package View;

import javax.swing.JFrame; 
import javax.swing.JButton; 
import java.awt.GridLayout;
import Items.*;

public class Grid 
{
    //Have an option for width and height
    JFrame frame = new JFrame();
    JButton[][] grid;
    GridType type;
    
    public enum GridType{Weapon, Defense, Wearable, Consumable}
    
    public Grid(int width, int height, GridType type)
    {
        this.type = type;
        frame.setLayout(new GridLayout(width, height));
        grid = new JButton[width][height];
        for(int y = 0; y < height; y++)
        {
            for(int x = 0; x < width; x++)
            {
                grid[x][y] = new JButton();
            }
        }
    }
    
    
    private void loadWith(Class<? extends Item> itemClass)
    {
        
    }

    //Optional, allow for moving items from one spot to another
    //If mouse button clicked down on image
    //While Mouse button down and mouse moving
    //Create copy of image with higher opacity with coordinates of mouse
    //Once that is no longer true
    //Delete object from original spot
    //Create object in new spot
    
    
    
    
    
}
