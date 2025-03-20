public class Customer{
	private int customerId;
	private String name;
	private String phoneNumber;
	private String email;


	Customer(int customerId, String name, String phoneNumber, String email){
		this.customerId = customerId;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;

	}



	public void displayCustomer(){
		System.out.printf("%-20s","ID: \n", customerId);
		System.out.printf("%-20s","Name: \n", name);
		System.out.printf("%-20s","Phone Number: \n", phoneNumber);
		System.out.printf("%-20s","Email: \n", email);


	}


}