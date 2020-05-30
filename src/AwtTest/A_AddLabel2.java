package AwtTest;

import java.awt.Frame;
import java.awt.Label;

public class A_AddLabel2 extends Frame {
	public A_AddLabel2() {
		Label l = new Label("Python");
		add(l);
		setVisible(true);
		setSize(400,500);
	}
	
	public static void main(String[] args) {
		A_AddLabel2 obj = new A_AddLabel2();
		
	}
}
