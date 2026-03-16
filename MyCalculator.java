import java.util.Scanner;

public class MyCalculator{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("\nEnter your name: ");
		String name = input.nextLine();
		
		System.out.printf("Good Day %s!%n%n",name);
		
		while(true){
			calculate(input);
			
			System.out.println("\nDo you want to do another calculation? (Enter 'yes' to proceed): ");
			String calculation = input.nextLine().trim().toLowerCase();
		
			if(calculation.equals("yes")){
				calculate(input);
			}
			else{
				break;
			}
		}
		System.out.println("\nThank you for using PRINCENDY's calculator!!");
	}
	
	public static void calculate(Scanner input){
		int choice;
		
		do{
			System.out.println("Select operation:");
			System.out.println("1 -- add");
			System.out.println("2 -- subtract");
			System.out.println("3 -- multiply");
			System.out.println("4 -- divide");

			System.out.print("Enter any choice (1/2/3/4): ");
			choice = input.nextInt();
			input.nextLine();
			
			if(choice < 1 || choice > 4){
				System.out.println("Invalid input. Please enter 1,2,3 or 4.\n");
			}
		}
		while(choice < 1 || choice > 4);
		
		switch(choice){
			case 1:
				System.out.print("\nEnter number: ");
				double add1 = input.nextDouble();
				input.nextLine();
				
				System.out.print("Enter another number to add: ");
				double add2 = input.nextDouble();
				input.nextLine();
				
				System.out.println("\nResult\n" + add1 + " + " + add2 + " = " + (add1+add2));
				break;
				
			case 2:
				System.out.print("\nEnter number: ");
				double sub1 = input.nextDouble();
				input.nextLine();
				
				System.out.print("Enter another number to subtract: ");
				double sub2 = input.nextDouble();
				input.nextLine();
				
				System.out.println("\nResult\n" + sub1 + " - " + sub2 + " = " + (sub1-sub2));
				break;
				
			case 3:
				System.out.print("\nEnter number: ");
				double multiply1 = input.nextDouble();
				input.nextLine();
				
				System.out.print("Enter another number to multiply by: ");
				double multiply2 = input.nextDouble();
				input.nextLine();
				
				System.out.println("\nResult\n" + multiply1 + " x " + multiply2 + " = " + (multiply1*multiply2));
				break;
				
			case 4:
				System.out.print("\nEnter number: ");
				double divide1 = input.nextDouble();
				input.nextLine();
				
				System.out.print("Enter another number to divide by: ");
				double divide2 = input.nextDouble();
				input.nextLine();
				
				if(divide2 != 0){
					System.out.println("\nResult\n" + divide1 + " / " + divide2 + " = " + (divide1/divide2));
				}
				else{
					System.out.printf("%.2f is not divisible by %.2f%n",divide1,divide2);
				}
				break;
				
			default:
				System.out.println("Please choose a number from the provided options.");
		}
	}
}