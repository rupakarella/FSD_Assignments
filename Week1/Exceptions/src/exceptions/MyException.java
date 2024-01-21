package exceptions;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class MyException {

	public static void main(String[] args) {
		try {
			int result=square(5);
			System.out.println("Square: "+result);
			
			result=square(-3);
			System.out.println("Square: "+result);
		}catch(NegativeNumberException e) {
			System.err.println("Error: "+e.getMessage());
		}

	}
	
	public static int square(int number) throws NegativeNumberException{
		if(number<0) {
			throw new NegativeNumberException("Negative numbers are not allowed");
		}
		return number*number;
	}

}