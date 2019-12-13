
public class NoSuchCustomerException extends Exception {
	

	private int value;

	public NoSuchCustomerException (int value) {
		super("The customer " + value + " does not exist");
		this.value = value;
		
	}
	
	public int getCustomerNumber () {
		return this.value;
	}

}
