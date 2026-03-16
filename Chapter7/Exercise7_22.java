import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Exercise7_22 {
    private String firstName;
    private String lastName;
    private int birthMonth;
    private int birthDay;
    private int birthYear;

    public void HeartRates(String firstName, String lastName, int birthMonth, int birthDay, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.birthYear = birthYear;
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getBirthDate() {
        return String.format("%d/%d/%d", birthMonth, birthDay, birthYear);
    }

    public int getAge() {
        LocalDate birth = LocalDate.of(birthYear, birthMonth, birthDay);
        return Period.between(birth, LocalDate.now()).getYears();
    }

    public int getMaximumHeartRate() {
        return 220 - getAge();
    }

    public String getTargetHeartRateRange() {
        int max = getMaximumHeartRate();
        int minTarget = (int) (max * 0.50);
        int maxTarget = (int) (max * 0.85);
        return minTarget + " - " + maxTarget;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String first = input.nextLine();

        System.out.print("Enter last name: ");
        String last = input.nextLine();

        System.out.print("Enter birth month (1-12): ");
        int month = input.nextInt();

        System.out.print("Enter birth day (1-31): ");
        int day = input.nextInt();

        System.out.print("Enter birth year: ");
        int year = input.nextInt();

        HeartRates person = new HeartRates(first, last, month, day, year);

        System.out.println("\n--- Results ---");
        System.out.println("Name: " + person.getFirstName() + " " + person.getLastName());
        System.out.println("Date of Birth: " + person.getBirthDate());
        System.out.println("Age: " + person.getAge() + " years");
        System.out.println("Maximum Heart Rate: " + person.getMaximumHeartRate() + " bpm");
        System.out.println("Target Heart Rate Range: " + person.getTargetHeartRateRange() + " bpm");

        input.close();
    }
}