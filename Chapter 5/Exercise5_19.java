import java.util.Scanner;

public class Exercise5_19 {

    public static void square(int side, char fill) {

        for (int i = 1; i <= side; i++) {

            for (int j = 1; j <= side; j++)
                System.out.print(fill);

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter side: ");
        int side = input.nextInt();

        System.out.print("Enter character: ");
        char fill = input.next().charAt(0);

        square(side, fill);
    }
}