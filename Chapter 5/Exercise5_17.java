import java.util.Scanner;

public class Exercise5_17 {

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter integer: ");
        int num = input.nextInt();

        if (isEven(num))
            System.out.println("Even number");
        else
            System.out.println("Odd number");
    }
}