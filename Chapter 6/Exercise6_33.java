import java.util.Scanner;

public class Exercise6_33{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] topics = {
            "Climate Change",
            "Education",
            "Healthcare",
            "Poverty",
            "Security"
        };

        int[][] responses = new int[5][10];

        char choice = 'y';

        while (choice == 'y') {

            for (int i = 0; i < topics.length; i++) {

                System.out.print("Rate " + topics[i] + " (1-10): ");
                int rating = input.nextInt();

                responses[i][rating - 1]++;
            }

            System.out.print("Another voter? (y/n): ");
            choice = input.next().charAt(0);
        }

        System.out.println("\nSurvey Results");

        for (int i = 0; i < topics.length; i++) {

            int totalPoints = 0;
            int totalVotes = 0;

            System.out.printf("%-15s", topics[i]);

            for (int j = 0; j < 10; j++) {

                System.out.printf("%3d", responses[i][j]);

                totalPoints += responses[i][j] * (j + 1);
                totalVotes += responses[i][j];
            }

            double avg = (double) totalPoints / totalVotes;

            System.out.printf("  Avg: %.2f\n", avg);
        }
    }
}