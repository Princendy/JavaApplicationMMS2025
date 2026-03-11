public class Exercise4_32 {

    public static void main(String[] args) {

        double users = 1_000_000_000;
        double target1 = 1_500_000_000;
        double target2 = 2_000_000_000;
        double rate = 0.04;

        int months = 0;

        while (users < target1) {
            users = users * (1 + rate);
            months++;
        }

        System.out.println("Months to reach 1.5 billion: " + months);

        while (users < target2) {
            users = users * (1 + rate);
            months++;
        }

        System.out.println("Months to reach 2 billion: " + months);
    }
}