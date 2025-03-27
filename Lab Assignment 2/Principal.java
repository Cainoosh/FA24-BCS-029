public class Principal extends Person{
	private int experience;

	Principal(String name, int age, int experience){
		super(name, age);
		this.experience = experience;

	}

	
	public void setExperience(int experience){
		this.experience = experience;
	}

	public int getExperience(){
		return experience;
	}


	@Override
	public String toString(){
		return super.toString() + "Experience: " + experience + "\n\n";

	}

}