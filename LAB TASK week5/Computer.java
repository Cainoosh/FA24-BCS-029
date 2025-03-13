public class Computer{
	private final int id;
	private final String version = "i7";
	private final int ram = 16;
	private final int disc = 500;


	Computer(int id){
		this.id = id;
	}



	public int getID(){
		return id;
	}

	public String getVersion(){
		return version;
	}

	public int getRAM(){
		return ram;
	}

	public int getDisc(){
		return disc;
	}


	public void DisplayComputer(){
		System.out.printf("%-20s%d", "ID: ", id);
		System.out.printf("%-20s%s", "\nVersion: ", version);
		System.out.printf("%-20s%d%s", "\nRAM: ", ram, "GB");
		System.out.printf("%-20s%d%s", "\nDisc: ", disc, "GB");

	}




}