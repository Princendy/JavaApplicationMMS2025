import java.util.Scanner;

public class Exercise3_21{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int counter = 1;
		int largest = 0;
		
		while (counter <= 10){
			System.out.print("Enter number: ");
			int num = input.nextInt();
			
			if (num > largest){
			largest = num;
			}
			counter++;
		}
		
		System.out.printf("Largest number is %d%n",largest);
	}
}