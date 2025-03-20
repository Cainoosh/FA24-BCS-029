public class Screen{
	private int screenNumber;
	private String movieTitle;
	private Seat[][] seats;
	private int rows;
	private int cols;
	private int count=0;

	Screen(int screenNumber, String movieTitle, int rows, int cols){
		this.rows = rows;
		this.cols = cols;
		this.screenNumber = screenNumber;
		this.movieTitle = movieTitle;
		this.seats = new Seat[rows][cols];

		for (int i=0; i<rows/2; i++)
			for (int j=0; j<cols; j++)
				seats[i][j] = new Seat(count+1, i+1, "Recliner", 1250);

		for (int i=rows/2; i<rows; i++)
			for (int j=0; j<cols; j++)
				seats[i][j] = new Seat(count+1, i+1, "VIP", 1000);
		
		

	}

	public boolean bookSeat(int row, int col, Customer customer) {
    		if (!seats[row][col].bookSeat()) { 
        		seats[row][col].setIsBooked(true);
        		return true;
    		}
    		return false;
}


	public void displayScreen(){
 	   System.out.println("Screen no: " + screenNumber);
  	  System.out.println("Movie Title: " + movieTitle);
		for (int i=0; i<rows; i++)
			for (int j=0; j<cols; j++)
				seats[i][j].display();

	}







}