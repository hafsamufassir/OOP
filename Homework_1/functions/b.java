import java.util.Scanner;

public class b {
	static double power(double a, double n){
		double s = 1; 
		for(int i = 0; i < n; i++){
			s = s * a;
		}
		return s;
	}

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();
		double b = input.nextDouble();

		System.out.println(power(a, b));
	}
}

