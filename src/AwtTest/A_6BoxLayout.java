package AwtTest;

import java.awt.*;  
import javax.swing.*;  
  
public class A_6BoxLayout extends Frame {  
 Button buttons[];  
  
 public A_6BoxLayout () {  
   buttons = new Button [5];  
    
   for (int i = 0;i<5;i++) {  
      buttons[i] = new Button ("Button " + (i + 1));  
      add (buttons[i]);  
    }  
  
   setLayout (new BoxLayout (this, BoxLayout.Y_AXIS));  
   setSize(400,400);  
   setVisible(true);  
}  
  
public static void main(String args[]){  
	A_6BoxLayout b=new A_6BoxLayout();  
}  
}  