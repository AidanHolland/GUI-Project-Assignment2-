package View;
import Items.*;
import javax.swing.*;

public class Inventory extends JFrame
{
    //Main section
    JFrame frame = new JFrame("Inventory");
    JTabbedPane tabs = new JTabbedPane();
    
    JPanel consumableTab = new JPanel();
    JPanel defenseTab = new JPanel();
    JPanel weaponTab = new JPanel();
    JPanel wearableTab = new JPanel();
    
    
    //Consumable Tab
    //Grid consGrid = new Grid(5,5);
    
    
    //Defense Tab
    
    
    //Weapon Tab
    
    //Wearable Tab
    
    public Inventory()
    {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void itemComboBox()
    {
        //Upon click of button
        //For each Item type listed
        //Show Item in combobox
        //Upon clicking item combobox
        //Call function addItem
        
    }
    
    
    public JFrame getFrame()
    {
        return frame;
    }
    
}
