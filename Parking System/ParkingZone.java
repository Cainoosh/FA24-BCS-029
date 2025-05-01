public class ParkingZone{
	private int ID;
	private static int IDcount = 0;
	Vehicle vehicles[] = new Vehicle[5];
	private int index=0;


	ParkingZone(){
		ID = IDcount++;
	}


	public void addVehicle(Vehicle vehicle){
		for (int i = 0; i < index; i++) {
			if (vehicles[i].getLicensePlate().equals(vehicle.getLicensePlate())) {
				System.out.println("Duplicate vehicle not allowed: " + vehicle.getLicensePlate());
				return;
			}
		}

		if(index < 5){
			vehicles[index++] = vehicle;
		}

		else{
			System.out.println("Cannot add vehicle. full capacity");
		}

	}

	public Vehicle[] getVehicles() {
		return vehicles;
	}

	
	public void displayParking(){
		System.out.print("Zone ID: " + "A" + ID + ", ");
		System.out.print("[Vehicles: ");
		for(int i=0; i<index; i++)
			vehicles[i].DisplayVehicle();

	}


	

	








}