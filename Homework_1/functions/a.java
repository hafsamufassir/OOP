import java.util.Scanner;

public class a {
	static int min(int a, int b) {
		int min;
		if(a < b) {
			min = a;
		}else{
			min = b;
		}
		return min;
	}
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	int num1 = input.nextInt();
	int num2 = input.nextInt();
	int num3 = input.nextInt();
	int num4 = input.nextInt();

	System.out.println(min(num1, min(num2, min(num3, num4))));

	}
}