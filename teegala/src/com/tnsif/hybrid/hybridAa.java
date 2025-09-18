package com.tnsif.hybrid;



public class hybridAa {

	public static void main(String[] args) {
		
			D obj1 = new D();
	        obj1.methodA();  // From class A
	        obj1.methodB();  // From class B
	        obj1.methodD();  // From class D

	        C obj2 = new C();
	        obj2.methodA();  // From class A
	        obj2.methodC();  // From class C

}
}
