package com.tnsif.methods;

		class Demo {
		    static int number;

		    // Static block executes when class is loaded
		    static {
		        number = 5;
		        System.out.println("Static Block: number = " + number);
		    }

		    // Static method
		    static void show() {
		        System.out.println("Static Method: number = " + number);
		    }
		}

		public class staticprogram {
		    public static void main(String[] args) {
		        System.out.println("Main Method: number = " + Demo.number);
		        Demo.show();
		    }

	}

