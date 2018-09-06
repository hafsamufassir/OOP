import java.util.Scanner;

public class c {
	static int xor(int x, int y){
		if(x == y) {
			return 0;
		}else{
			return 1;
		}
		//return true;
	}
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();

		System.out.println(xor(a, b));
	}
}