package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;

public class Grid extends JPanel
{
     GridPanel panelArray[];
     JPanel j = new JPanel();
     //Debugging reference
     private String classInput;
     
     public Grid(int row, int col, String classInput) 
     {
        this.classInput = classInput;
        panelArray = new GridPanel[row * col];
        j.setLayout(new GridLayout(row, col));

        for (int i = 1; i <= (row * col); i++) 
        {
            GridPanel panel = new GridPanel(new BorderLayout(), "/images/empty.png");
            //Not included in constructor to prevent override
            panel.setName(" space: " + i);
            panel.setEnabled(true);
            if(classInput != "Bag")
            {
                panel.setBackground(Color.WHITE);
                panel.setPreferredSize(new Dimension(30, 60));
                panel.setBorder(BorderFactory.createLineBorder(Color.BLACK)); 
            }
            else if(classInput == "Bag")
            {
                panel.setBackground(Color.WHITE);
                panel.setPreferredSize(new Dimension(20, 50));
                panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3)); 
            }
            //Add to array to find later
            panelArray[i - 1] = panel;
            j.add(panelArray[i - 1]);
        }
        //Set a reference to the grid its from
        for(int i = 0; i < panelArray.length; i++)
        {
           panelArray[i].setRef(this);
        }
        j.setVisible(true);
    }
     
    public JPanel[] getPanelArray()
    {
        return panelArray;
    }
    
    public JPanel getPanel()
    {
        return j;
    }
    
    public String getClassInput()
    {
        return classInput;
    }
    
    
}
