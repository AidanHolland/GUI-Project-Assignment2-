package View;
import javax.swing.*;
import java.awt.event.*;
import Model.*;


public class Inventory extends JFrame implements ActionListener
{
    public static Inventory i;
    
    //Main section
    public static JFrame frame = new JFrame("Inventory");
    JTabbedPane tabs = new JTabbedPane();
    JTextArea info = new JTextArea();
    
    JPanel consumableTab = new JPanel();
    JPanel defenseTab = new JPanel();
    JPanel weaponTab = new JPanel();
    JPanel wearableTab = new JPanel();
    ButtonController bc;
    
    private JButton addButton;
    private JButton deleteButton;
    
    //Consumable Tab
    Grid consGrid;
 
    //Defense Tab
    Grid defGrid;
    
    //Weapon Tab
    Grid wepGrid;
    
    //Wearable Tab
    Grid wearGrid;
    
    //Bag (Bottom area)
    Grid bagGrid;
    
    public Inventory()
    {
        createTabs();
        createButtons();
        
        createGrids();
        frame.add(tabs);
        frame.setVisible(true);
        
        frame.setSize(600, 400);
        //Centre frame
        frame.setLocationRelativeTo(null);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
    }
    
    public void actionPerformed(ActionEvent e)
    {
        
    }
    
    private void itemComboBox()
    {
        //Upon click of button
        //For each Item type listed
        //Show Item in combobox
        //Upon clicking item combobox
        //Call function addItem
        
    }
    
    private void createComboBox()
    {
        
    }
    
    private void createButtons()
    {
        bc = new ButtonController();
        JButton addButton = new JButton();
        JButton deleteButton = new JButton();
        addButton.addActionListener(bc);
        deleteButton.addActionListener(bc);
    }
    
    private void createTabs()
    {
        tabs.addTab("Weapons", weaponTab);
        tabs.addTab("Defense", defenseTab);
        tabs.addTab("Wearables", wearableTab);
        tabs.addTab("Consumables", consumableTab);
    }
    
    private void createGrids()
    {
      //Consumable Tab
      consGrid = new Grid(5, 5, "Consumable");
      //consumableTab.add(consGrid.returnGrid());
      
      consumableTab.setLayout(consGrid);
      
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
    
    
    public void createStatsBox(Item i)
    {
        info.setText("");
        info.append(i.toString());        
    }
    
    public void deleteStatsBox()
    {
        info.setText("");
    }
    
    public JFrame getFrame()
    {
        return frame;
    }
    
    public JButton getAddButton()
    {
        return addButton;
    }
    
    public JButton getDeleteButton()
    {
        return deleteButton;
    }
    
}
