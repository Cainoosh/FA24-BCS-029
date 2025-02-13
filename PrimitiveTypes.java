public class PrimitiveTypes{
	public static void main(String args[]){


		int num = 5000000;	
		int i = 10;
		short s = 5;
		byte b = 100;
		long l = 300;
		float f = 10.0f;
		double d = 400.0;
		char ch = 'c';
		boolean bool = true; //false

		System.out.printf("%-50s\t%s", "Primitive Types", "Total: 8 Types\n");

		System.out.println("Value in int: \n" +i);
		System.out.printf("Value in int:%03d \n", i);
		System.out.printf("Value in short:%d \n", s);
		System.out.printf("Value in byte:%d \n", b);
		System.out.printf("Value in long:%d \n", l);
		System.out.printf("Value in float:%.2f \n", f);
		System.out.printf("Value in boolean:%b \n", bool);
		System.out.printf("Value in int:%c \n", ch);
		System.out.printf("Value in int:%,03d \n", num);
	
	}



}