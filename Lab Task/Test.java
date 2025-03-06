package LibraryManagementSystem;

public class Test{
	
	public static void main(String args[]){
		

		Library library = new Library(new Book("Six of Crows", "123S", "3", new Date(3,1,2005), new Person("Cainoosh", "author", new Address("21", "Lahore"))), "Hollow", new Person("Momina", "Incharge", new Address("7", "Lahore")), 
new Person("Wassam", "Librarian", new Address("131", "Lahore")));


	}





}