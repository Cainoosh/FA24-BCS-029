public class Ticket{
	private int ticketId;
	private Customer customer;
	private int screenNumber;
	private int seatNumber;
	private String movieTitle;
	private double price;

	Ticket(int ticketId, Customer customer, int screenNumber, int seatNumber, String movieTitle, double price){
		this.ticketId = ticketId;
		this.customer = customer;
		this.screenNumber = screenNumber;
		this.seatNumber = seatNumber;
		this.movieTitle = movieTitle;
		this.price = price;

	}

	public void displayTicket(){
		System.out.printf("Ticket ID: %-10d \n", ticketId);
		System.out.printf("Screen no: %-10d \n", screenNumber);
		System.out.printf("Seat Number: %-10d \n", seatNumber);
		System.out.printf("Movie Title: %-20s \n", movieTitle);
		System.out.printf("Price: $%-10.2f \n", price);


	}







}