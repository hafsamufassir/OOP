import java.util.Scanner;

public class d {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int arr[] = new int[n];
		int k = 0;
		for(int i = 0; i < n; i++){
			arr[i] = input.nextInt();
		}
		for(int i = 1; i < n; i++){
			if(arr[i] > arr[i-1]){
				k++;
			}
		}
		System.out.println(k);
	}
}