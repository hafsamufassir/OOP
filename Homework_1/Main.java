import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int sum = 0;

        for(int i = 0; i < n; i++)
        {
            int x = input.nextInt();
            if(x==0)
            {
                sum++;
            }
        }

        System.out.println(sum);

    }
}
