package AWT;
import java.awt.event.*;  
class Outer implements ActionListener{  
AEvent2 obj;  
Outer(AEvent2 obj){  
this.obj=obj;  
}  
public void actionPerformed(ActionEvent e){  
obj.tf.setText("welcome");  
}  
}  
