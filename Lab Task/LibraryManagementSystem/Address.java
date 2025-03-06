public class Address{
	private String street;
	private String city;


	Address(String street, String city){
		this.street = street;
		this.city = city;
	}


	Address(Address other){
		this.street = other.street;
		this.city = other.city;
	}


	public void setStreet(String street){
		this.street = street;
	}

	public void setCity(String city){
		this.city = city;
	}

	public String getStreet(){
		return street;
	}

	public String getCity(){
		return city;
	}

	public void showAddress(){
		System.out.printf("City:%10s \n", city);
		System.out.printf("Street:%10s \n", street);
	}

}