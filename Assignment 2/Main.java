public class Main {
    public static void main(String[] args){

	Cinema myCinema = new Cinema("Cineplex", "Lake City", 1);

        Screen screen1 = new Screen(2, "Avengers: Endgame", 4, 6);

        myCinema.addScreen(0, screen1);


        myCinema.displayCinema();
    }
}
