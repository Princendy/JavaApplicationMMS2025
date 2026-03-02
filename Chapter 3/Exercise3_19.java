import java.util.Scanner;

public class Exercise3_19{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		double totalSales = 0.0;
		
		System.out.print("Enter item price (enter 0 to quit): $");
		double price = input.nextDouble();
		
		while (price != 0){
			totalSales += price;
			System.out.print("Enter item price (enter 0 to quit): $");
			price = input.nextDouble();
		}
		
		double earnings = 200 + 0.09 * totalSales;
		System.out.printf("Total sales: $%.2f%n",totalSales);
		System.out.printf("Earnings this week: $%.2f%n",earnings);
	}
}
		