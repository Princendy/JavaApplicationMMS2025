import java.util.Scanner;

public class Exercise3_18{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter account number (enter -1 to quit): ");
		int account = input.nextInt();
		
		while (account != - 1){
			System.out.print("Enter beginning balance: ");
			int balance = input.nextInt();
			
			System.out.print("Enter total charges this month: ");
			int charges = input.nextInt();
			
			System.out.print("Enter total credits this month: ");
			int credits = input.nextInt();
			
			System.out.print("Enter credit limit: ");
			int limit = input.nextInt();
			
			int newBalance = balance + charges - credits;
			
			System.out.printf("New balance: %d%n",newBalance);
			
			if (newBalance > limit){
				System.out.println("Credit limit exceeded");
			}
			
			System.out.print("\nEnter account number (enter -1 to quit): ");
			account = input.nextInt();
		}
	}
}