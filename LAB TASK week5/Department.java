public class Department{
	private String name;
	private Person incharge;
	Lab labs[] = new Lab[5];


	Department(String name, Person incharge){
		this.name = name;
		this.incharge = incharge;
		for(int i=0; i<labs.length; i++)
			labs[i] = new Lab("Lab " + (i+1), new Person("Staff " + (i+1), "Manager"));


	}


	public void setName(String name){
		this.name = name;
	}

	public void setIncharge(Person incharge){
		this.incharge = incharge;
	}


	
	public String getName(){
		return name;
	}

	public Person getIncharge(){
		return incharge;
	}


	public void displayDepartment(){
		System.out.printf("Name:%-20s \n", name);
		incharge.showPersonDetails();
		for(int i=0; i<labs.length; i++)
			labs[i].displayLab();

	}




}