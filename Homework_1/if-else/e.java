import java.util.Scanner;
 
public class e {
 
    public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);
 
        int a = input.nextInt();
        int b = input.nextInt();
 
        if (a > b)
            System.out.println("1");
        if(a < b)
            System.out.println("2");
        if (a == b)
            System.out.println("0");
 
    }
}