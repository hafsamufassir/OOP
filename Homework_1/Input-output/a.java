import java.util.Scanner;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a = input.nextInt();
        double b = input.nextInt();

        double c = a*a + b*b;
        c = Math.sqrt(c);

        System.out.println(c);
    }

