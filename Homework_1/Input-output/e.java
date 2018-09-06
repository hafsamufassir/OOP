import java.util.Scanner;
 
public class e {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v = scanner.nextInt();
        int t = scanner.nextInt();
        if (v > 0){
            System.out.println((v*t)%109);
        }
        else{
            System.out.println((109 + ((v * t) % 109)) % 109);
        }
    }
}
 