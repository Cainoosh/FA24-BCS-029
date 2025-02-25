public class Product{
	private static int Count = 1;
	private String id;
	private String name;
	private int quantity;
	private double price;
	private String category;



	Product(String n, int q, double p, String c){
		name = n;
		quantity = q;
		price = p;
		category = c;
		id = ""+String.format("%04d", Count++);
	}
	

	public void setname(String n){
		name = n;
	}

	public void setquantity(int q){
		quantity = q;
	}

	public void setprice(double p){
		price = p;
	}

	public void setcategory(String c){
		category = c;
	}


	public String getname(){
		return name;
	}

	public int getquantity(){
		return quantity;
	}

	public double getprice(){
		return price;
	}

	public String getcategory(){
		return category;
	}

	void display(){
	System.out.printf("%-10s:\t%s\n", "Product", name);
	System.out.printf("%-10s:\t%s\n", "ID", id);
	System.out.printf("%-10s:\t%03d\n", "Quantity", quantity);
	System.out.printf("%-10s:\t%.2f\n", "Price", price);
	System.out.printf("%-10s:\t%s\n\n", "Category", category);
	}

}