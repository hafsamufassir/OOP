import java.util.Scanner;
 
public class j {
 
    public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);
 
        int sum = 0;
 
        for(int i = 1; i <= 100; i++)
        {
            int x = input.nextInt();
            sum = sum + x;
        }
 
        System.out.println(sum);
 
    }
}