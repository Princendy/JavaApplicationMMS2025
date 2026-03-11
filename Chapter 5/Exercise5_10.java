import java.util.Scanner;

public class Exercise5_10 {

    public static double roundToInteger(double number) {
        return Math.floor(number + 0.5);
    }

    public static double roundToTenths(double number) {
        return Math.floor(number * 10 + 0.5) / 10;
    }

    public static double roundToHundredths(double number) {
        return Math.floor(number * 100 + 0.5) / 100;
    }

    public static double roundToThousandths(double number) {
        return Math.floor(number * 1000 + 0.5) / 1000;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        double number = input.nextDouble();

        System.out.println("Original: " + number);
        System.out.println("Integer: " + roundToInteger(number));
        System.out.println("Tenths: " + roundToTenths(number));
        System.out.println("Hundredths: " + roundToHundredths(number));
        System.out.println("Thousandths: " + roundToThousandths(number));
    }
}