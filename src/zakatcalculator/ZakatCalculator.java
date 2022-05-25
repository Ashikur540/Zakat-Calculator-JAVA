/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zakatcalculator;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Ashikur Rahman
 */
public class ZakatCalculator extends JFrame implements ActionListener {
    
     JButton bi,b1, b2, b3;
    JTextArea ta;
    JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9,tf10,tf11;
    JLabel l1, l2, l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,lp,l13,l14,l15;
    JPanel p;
    JScrollPane sc;
    ImageIcon img;
    JSeparator s;
    
    
    
    ZakatCalculator() {
        components();
    }

    public void components() {
        
     
     setLayout(null);
     setLayout(null);
//        p = new JPanel();
//        p.setBackground(Color.ORANGE);
//        p.setBounds(0, 0, 700, 150);
//        add(p);

   ImageIcon img=new ImageIcon("hands.png");
         lp = new JLabel();
        lp.setBounds(50, 10, 100, 70);
       lp.setIcon(img); 
        add(lp);
        
        l1=new JLabel("Zakat Calculator");
        l1.setBounds(140, 0, 200, 65);
        l1.setFont(new Font("Montserrat", Font.BOLD, 20));
        add(l1);
        
        s=new JSeparator();
        s.setBounds(0,130,700,5);
        add(s);
        
        l2=new JLabel("- - What You Own - -");
        l2.setToolTipText("Fill up the fields below which suggests money you own right now");
        l2.setBounds(230, 120, 520, 40);
        l2.setFont(new Font("Nexa Demo", Font.BOLD, 14));
        add(l2);
        l3=new JLabel("please click below button to read Important Instructions");
        l3.setBounds(140, 50, 500, 40);
        l3.setFont(new Font("Raleway", Font.BOLD, 15));
        add(l3);
        
        bi=new JButton("!Instructions!");
        bi.setBounds(400,90,150,30);
        bi.setBackground(Color.ORANGE);
        bi.setForeground(Color.BLACK);
        bi.setFont(new Font("Montserrat", Font.BOLD, 12));
        add(bi);
        
        
        l4=new JLabel("Gold");
//        
        l4.setBounds(90,170,150,30);
        l4.setFont(new Font("Montserrat", Font.BOLD, 14));
        add(l4);
        tf1=new JTextField();
        tf1.setToolTipText("Calculate quantity of Gold u have in BDT ");
        tf1.setBounds(250,170,150,25);
        tf1.setFont(new Font("Raleway", Font.PLAIN, 14));
        add(tf1);
        
        l5=new JLabel("Silver");
//        l5.setToolTipText("Calculate quantity of silver u have in BDT ");
        l5.setBounds(90,210,150,30);
        l5.setFont(new Font("Montserrat", Font.BOLD, 14));
        add(l5);
        tf2=new JTextField();
        tf2.setToolTipText("Calculate quantity of silver u have in BDT ");
        tf2.setBounds(250,213,150,25);
        tf2.setFont(new Font("Raleway", Font.PLAIN, 14));
        add(tf2);
        
        l6=new JLabel("Cash");
        l6.setBounds(90,255,150,30);
        l6.setFont(new Font("Montserrat", Font.BOLD, 14));
        add(l6);
         tf3=new JTextField();
        tf3.setToolTipText("Total amount of Halal Cash available at you Bank and home");
        tf3.setBounds(250,255,150,25);
        tf3.setFont(new Font("Raleway", Font.PLAIN, 14));
        add(tf3);
        
        l6=new JLabel();
        l6.setText("Cash deposited");
        l6.setBounds(90,290,150,30);
        l6.setFont(new Font("Montserrat", Font.BOLD, 14));
        add(l6);
         tf4=new JTextField();
        tf4.setToolTipText("Amount you have deposited for future purpose.Eg:Hajj.");
        tf4.setBounds(250,294,150,25);
        tf4.setFont(new Font("Raleway", Font.PLAIN, 14));
        add(tf4);
        
        l7=new JLabel();
        l7.setText("Insurance");
        l7.setBounds(90,330,150,30);
        l7.setFont(new Font("Montserrat", Font.BOLD, 14));
        add(l7);
         tf5=new JTextField();
        tf5.setToolTipText("Your insurence money");
        tf5.setBounds(250,330,150,25);
        tf5.setFont(new Font("Raleway", Font.PLAIN, 14));
        add(tf5);
        
           l8=new JLabel();
        l8.setText("Conferred Debt");
        l8.setBounds(90,370,150,30);
        l8.setFont(new Font("Montserrat", Font.BOLD, 14));
        add(l8);
         tf6=new JTextField();
        tf6.setToolTipText("If you gave some amount as a loan to someone");
        tf6.setBounds(250,372,150,25);
        tf6.setFont(new Font("Raleway", Font.PLAIN, 14));
        add(tf6);
        
           l9=new JLabel();
        l9.setText("Value of Goods");
        l9.setBounds(90,410,150,30);
        l9.setFont(new Font("Montserrat", Font.BOLD, 14));
        add(l9);
         tf7=new JTextField();
        tf7.setToolTipText("Value of goods for your business according to market price");
        tf7.setBounds(250,412,150,25);
        tf7.setFont(new Font("Raleway", Font.PLAIN, 14));
        add(tf7);
        
           l10=new JLabel();
        l10.setText("Other Assets");
        l10.setBounds(90,445,150,30);
        l10.setFont(new Font("Montserrat", Font.BOLD, 14));
        add(l10);
         tf8=new JTextField();
        tf8.setToolTipText("Share or Foriegn currency or any other fund money or Due Zakat");
        tf8.setBounds(250,448,150,25);
        tf8.setFont(new Font("Raleway", Font.PLAIN, 14));
        add(tf8);
        
        s=new JSeparator();
        s.setBounds(0,490,650,5);
        add(s);
       
        l11=new JLabel("- - What You Owe - -");
        l11.setToolTipText("Fill up the fields below which suggests money you owe right now");
        l11.setBounds(220,495,170,30);
        l11.setFont(new Font("Nexa Demo", Font.BOLD, 14));
        add(l11);
        
         l12=new JLabel();
        l12.setText("Your Debts");
        l12.setBounds(90,527,150,30);
        l12.setFont(new Font("Montserrat", Font.BOLD, 14));
        add(l12);
         tf9=new JTextField();
        tf9.setToolTipText("If you are resposible for short time debt or loans to others");
        tf9.setBounds(250,530,150,25);
        tf9.setFont(new Font("Raleway", Font.PLAIN, 14));
        add(tf9);
        
         l13=new JLabel();
        l13.setText("Other Expences");
        l13.setBounds(90,560,150,30);
        l13.setFont(new Font("Montserrat", Font.BOLD, 14));
        add(l13);
         tf10=new JTextField();
        tf10.setToolTipText("Tax or rent or bills etc or others");
        tf10.setBounds(250,563,150,25);
        tf10.setFont(new Font("Raleway", Font.PLAIN, 14));
        add(tf10);
        
        b1=new JButton("Calculate");
        b1.setBounds(60,640,100,30);
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.BLACK);
        add(b1);
        b2=new JButton("Reset");
        b2.setBounds(240,640,100,30);
        b2.setForeground(Color.WHITE);
        b2.setBackground(Color.BLACK);
        add(b2);
        b3=new JButton("Exit");
        b3.setBounds(430,640,100,30);
        b3.setForeground(Color.WHITE);
        b3.setBackground(Color.BLACK);
        add(b3);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        bi.addActionListener(this);
        
        
       getContentPane().setBackground(Color.WHITE);
    }
    
    
      @Override
    public void actionPerformed(ActionEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   if (e.getSource() == b1) {
            
    float v1 = (float) ((Double.parseDouble(tf1.getText())));
    float v2 = (float) ((Double.parseDouble(tf2.getText())));
    float v3 = (float) ((Double.parseDouble(tf3.getText())));
    float v4 = (float) ((Double.parseDouble(tf4.getText())));
    float v5 = (float) ((Double.parseDouble(tf5.getText())));
    float v6 = (float) ((Double.parseDouble(tf6.getText())));
    float v7 = (float) ((Double.parseDouble(tf7.getText())));
    float v8 = (float) ((Double.parseDouble(tf8.getText())));
    
    float Total1=(v1+v2+v3+v4+v5+v6+v7+v8);
    //
    float v9 = (float) ((Double.parseDouble(tf9.getText())));
    float v10 = (float) ((Double.parseDouble(tf10.getText())));
    float Total2=(v10+v9);
    
    float TotalAmount=Total1-Total2;
    System.out.println(" amount:"+TotalAmount);
    float ZakatAmount=(float) (TotalAmount*0.025);
    System.out.println("Zakat payable amount:"+ZakatAmount);
    
    if(TotalAmount <70000){
        JOptionPane.showMessageDialog(null, "Total amount BDT:"+TotalAmount+" "+"\n"+"! You are not eligible for Zakat !");
    }
    else{
    String result="<html>Your total Amount:"+TotalAmount+"<br>"+
            "Your Zakat amount to pay:"+ZakatAmount+"</html>";
    JOptionPane jp=new JOptionPane();
    jp.setMessage(result);
    jp.setMessageType(JOptionPane.INFORMATION_MESSAGE);
    JDialog jd=jp.createDialog(null,"");
    jd.setVisible(true); 
    }
    
//   } JOptionPane.showMessageDialog(null, "Total amount BDT:"+TotalAmount);
    
//    System.out.println("Total1:"+Total1);
   }
   else if(e.getSource() == b2){
       tf1.setText("");
       tf2.setText("");
       tf3.setText("");
       tf4.setText("");
       tf5.setText("");
       tf6.setText("");
       tf7.setText("");
       tf8.setText("");
       tf9.setText("");
       tf10.setText("");
       
   }
    else if(e.getSource() == b3){
       dispose();
      
       
   }
    else if(e.getSource() == bi){
        dispose();
    new Ins().setVisible(true);
//    thissetVisible(t);
       
   }
    
    
    }
    public static void main(String[] args) {
        ZakatCalculator frame = new ZakatCalculator();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(600, 750);
        frame.setLocation(650, 0);
    }

  
    
}
