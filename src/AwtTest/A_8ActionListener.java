package AwtTest;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class A_8ActionListener extends Frame implements ActionListener{
	TextField n1,n2;
	Label l;
	Button b;
	
	public A_8ActionListener() {
		n1 = new TextField(8);
		n2 = new TextField(8);
		
		b = new Button("Calculate");
		l = new Label("Result Here");
		
		add(n1);
		add(n2);
		add(b);
		add(l);
		
		b.addActionListener(this);
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400,500);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {  
                dispose();  
            } 
		});

	}
	
	public void actionPerformed(ActionEvent ae) {
		int a = Integer.parseInt(n1.getText());
		int b = Integer.parseInt(n2.getText());
		int c = a + b;
		l.setText(String.valueOf(c));
		
	}
	
	public static void main(String[] args) {
		
		A_8ActionListener obj = new A_8ActionListener();
	}
}
