package AwtTest;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class A_7ExitOnClose extends Frame {
public A_7ExitOnClose() {
		
		Label l1 = new Label("Python");
		Label l2 = new Label("Java");
		Label l3 = new Label("C++");
		add(l1);
		add(l2);
		add(l3);
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400,500);
		//setDefaultCloseOperation(Frame.EXIT_ON_CLOSE);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {  
                dispose();  
            } 
		});
	}
	public static void main(String[] args) {
		A_7ExitOnClose obj = new A_7ExitOnClose();
	}

}
