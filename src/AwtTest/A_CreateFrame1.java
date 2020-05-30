package AwtTest;

import java.awt.Frame;

public class A_CreateFrame1 extends Frame{
	public A_CreateFrame1() {
		setVisible(true);
		setSize(500,500);
	}
	
	public static void main(String[] args) {
		A_CreateFrame1 obj = new A_CreateFrame1();
	}
}
