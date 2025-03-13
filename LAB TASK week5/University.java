public class University{
	private final String name = "COMSATS";
	private final String address = "1.5 KM Defence Road, Off Raiwind Road, Lahore, Pakistan";
	private Person director;
	Department departments[] = new Department[10];
	

	University(Person director){
		this.director = director;
		for(int i=0; i<departments.length; i++)
			departments[i] = new Department("Department " + (i+1), new Person("Staff " + (i+1), "Incharge"));


	}



	public void setDirector(Person director){
		this.director = director;
	}


	
	public String getName(){
		return name;
	}

	public Person getDirector(){
		return director;
	}

	public String getAddress(){
		return address;
	}


	public void displayUniversity(){
		System.out.printf("Name:%-20s \n", name);
		System.out.printf("Address:%-20s \n", address);
		director.showPersonDetails();
		for(int i=0; i<departments.length; i++)
			departments[i].displayDepartment();

	}


}