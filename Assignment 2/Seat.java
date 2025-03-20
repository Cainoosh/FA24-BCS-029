public class Seat{
	private int seatNumber;
	private int rowNumber;
	private String type;
	private double price;
	private boolean isBooked;


	Seat(int seatNumber, int rowNumber, String type, double price){
		this.seatNumber = seatNumber;
		this.rowNumber = rowNumber;
		this.type = type;
		this.price = price;

	}

	public void setIsBooked(boolean isBooked){
		this.isBooked = isBooked;
	}


	
	public boolean bookSeat() {
    		if (!isBooked) {
        		isBooked = true;
        		return true;
    		}
    		return false;
}


	public void display(){
 	   System.out.println("Seat no: " + seatNumber);
  	  System.out.println("Row: " + rowNumber);
   	 System.out.println("Type: " + type);
  	  System.out.println("Price: " + price);
   	 System.out.println("Booked: " + (isBooked ? "Yes" : "No"));

	}



}