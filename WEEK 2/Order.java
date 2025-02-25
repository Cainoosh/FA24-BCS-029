public class Order{

	public static void main(String args[]){
	Product p1 = new Product("Notebook", 7, 300.5, "stationary");
	Product p2 = new Product("Wrench", 4, 250, "Tools");
	Product p3 = new Product("Fries", 10, 970.75, "Food");
	Product p4 = new Product("Lotion", 2, 400.4, "Skin care");
	Product p5 = new Product("Redmi 9", 1, 25000, "Electronics");

	p1.display();
	p2.display();
	p3.display();
	p4.display();
	p5.display();
	
	}
	

}