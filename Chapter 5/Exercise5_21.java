import java.util.Scanner;

public class Exercise5_21 {

    public static int quotient(int a, int b) {
        return a / b;
    }

    public static int remainder(int a, int b) {
        return a % b;
    }

    public static void displayDigits(int number) {

        int divisor = 10000;

        while (divisor > 0) {

            int digit = quotient(number, divisor);

            if (digit != 0 || divisor <= number)
                System.out.print(digit + "  ");

            number = remainder(number, divisor);
            divisor /= 10;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = input.nextInt();

        displayDigits(num);
    }
}