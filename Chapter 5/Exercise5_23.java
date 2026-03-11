import java.util.Scanner;

public class Exercise5_23 {

    public static double minimum3(double a, double b, double c) {

        return Math.min(a, Math.min(b, c));
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter three numbers: ");

        double x = input.nextDouble();
        double y = input.nextDouble();
        double z = input.nextDouble();

        System.out.println("Smallest = " + minimum3(x, y, z));
    }
}