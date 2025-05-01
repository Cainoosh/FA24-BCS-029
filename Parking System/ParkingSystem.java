public class ParkingSystem{
	private static ParkingSystem instance;
	private String name;
	private Supervisor supervisor;
	private ParkingZone[] parkingzone;
	private PermitHolder[] permitholder;
	private int indexZ=0;
	private int indexP = 0;
	private int zonecount;
	private int permitcount;
	
	

	private ParkingSystem(String name, Supervisor supervisor, int zonecount, int permitcount){
		this.name = name;
		this.supervisor = supervisor;
		parkingzone = new ParkingZone[zonecount];
		permitholder = new PermitHolder[permitcount];

	}


	public static ParkingSystem getInstance(String name, Supervisor supervisor, int zonecount, int permitcount){
		if(instance == null)
			instance = new ParkingSystem(name, supervisor, zonecount, permitcount);
		else
			System.out.println("Warning: Parking System instance already exists. Returning existing instance");
		return instance;


	}

	public static ParkingSystem getInstance() {
		return instance;
	}





	public void addZone(ParkingZone zone){
		parkingzone[indexZ++] = zone;

	}

	public void addPermitHolder(PermitHolder holder){
		permitholder[indexP++] = holder;

	}

	public boolean searchingPermitHolder(PermitHolder holder) {
		for (int i = 0; i < indexP; i++) {
			if (permitholder[i] != null && permitholder[i].equals(holder)) {
			return true;
			}
		}
	return false;
	}


	public void displaySystem(){
		System.out.println("Campus: " + name);
		System.out.println("Supervisor: " + supervisor.toString());
		System.out.print("Zones: [");
		for(int i=0; i<parkingzone.length; i++)
			parkingzone[i].displayParking();
		System.out.print("]");

		System.out.print("\nPermit Holders: [");

		for(int i=0; i<permitholder.length; i++){
			System.out.print(permitholder[i].toString());
			System.out.print("]");
		}


	}






}