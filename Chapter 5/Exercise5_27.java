import java.util.Scanner;

public class Exercise5_27 {

    public static int gcd(int a, int b) {

        while (b != 0) {

            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int x = input.nextInt();
        int y = input.nextInt();

        System.out.println("GCD = " + gcd(x, y));
    }
}