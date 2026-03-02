import java.util.Scanner;

public class Exercise3_23{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int largest = 0;
		int largest2 = 0;
		
		for (int i = 1; i <= 10; i++){
			System.out.print("Enter number: ");
			int num = input.nextInt();
			
			if (num > largest){
				largest2 = largest;
				largest = num;
			}
			else if (num > largest2 && num != largest){
				largest2 = num;
			}
		}
		
		System.out.printf("%nLargest: %d%n",largest);
		System.out.printf("Second Largest: %d%n",largest2);
	}
}