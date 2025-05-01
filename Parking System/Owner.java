public class Owner extends Person{
	private int ID;
	private static int IDcount = 1;

	Owner(String name){
		super(name);
		ID = IDcount++;

	}

	
	public int getID(){
		return ID;

	}

	@Override
	public String toString(){
		return super.toString() + ", " + "Owner ID: " + String.format("O%03d", ID); 

	}






}