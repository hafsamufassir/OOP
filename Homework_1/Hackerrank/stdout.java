import java.util.Scanner;

public class stdout{
	
	public static void main(String[] args){
	Scanner input = new Scanner (System.in);

	int a = input.nextInt();
	double d = input.nextDouble();
	String s = input.nextLine();
	String sc = input.nextLine();

	System.out.println("String:" + sc);
	System.out.println("Double:" + d);
	System.out.println("Int:" + a);

	}
}