import java.time.LocalDate;
import java.time.Period;

public class HeartRates {
    private String firstName;
    private String lastName;
    private int birthMonth;
    private int birthDay;
    private int birthYear;

    // Constructor
    public HeartRates(String firstName, String lastName, int birthMonth, int birthDay, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.birthYear = birthYear;
    }

    // Setters
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setBirthMonth(int birthMonth) { this.birthMonth = birthMonth; }
    public void setBirthDay(int birthDay) { this.birthDay = birthDay; }
    public void setBirthYear(int birthYear) { this.birthYear = birthYear; }

    // Getters
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getBirthMonth() { return birthMonth; }
    public int getBirthDay() { return birthDay; }
    public int getBirthYear() { return birthYear; }

    // Calculate age
    public int getAge() {
        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
        return Period.between(birthDate, today).getYears();
    }

    // Maximum heart rate
    public int getMaxHeartRate() {
        return 220 - getAge();
    }

    // Target heart rate range as an array [min, max]
    public double[] getTargetHeartRate() {
        int maxHR = getMaxHeartRate();
        double minTarget = maxHR * 0.50;
        double maxTarget = maxHR * 0.85;
        return new double[]{minTarget, maxTarget};
    }
}