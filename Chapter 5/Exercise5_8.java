import java.util.Scanner;

public class Exercise5_8{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		double totalReceipts = 0.0; 
		int customers = 0;
		
		System.out.println("Enter hours parked for each customer(negative to stop):");
		
		while (true){
			System.out.print("Customer " + (customers + 1) + ": ");
			double hours = input.nextDouble();
			
			if (hours < 0) break;
			
			double charge = calculateCharges(hours);
			totalReceipts += charge;
			customers++;
			
			System.out.printf("Charge for this customer: $%.2f%n",charge);
			System.out.printf("Running total receipts: $%.2f%n%n",totalReceipts);
		}
		
		System.out.printf("Yesterday's total receipts: $%.2f from %d customers%n",totalReceipts,customers);
	}
	
	public static double calculateCharges(double hours){
		if (hours <= 3.0){
			return 2.00;
		}
		
		//hours beyond 3, rounded up.
		
		double extraHours = Math.ceil(hours - 3.0);
		double charge = 2.00 + extraHours * 0.50;
		
		//never more than $10.00
		if (charge > 10.00){
			charge = 10.00;
		}
		return charge;
	}
}