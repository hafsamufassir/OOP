import java.util.Scanner;

public class c {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int arr[] = new int[n];
		int k = 0;
		for(int i = 0; i < n; i++){
			arr[i]=input.nextInt();
			if(arr[i] > 0){
				k++;
			}
		}
		System.out.println(k);
	}
}