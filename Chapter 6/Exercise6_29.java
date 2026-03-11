import java.util.Scanner;

public class Exercise6_29{

    static long fibonacci(int n) {

        if (n == 0) return 0;
        if (n == 1) return 1;

        long a = 0, b = 1;

        for (int i = 2; i <= n; i++) {

            long temp = a + b;
            a = b;
            b = temp;
        }

        return b;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();

        System.out.println("Fibonacci(" + n + ") = " + fibonacci(n));
    }
}