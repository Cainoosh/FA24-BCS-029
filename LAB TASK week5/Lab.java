public class Lab{
	private String name;
	private Person staff;
	Computer computers[] = new Computer[50];


	Lab(String name, Person staff){
		this.name = name;
		this.staff = staff;
		for(int i=0; i<computers.length; i++)
			computers[i] = new Computer(i);


	}


	public void setName(String name){
		this.name = name;
	}

	public void setStaff(Person staff){
		this.staff = staff;
	}


	
	public String getName(){
		return name;
	}

	public Person getStaff(){
		return staff;
	}


	public void displayLab(){
		System.out.printf("Name:%-20s \n", name);
		staff.showPersonDetails();
		for(int i=0; i<computers.length; i++)
			computers[i].DisplayComputer();

	}




}