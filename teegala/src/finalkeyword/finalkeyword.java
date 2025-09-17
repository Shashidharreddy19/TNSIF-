package finalkeyword;

public class finalkeyword {

	public static void main(String[] args) {
		// Final class (cannot be extended)
		final class FinalClass {
		    final int MAX_VALUE = 100;  // Final variable

		    // Final method (cannot be overridden)
		    final void displayMaxValue() {
		        System.out.println("Final MAX_VALUE is: " + MAX_VALUE);
		    }
		}

		// Attempting to extend FinalClass would cause an error
		// class SubClass extends FinalClass {}  // ❌ Not allowed

		        FinalClass obj = new FinalClass();
		        obj.displayMaxValue();

		        // Trying to modify final variable (will cause compile-time error)
		        // obj.MAX_VALUE = 200;  // ❌ Not allowed
		    }
	


	}

