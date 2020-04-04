package AWT;
import java.awt.*; 
import java.awt.event.*;   
public class ButtonExample
{ 
    public static void main(String[] args)
    {  
        Frame f=new Frame("Button Example");
        Button b=new Button("Click Here");  
        TextField tf=new TextField();
        b.setBounds(110,100,80,30);  
        tf.setBounds(60,50,200,30);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){  
                tf.setText("Welcome");  
            }  
        });  
        f.add(b);  
        f.add(tf);
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);   
    }  
}  