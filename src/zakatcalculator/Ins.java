/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zakatcalculator;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Ashikur Rahman
 */
public class Ins extends JFrame {

    JTextArea ta;
    JLabel l1, l2, l3,lp;
    JScrollPane sc;
    

    Ins() {
        components();
    }

    public void components() {
        setLayout(null);
        ImageIcon img=new ImageIcon("mosque.png");
         lp = new JLabel();
        lp.setBounds(50, 10, 100, 70);
       lp.setIcon(img); 
        add(lp);
        
        l1 = new JLabel("Sariah Rules:");
        l1.setBounds(140, 0, 200, 65);
        l1.setFont(new Font("Montserrat", Font.BOLD, 15));
        add(l1);
        ta = new JTextArea();
        ta.setText("According to Islamic law, if 7.5 ounces  or 87.48 gm of gold or 52.5 ounces or "
                + "612.36 gm of silver or its equivalent is"
                + " deposited for one year, it is obligatory to pay Zakat of 2.5% of the total amount"
                + " according to its market value."+
                "\n"+"Gold price(22 carret ):5,00,000 BDT"+"\n"
                +"Silver price(22 carret ):70,000 BDT"
        +"\n"
                +"If you have this amount then you can calculate you zakah money."+"\n"+"\t      THANK YOU :)");
        ta.setBounds(30, 110, 490, 300);
        ta.setBorder(BorderFactory.createBevelBorder(1));
        ta.setFont(new Font("Comic Sans", Font.PLAIN, 20));
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);
        ta.setEditable(false);
        sc = new JScrollPane(ta);
        sc.setBounds(30, 110, 490, 300);
        add(sc);//adding scrollpane to text area
        
 getContentPane().setBackground(Color.WHITE);
    }

    public static void main(String[] args) {
        Ins frame = new Ins();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(570, 500);
        frame.setLocation(20,50);
    }
}
