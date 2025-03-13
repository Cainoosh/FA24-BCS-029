public class Person{
	private String name;
	private String role;


	public Person(String name, String role){
		this.name = name;
		this.role = role;

	}



	public void setName(String name){
		this.name = name;
	}

	public void setRole(String role){
		this.role = role;
	}
	


	
	public String getName(){
		return name;
	}

	public String getRole(){
		return role;
	}



	public void showPersonDetails(){
		System.out.printf("Name:%-20s \n", name);
		System.out.printf("Role:%-20s \n", role);
		
	}

}