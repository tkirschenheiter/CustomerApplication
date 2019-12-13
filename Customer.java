import java.util.Scanner;

public class Customer extends CustomerIO {
	String name;
	String address;
	String city;
	String state;
	String zipCode;
	

	public Customer () {
	 
	}
 
	public String getNameAndAddress () {
	 String format = name + "\n" + address + "\n" + city + ", " + state + " " + zipCode;
	 return format;
	}

 public static void main(String[] args)  {
	 	Scanner sc = new Scanner(System.in);
		int customerNumber;
		String answer = "y";
		
		System.out.println("Welcome to the Customer application\n");
		
		while (answer.equals("y")) {
		System.out.println("Enter a customer number: ");
		customerNumber = sc.nextInt();
		Customer Customer;
		
		try {
			
			Customer = getCustomer(customerNumber);
			System.out.println("");
			System.out.println(Customer.getNameAndAddress()+"\n");
			
		} catch (NoSuchCustomerException e) {
			
			System.out.println("The customer " + customerNumber + " does not exist\n" );
			
		}
		
		System.out.println("Display another customer? (y/n):");
		answer = sc.next();
		System.out.println();
		} 
		System.out.println("Thanks for using the Customer application");
		sc.close();
		
		
	 
 }
}
