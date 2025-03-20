public class Cinema{
	private String name;
	private String location;
	private Screen[] screens;



	Cinema(String name, String location, int totalScreens){
		this.name = name;
		this.location = location;
		this.screens = new Screen[totalScreens];

	}

	public void addScreen(int index, Screen screen){
		screens[index] = screen;

	}

	public void displayCinema(){
		System.out.println("Cinema Name: " + name);
        	System.out.println("Location: " + location);
        	System.out.println("Number of Screens: " + screens.length);
        
        	for (int i = 0; i < screens.length; i++) {                				System.out.println("\nScreen " + (i + 1) + ":");
                	screens[i].displayScreen();
		}


	}







}