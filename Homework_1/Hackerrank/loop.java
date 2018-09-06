import java.util.Scanner;

public class Loop {

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		for(int i = 1; i < 11; i++){
			System.out.println(Integer.toString(n) + " x " + Integer.toString(i) + " = " + n*i);
		}
	
	}
}