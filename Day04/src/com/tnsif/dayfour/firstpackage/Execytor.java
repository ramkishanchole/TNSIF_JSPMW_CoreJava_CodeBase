package com.tnsif.dayfour.firstpackage;

public class Execytor {

	public static void main(String[] args) {
		// accessing different public, protected(inhert/child/subclass), default(no)

		Base b1=new Base();
		
		b1.methodPublic();
		
		b1.varPublic=544654;
		b1.methodPublic();
		
		//b1.methodProtected();
		
	}
}
