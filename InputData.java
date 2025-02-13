import java.util.Scanner;
public class InputData{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		Scanner s = new Scanner(System.in);

		int i = 0;
		String st;
		
		
		System.out.println("Enter integer : ");
		i = sc.nextInt();
		System.out.printf("value entered: %d\n", i);

		System.out.println("Enter name : ");
		st = s.nextLine();
		System.out.printf("%s", st);

		//sc.nextByte();		
		//sc.nextShort();
		//sc.nextDouble();
		//sc.next(); //for a single word without space
		//sc.nextLine(); //for a complete line

	}






}