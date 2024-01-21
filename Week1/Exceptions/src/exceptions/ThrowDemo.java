package exceptions;

public class ThrowDemo {
	    public static void main(String[] args) {
	        ThrowDemo a = new ThrowDemo();

	        try {
	            a.myMethod(42);
	            a.myMethod(-5);  // This will throw an ArithmeticException
	        } 
	        catch (ArithmeticException e) {
	            System.err.println("Value must be non-negative" );
	        }
	    }

	    public void myMethod(int value) {
	        if (value < 0) {
	            throw new ArithmeticException();
	        }

	        
	        System.out.println("The value is: " + value);

	        
	    }
	
}
