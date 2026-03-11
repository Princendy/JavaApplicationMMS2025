import java.util.Scanner;

public class Exercise5_26 {

    public static int reverse(int num) {

        int rev = 0;

        while (num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }

        return rev;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = input.nextInt();

        System.out.println("Reversed = " + reverse(num));
    }
}