public class Person{
	private String name;
	private String role;
	private Address address;

	Person(String name, String role, Address address){
		this.name = name;
		this.role = role;
		this.address = address;

	}

	Person(Person other){
		this.name = other.name;
		this.role = other.role;
		this.address = other.address;
	}


	public void setName(String name){
		this.name = name;
	}

	public void setRole(String role){
		this.role = role;
	}
	
	public void setAddress(Address address){
		this.address = address;
	}	


	
	public String getName(){
		return name;
	}

	public String getRole(){
		return role;
	}

	public Address getAddress(){
		return address;
	}
	


	public void showPersonDetails(){
		System.out.printf("Name:%20s \n", name);
		System.out.printf("Role:%20s \n", role);
		System.out.printf("Address:%20s \n", address);
	}

}