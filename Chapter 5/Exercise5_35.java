import java.security.SecureRandom;
import java.util.Scanner;

public class Exercise5_35 {

    static SecureRandom random = new SecureRandom();
    static Scanner input = new Scanner(System.in);

    static int number1;
    static int number2;

    public static void askQuestion() {

        number1 = random.nextInt(9) + 1;
        number2 = random.nextInt(9) + 1;

        System.out.printf("How much is %d times %d?%n", number1, number2);
    }

    public static void main(String[] args) {

        int answer;

        askQuestion();

        while (true) {

            answer = input.nextInt();

            if (answer == number1 * number2) {
                System.out.println("Very good!");
                askQuestion();
            }
            else {
                System.out.println("No. Please try again.");
            }
        }
    }
}