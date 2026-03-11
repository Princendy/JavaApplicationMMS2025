import java.util.Scanner;

public class Exercise5_30 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = 1 + (int)(Math.random() * 1000);

        int guess;

        do {

            System.out.print("Guess number (1-1000): ");
            guess = input.nextInt();

            if (guess > number)
                System.out.println("Too high");

            else if (guess < number)
                System.out.println("Too low");

        } while (guess != number);

        System.out.println("Congratulations!");
    }
}