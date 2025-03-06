public class Library{
	private Person staff;
	private Book book;
	private String name;
	private Person incharge;
	
	Library(Book book, String name, Person incharge, Person staff){
		this.staff = staff;
		this.book = book;
		this.name = name;
		this.incharge = incharge;
	}
	
	Library(Library other){
		this.staff = other.staff;
		this.book = other.book;
		this.name = other.name;
		this.incharge = other.incharge;
	}	

	public void setStaff(Person staff){
		this.staff = staff;
	}

	public void setBook(Book book){
		this.book = book;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setIncharge(Person incharge){
		this.incharge = incharge;
	}

	public Person getStaff(){
		return staff;
	}

	public Person getIncharge(){
		return incharge;
	}

	public Book getbook(){
		return book;
	}

	public String getName(){
		return name;
	}

	
	public void showLibrary(){
		System.out.printf("Name: \n", name);
		System.out.printf("Book: \n", book);
		System.out.printf("Incharge: \n", incharge);
		System.out.printf("Staff: ", staff);

	}

}