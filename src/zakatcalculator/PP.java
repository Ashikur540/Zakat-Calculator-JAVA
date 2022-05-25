/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zakatcalculator;


import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ashikur Rahman
 */
public class PP extends JFrame {
    
    JButton bt1,bt2,bt3;
    JLabel lp,l1,l2,l3;
    
    PP() {
        components();
    }

    public void components() {
        this.setBounds(300,200,600,500);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        bt1=new JButton("ROCK");
        bt1.setBounds(100,100,80,50);
        add(bt1);
        ImageIcon img=new ImageIcon("mosque.png");
         lp = new JLabel("");
        lp.setBounds(150, 10, 100, 100);
       lp.setIcon(img); 
        add(lp);
    
    }
    
    
    public static void main(String[] args) {
        PP frame=new PP();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

