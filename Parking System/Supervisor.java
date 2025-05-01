public class Supervisor extends Person{
	private int experience;
	
	Supervisor(String name, int experience){
		super(name);
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
		return super.toString() + ", " + "Experience: " + experience + "\n";

	}






}