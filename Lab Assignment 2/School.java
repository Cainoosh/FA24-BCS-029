public class School{
	private String name;
	private String address;
	private Principal principal;
	private ClassRoom[] classRooms;


	School(String name, String address, Principal principal, int classcount){
		this.name = name;
		this.address = address;
		this.principal = principal;
		classRooms = new ClassRoom[classcount];


	}


	public void setName(String name){
		this.name = name;

	}

	public void setAddress(String address){
		this.address = address;

	}


	public String getName(){
		return name;
	}


	public String getAddress(){
		return address;

	}

	public void addClassRoom(ClassRoom classRoom, int index) {
		if (index-1 < classRooms.length) {
			classRooms[index-1] = classRoom;
		}
		else {
			System.out.println("Invalid index");
		}
	}


	public void displaySchool(){
		System.out.println("\nSchool: " + name );
		System.out.println("Address: " + address + "\n");
		System.out.println("Principal: " + principal.toString());
		for(int i=0; i<classRooms.length; i++){
 			if (classRooms[i] != null){
				System.out.println("Class Room " + (i + 1) + ":" + "\n");
                		classRooms[i].displayClass();
			}
			else {
				System.out.println("No Class");
			}
		}


	}



}