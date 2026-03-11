import java.util.Scanner;

public class Exercise5_16 {

    public static boolean isMultiple(int a, int b) {
        return b % a == 0;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();

        if (isMultiple(num1, num2))
            System.out.println(num2 + " is a multiple of " + num1);
        else
            System.out.println(num2 + " is not a multiple of " + num1);
    }
}