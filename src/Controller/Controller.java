package Controller;
import View.*;
import javax.swing.JFrame;
public class Controller 
{
    private static boolean running;
    private static Inventory i;
    
    public static void main(String[] args) 
    {
        Controller c = new Controller();
        //c.run();
    }
    
    
    public void run()
    {
        i = new Inventory();
        while(running)
        {
            //Show GUI
            
        }
    }
}
