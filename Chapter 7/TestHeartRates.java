import java.util.Scanner;

public class TestHeartRates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask user for details
        System.out.print("Enter first name: ");
        String firstName = input.nextLine();

        System.out.print("Enter last name: ");
        String lastName = input.nextLine();

        System.out.print("Enter birth month (1-12): ");
        int month = input.nextInt();

        System.out.print("Enter birth day (1-31): ");
        int day = input.nextInt();

        System.out.print("Enter birth year: ");
        int year = input.nextInt();

        // Create HeartRates object
        HeartRates person = new HeartRates(firstName, lastName, month, day, year);

        // Display info
        System.out.println("\n--- Person Info ---");
        System.out.println("Name: " + person.getFirstName() + " " + person.getLastName());
        System.out.println("Date of Birth: " + person.getBirthMonth() + "/" + person.getBirthDay() + "/" + person.getBirthYear());
        System.out.println("Age: " + person.getAge() + " years");
        System.out.println("Maximum Heart Rate: " + person.getMaxHeartRate() + " bpm");

        double[] target = person.getTargetHeartRate();
        System.out.println("Target Heart Rate Range: " + (int)target[0] + " - " + (int)target[1] + " bpm");
    }
}