import java.util.Scanner;

public class Exercise3_24{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int num = 0;
		
		while (num != 1 && num != 2 && num != 3){
			System.out.print("Enter 1 or 2 or 3: ");
			num = input.nextInt();
			
			if (num != 1 && num != 2 && num != 3){
				System.out.print("Invalid input. Please, Enter 1 or 2 or 3: ");
			}
		}
		
		System.out.printf("You entered: %d%n",num);
	}
}