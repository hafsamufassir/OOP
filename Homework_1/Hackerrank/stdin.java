import java.util.Scanner;

public class stdin {
	
	public static void main(String[] args){
	Scanner input = new Scanner (System.in);

	int a = input.nextInt();
	int b = input.nextInt();
	int c = input.nextInt();

	System.out.println(Integer.toString(a) + '\n' + Integer.toString(b) + '\n' + Integer.toString(c));

	}
}