import java.util.Scanner;
 
public class c {
 
    public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);
 
        int a = input.nextInt();
        int b = input.nextInt();
 
        for(int i = a; i <= b; i++)
        {
            if(Math.sqrt(i) == i*i){
                System.out.println(i);
            }
        }
 
    }
}
 