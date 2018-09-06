import java.util.Scanner;
public class e {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int arr[] = new int[n];
		Boolean found = false;
		for(int i = 0; i < n; i++){
			arr[i] = input.nextInt();
		}
		for(int i = 0; i < n-1; i++){
			if(arr[i] * arr[i+1] > 0){
				found = true;
			}
		}
		
		if(found){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}

