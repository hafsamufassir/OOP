import java.util.Scanner;
 
public class d {
 
    public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);
 
        int N = input.nextInt();
        int K = input.nextInt();
 
        System.out.println(K%N);
    }
}