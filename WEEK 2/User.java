import java.util.Scanner;
public class User{
	private static String username = "cainoosh";
	private static String password = "abc36";


	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String Usern;
		String Passw;

		System.out.println("Enter Username : ");
		Usern = sc.next();
		System.out.println("Enter Password : ");
		Passw = sc.next();

		if(username.equals(Usern) && password.equals(Passw)){
			System.out.println("Logged in");
		}else{
			System.out.println("Incorrect Username or Password");
		}
		
	}
}






/*
user class
static username
statis password
*/