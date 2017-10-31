package View;
import javax.swing.*;
import Model.*;

public class Inventory extends JFrame
{
    //Main section
    JFrame frame = new JFrame("Inventory");
    JTabbedPane tabs = new JTabbedPane();
    
    JPanel consumableTab = new JPanel();
    JPanel defenseTab = new JPanel();
    JPanel weaponTab = new JPanel();
    JPanel wearableTab = new JPanel();
    
    JButton addButton;
    JButton deleteButton;
    
    //Consumable Tab
    Grid consGrid;
 
    //Defense Tab
    Grid defGrid;
    
    //Weapon Tab
    Grid wepGrid;
    
    //Wearable Tab
    Grid wearGrid;
    
    //Bag
    Grid bagGrid;
    
    public Inventory()
    {
        createButtons();
        createGrids();
        frame.setVisible(true);
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
    
    public void createComboBox()
    {
        
    }
    
    public void createButtons()
    {
        JButton addButton = new JButton();
        JButton deleteButton = new JButton();
    }
    
    public void createGrids()
    {
      //Consumable Tab
      consGrid = new Grid(5, 5, "Consumable");
      consumableTab.setLayout(consGrid);
      frame.add(consumableTab);
      //Defense Tab
      defGrid = new Grid(5, 5, "Defense");
      defenseTab.setLayout(defGrid);
      //Weapon Tab
      wepGrid = new Grid(5, 5, "Weapon");
      weaponTab.setLayout(wepGrid);
      //Wearable Tab
      wearGrid = new Grid(5, 5, "Wearable");
      wearableTab.setLayout(wearGrid);
      bagGrid = new Grid(5, 1, "Bag");
    }
    
    
    public static void createStatsBox(Item i)
    {
        
    }
    
    public static void deleteStatsBox()
    {
    }
    
    public JFrame getFrame()
    {
        return frame;
    }
    
    
    
}
