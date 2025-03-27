public class Student extends Person{
	private int rollNumber;

	Student(String name, int age, int rollNumber){
		super(name, age);
		this.rollNumber = rollNumber;

	}

	
	public void setRollNumber(int rollNumber){
		this.rollNumber = rollNumber;
	}

	public int getRollNumber(){
		return rollNumber;
	}


	@Override
	public String toString(){
		return super.toString() + "Roll no: " + rollNumber + "\n\n";

	}

}