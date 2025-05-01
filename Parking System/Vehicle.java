public class Vehicle{
	private String licensePlate;
	private String type;
	private Owner owner;
	
	
	Vehicle(String licensePlate, String type, Owner owner){
		this.licensePlate = licensePlate;
		this.type = type;
		this.owner = owner;
	}


	public void DeepCopy(Vehicle other){
		this.licensePlate = other.licensePlate;
		this.type = other.type;
		this.owner = new Owner(other.owner.getName());
	}

	public void ShallowCopy(Vehicle other){
		this.licensePlate = other.licensePlate;
		this.type = other.type;
		this.owner = other.owner;
	}


	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	

	public String getLicensePlate() {
		return licensePlate;
	}

	public String getType() {
		return type;
	}

	public Owner getOwner() {
		return owner;
	}




	public void DisplayVehicle(){
		System.out.print("[License Plate: " + licensePlate + ", Type: " + type + ", Owner: " + "[" + owner.toString()+"], ");

	}




}