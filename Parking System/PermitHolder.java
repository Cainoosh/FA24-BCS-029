public class PermitHolder extends Person{
	private int ID;
	private static int IDcount = 1;

	PermitHolder(String name){
		super(name);
		ID = IDcount++;

	}

	
	public int getID(){
		return ID;

	}


	@Override
	public boolean equals(Object obj){
		if(this == obj)
			return true;
		if(getClass() != obj.getClass())
			return false;
		
		PermitHolder other = (PermitHolder) obj;
		return ID == other.ID;

	}




	@Override
	public String toString(){
		return super.toString() + ", " + "Permit ID: " + String.format("P%03d", ID) + ", "; 

	}






}