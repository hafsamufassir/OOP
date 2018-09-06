import java.util.Scanner;
 
public class e {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i = 1;
        int k = 0;
        while(i < n){
            i = i * 2;
            k++;
        }
        System.out.println(k);
 
    }
}