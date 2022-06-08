import java.awt.*;  
import java.awt.event.*;  
public class Calculator extends Frame implements ActionListener
{  
    TextField tf1,tf2,tf3;
    Label lb1,lb2,lb3;
    Button b1,b2,b3,b4;  
    Calculator()
    {  
        tf1=new TextField();  
        tf1.setBounds(120,50,150,20);  
        tf2=new TextField();  
        tf2.setBounds(120,100,150,20);  
        tf3=new TextField();  
        tf3.setBounds(120,150,150,20);  
        tf3.setEditable(false);
        lb1=new Label("Arg1:",Label.LEFT);
        lb1.setBounds(20, 50, 50, 20);
        lb2=new Label("Arg2:",Label.LEFT);
        lb2.setBounds(20, 100, 50, 20);
        lb3=new Label("Result:",Label.LEFT);
        lb3.setBounds(20, 150, 50, 20);
        b1=new Button("+");  
        b1.setBounds(50,200,50,30);  
        b2=new Button("-");  
        b2.setBounds(120,200,50,30); 
        b3=new Button("*");
        b3.setBounds(50,240,50,30);
        b4=new Button("/");
        b4.setBounds(120,240,50,30);
        b1.addActionListener(this);  
        b2.addActionListener(this); 
        b3.addActionListener(this); 
        b4.addActionListener(this); 
        add(lb1);
        add(tf1);
        add(lb2);
        add(tf2);
        add(lb3);
        add(tf3);
        add(b1);
        add(b2);
        add(b3);
        add(b4);  
        setSize(300,300);  
        setLayout(null);  
        setVisible(true);
        setTitle("Calculator");
        addWindowListener (new WindowAdapter() {    
            public void windowClosing (WindowEvent e) {    
                dispose();    
            }
        });
    }         
    public void actionPerformed(ActionEvent e)
    {  
        String s1=tf1.getText();  
        String s2=tf2.getText();  
        double a=Double.parseDouble(s1);  
        double b=Double.parseDouble(s2);  
        double c=0.0;  
        if(e.getSource()==b1)
        {  
            c=a+b;  
        }
        else if(e.getSource()==b2)
        {  
            c=a-b;  
        }
        else if(e.getSource()==b3)
        {  
            c=a*b;  
        }
        else if(e.getSource()==b4)
        {  
            c=a/b;  
        }
        String result=String.valueOf(c);  
        tf3.setText(result);  
    }  
    public static void main(String[] args) {  
        new Calculator();  
    }  
}  