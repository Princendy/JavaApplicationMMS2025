import java.util.Scanner;

public class Exercise5_9{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a decimal number: ");
		double x = input.nextDouble();
		int rounded = (int) Math.floor(x + 0.5);
		
		System.out.printf("Original = %.2f%nRounded = %d%n",x,rounded);
	}
}