public class Person{
	private String name;
	
	Person(String name){
		this.name = name;

	}

	public void setName(String name){
		this.name = name;


	}

	public String getName(){
		return name;


	}


	public String toString(){
		return "Name: " + name;

	}



}