package View;
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
    
    
    public Inventory()
    {
        
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
    public JFrame getFrame()
    {
        return frame;
    }
    
}
