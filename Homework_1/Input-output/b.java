import java.util.Scanner;

public class b {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x = input.nextInt();

        //int a = x-1;
        //int b = x+1;

        System.out.println("The next number for the number " + x + " is " + (x+1) + ".");
        System.out.println("The previous number for the number " + x + " is " + (x-1) + ".");

    }
}
