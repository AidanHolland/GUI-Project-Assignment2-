package View;
import javax.swing.*;
import java.awt.event.*;
import Model.*;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import java.awt.Dimension;


public class Inventory extends JFrame implements ActionListener
{
    public static Inventory i;
    
    //Main section
    private JFrame frame = new JFrame("Inventory");
    private JTabbedPane tabs = new JTabbedPane();
    //Left Side
    private JTextArea info;
    private JPanel infoFrame = new JPanel();
    
    //Tabs
    private JPanel consumableTab = new JPanel();
    private JPanel defenseTab = new JPanel();
    private JPanel weaponTab = new JPanel();
    private JPanel wearableTab = new JPanel();
    
    //Right Side
    private JPanel buttons = new JPanel();
    JButton addButton;
    JButton deleteButton;
    private JLabel nameLabel;
    static JTextField itemNameInput;
    private JLabel valueLabel;
    static JTextField itemValueInput;
    private JLabel typeLabel;
    String[] itemTypes = {"Weapon", "Defense", "Wearable", "Consumable"};
    JComboBox itemType = new JComboBox(itemTypes);
    
   
    

    
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
        createGrids();
        createButtons();
        createTextBoxes();
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);
        
        frame.setSize(600, 400);
        //Centre frame
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.add(tabs);
        frame.add(bagGrid.getPanel(), BorderLayout.SOUTH);
        frame.add(buttons, BorderLayout.EAST);
        frame.add(infoFrame, BorderLayout.WEST);
       
        i = this;
        
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
        
      bagGrid = new Grid(1, 5, "Bag");  
      consGrid = new Grid(5, 5, "Consumable");
      consumableTab.setLayout(new BorderLayout());
      consumableTab.add(consGrid.getPanel(), BorderLayout.CENTER);
      //Defense Tab
      defGrid = new Grid(5, 5, "Defense");
      defenseTab.setLayout(new BorderLayout());
      defenseTab.add(defGrid.getPanel(), BorderLayout.CENTER);
      
      //Weapon Tab
      wepGrid = new Grid(5, 5, "Weapon");
      weaponTab.setLayout(new BorderLayout());
      weaponTab.add(wepGrid.getPanel(), BorderLayout.CENTER);
      //Wearable Tab
      wearGrid = new Grid(5, 5, "Wearable");
      wearableTab.setLayout(new BorderLayout());
      wearableTab.add(wearGrid.getPanel(), BorderLayout.CENTER);
      
    }
    
    private void createButtons()
    {
        buttons.setLayout(new BoxLayout(buttons, BoxLayout.Y_AXIS));
       
    
        JButton addButton = new JButton("Add an Item");
        JButton deleteButton = new JButton("Delete an Item");
        nameLabel = new JLabel("Enter Item Name");
        itemNameInput = new JTextField (1);
        valueLabel = new JLabel("Enter Item Value");
        itemValueInput = new JTextField(1);
        typeLabel = new JLabel("Select Item type");
        
        addButton.addActionListener(this);
        deleteButton.addActionListener(this);
        buttons.add(addButton);
        buttons.add(deleteButton);
        buttons.add(nameLabel);
        buttons.add(itemNameInput);
        buttons.add(valueLabel);
        buttons.add(itemValueInput);
        buttons.add(typeLabel);
        buttons.add(itemType);
    }
    
    private void createTextBoxes()
    {
        info = new JTextArea(17, 10);
        infoFrame.add(info);
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
    
 
    public void actionPerformed(ActionEvent a)
    {
            Weapon wep;
            Defense def;
            Wearable wear;
            Consumable con;
            System.out.println("You have clicked the add button!");

            if(itemType.getSelectedItem().toString() == "Weapon")
            {
                System.out.println("Recognised Weapon Input");
                int result = Integer.parseInt(itemValueInput.getText());
                wep = new Weapon(result, itemNameInput.getText());
                System.out.println("Weapon Created, name is " + wep.getName() + "Value is: " + wep.getValue());
                //For each gridpanel in the weapon panels
                for(int i = 0; i < wepGrid.panelArray.length; i++)
                {
                    System.out.println("Entered for loop");
                    if(wepGrid.panelArray[i].hasItem() == false)
                    {
                        System.out.println("No item located in: " + wepGrid.panelArray[i].getName());
                        //Add item to this item if it doesnt have one
                        wepGrid.panelArray[i].setItem(wep);
                        System.out.println(wepGrid.panelArray[i].getName() + " now has item?\n" + wepGrid.panelArray[i].hasItem());
                        return;
                    }
                }

            }
            else if(itemType.getSelectedItem().toString() == "Defense")
            {
                int result = Integer.parseInt(itemValueInput.getText());
                def = new Defense(result, itemNameInput.getText());
                 for(int i = 0; i < defGrid.panelArray.length; i++)
                {
                    if(defGrid.panelArray[i].hasItem() == false)
                    {
                        //Add item to this item if it doesnt have one
                        defGrid.panelArray[i].setItem(def);
                        return;
                    }
                }
            }
            else if(itemType.getSelectedItem().toString() == "Wearable")
            {
                int result = Integer.parseInt(itemValueInput.getText());
                wear = new Wearable(result, itemNameInput.getText());
                 for(int i = 0; i < wearGrid.panelArray.length; i++)
                {
                    if(wearGrid.panelArray[i].hasItem() == false)
                    {
                        //Add item to this item if it doesnt have one
                        wearGrid.panelArray[i].setItem(wear);
                        return;
                    }
                }
            }
            else if(itemType.getSelectedItem().toString() == "Consumable")
            {
                  int result = Integer.parseInt(itemValueInput.getText());
                  con = new Consumable(result, itemNameInput.getText());
                 for(int i = 0; i < consGrid.panelArray.length; i++)
                {
                    if(consGrid.panelArray[i].hasItem() == false)
                    {
                        //Add item to this item if it doesnt have one
                        consGrid.panelArray[i].setItem(con);
                        return;
                    }
                }
            }
        

    }

    
}

