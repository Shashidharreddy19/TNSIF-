package com.tnsif.hybrid;
//Base class A
class A {
    void methodA() {
        System.out.println("Class A method");
    }
}

//Class B extends A
	class B extends A {
	    void methodB() {
	        System.out.println("Class B method");
	    }
	}

	
	// Class C extends A
		class C extends A {
		    void methodC() {
		        System.out.println("Class C method");
		    }
		}
		
		// Class D extends B
		class D extends B {
		    void methodD() {
		        System.out.println("Class D method");
		    }
		}
 
		public class hybridA  extends D{
	        void show() {
	        	System.out.print("show");
	        }

       }

