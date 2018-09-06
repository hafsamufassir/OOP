import java.util.Scanner;

public class d { 
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	int n = input.nextInt();
	int i = 1;
	boolean ispoweroftwo = false;

		while(i <= n){
			if(i == n){
				ispoweroftwo = true;
			}
			i *= 2;
		}
		if(ispoweroftwo){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}	
	}
}