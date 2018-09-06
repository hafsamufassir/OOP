import java.util.Scanner;
 
public class i {
 
    public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);
 
        int x = input.nextInt();
        int sum = 0;
 
        for(int i = 1; i < Math.sqrt(x); i++)
        {
            if(x % i == 0){
                sum++;
            }
        }
 
        if (x % Math.sqrt(x) == 0){
            System.out.println(sum*2 + 1);
        }
        else {
            System.out.println(sum*2);
        } 
    }
}
