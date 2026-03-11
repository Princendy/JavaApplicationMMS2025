import java.util.Scanner;

public class Exercise4_31 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double housing, food, clothing, transport, education, health, vacation;

        System.out.print("Enter housing expenses: ");
        housing = input.nextDouble();

        System.out.print("Enter food expenses: ");
        food = input.nextDouble();

        System.out.print("Enter clothing expenses: ");
        clothing = input.nextDouble();

        System.out.print("Enter transportation expenses: ");
        transport = input.nextDouble();

        System.out.print("Enter education expenses: ");
        education = input.nextDouble();

        System.out.print("Enter health care expenses: ");
        health = input.nextDouble();

        System.out.print("Enter vacation expenses: ");
        vacation = input.nextDouble();

        double totalExpenses = housing + food + clothing + transport +
                               education + health + vacation;

        double fairTax = totalExpenses * 0.23;

        System.out.println("Total Expenses: " + totalExpenses);
        System.out.println("Estimated FairTax: " + fairTax);
    }
}