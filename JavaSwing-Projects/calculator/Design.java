import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Design{
    public void body(){
        JFrame f=new JFrame("Calculator");

        JButton b1 = new JButton("button1"); 
        JButton b2 = new JButton("button2"); 
        JButton b3 = new JButton("button3"); 
  
        // Creating a panel to add buttons 
        JPanel p = new JPanel(); 
        p.setBounds(100, 100,100, 300); 
        p.setBackground(Color.red); 
  
        // Adding buttons and textfield to panel 
        // using add() method 
        p.add(b1); 
        p.add(b2); 
        p.add(b3);
  
        // setbackground of panel 
  
        // Adding panel to frame 
        f.add(p); 
  
        // Setting the size of frame 
        f.setSize(700,500);  
  
        f.getContentPane().setBackground(Color.cyan);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // f.show(); 
        f.setLayout(null); 
        f.setVisible(true);
    } 
}