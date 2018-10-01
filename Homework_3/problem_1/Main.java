import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Animal a = new Animal();
    Cat c = new Cat();
    a.meowing();
    c.meowing();
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    c.meowing(n);

    }
}
