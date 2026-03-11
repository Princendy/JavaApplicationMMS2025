import java.util.Scanner;

public class Exercise5_22 {

    public static double celsius(double f) {
        return 5.0 / 9.0 * (f - 32);
    }

    public static double fahrenheit(double c) {
        return 9.0 / 5.0 * c + 32;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("1 - Fahrenheit to Celsius");
        System.out.println("2 - Celsius to Fahrenheit");

        int choice = input.nextInt();

        if (choice == 1) {

            System.out.print("Enter Fahrenheit: ");
            double f = input.nextDouble();
            System.out.println("Celsius = " + celsius(f));

        } else {

            System.out.print("Enter Celsius: ");
            double c = input.nextDouble();
            System.out.println("Fahrenheit = " + fahrenheit(c));
        }
    }
}