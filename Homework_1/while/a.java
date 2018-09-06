import java.util.Scanner;
 
public class a {
 
    public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);
 
        int n = input.nextInt();
        int i = 0;
            while (i < Math.floor(Math.sqrt(n))) {
                i++;
                System.out.println(i*i);
                //i = i * i;
            }
	}
}
