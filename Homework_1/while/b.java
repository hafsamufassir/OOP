import java.util.Scanner;

public class b {
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		int i = 1;

		while(i < n){
			i++;
				if(n%i==0){
					System.out.println(i);
					break;
				}
		}

	}
}