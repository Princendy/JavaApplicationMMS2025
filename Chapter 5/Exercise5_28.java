import java.util.Scanner;

public class Exercise5_28 {

    public static int qualityPoints(int average) {

        if (average >= 90) return 4;
        if (average >= 80) return 3;
        if (average >= 70) return 2;
        if (average >= 60) return 1;

        return 0;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter average: ");
        int avg = input.nextInt();

        System.out.println("Quality Points = " + qualityPoints(avg));
    }
}