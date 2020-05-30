package AwtTest;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class A_4MultipleLabels extends Frame{
	
		public A_4MultipleLabels() {
			setLayout(new FlowLayout());
			//setLayout(new GridLayout(1,1));
			//setLayout();
			Label l1 = new Label("Python");
			Label l2 = new Label("Java");
			Label l3 = new Label("C++");
			add(l1);//,BorderLayout.NORTH);
			add(l2);//,BorderLayout.SOUTH);
			add(l3);//,BorderLayout.EAST);
			setVisible(true);
			setSize(400,500);
		}
		
		public static void main(String[] args) {
			A_4MultipleLabels obj = new A_4MultipleLabels();
			
		}
}
