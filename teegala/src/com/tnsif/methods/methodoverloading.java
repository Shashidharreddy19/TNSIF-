package com.tnsif.methods;

import com.tnsif.methodoverloading.method;

public class methodoverloading {
	 public int add(int a, int b) {
	        return a + b;
	    }

	    // Method 2: Add two double numbers (different data type)
	    public double add(double a, double b) {
	        return a + b;
	    }

	    // Method 3: Add three integers (different number of parameters)
	    public int add(int a, int b, int c) {
	        return a + b + c;
	    }

	    // Method 4: Add int and double (different sequence of parameters)
	    public double add(int a, double b) {
	        return a + b;
	    }

	    // Method 5: Add double and int (different sequence of parameters)
	    public double add(double a, int b) {
	        return a + b;
	    }

	    public static void main(String[] args) {
	        methodoverloading obj = new methodoverloading();

	        System.out.println("Sum of 2 integers: " + obj.add(5, 10));              // Method 1
	        System.out.println("Sum of 2 doubles: " + obj.add(5.5, 10.5));        // Method 2
	        System.out.println("Sum of 3 integers: " + obj.add(1, 2, 3));         // Method 3
	        System.out.println("Sum of int and double: " + obj.add(5, 10.5));    // Method 4
	        System.out.println("Sum of double and int: " + obj.add(5.5, 10));    // Method 5
	    }
}


