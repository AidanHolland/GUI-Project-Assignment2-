package Controller;
import Model.Item;
import View.*;
import java.util.*;
import java.io.File;

import javax.swing.JFrame;
public class Controller 
{
    private static boolean running;
    private static Inventory i;
    private ArrayList<Item> bag;

    
    
    public void run()
    {
        i = new Inventory();
        System.out.println(new File("").getAbsolutePath());
        while(running)
        {
            //Show GUI
            
        }
    }
    
    
    
    
    public void addItem(Item i)
    {
        //
    }
}
