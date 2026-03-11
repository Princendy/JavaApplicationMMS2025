import java.util.Scanner;

public class Exercise4_11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int count;
        int number;
        int smallest;

        System.out.print("Enter number of values: ");
        count = input.nextInt();

        System.out.print("Enter value: ");
        smallest = input.nextInt();

        for (int i = 2; i <= count; i++) {
            System.out.print("Enter value: ");
            number = input.nextInt();

            if (number < smallest)
                smallest = number;
        }

        System.out.println("Smallest value is: " + smallest);
    }
}