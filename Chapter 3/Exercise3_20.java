import java.util.Scanner;

public class Exercise3_20{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		for (int i = 1; i <= 3; i++){
			System.out.printf("%nEmployee %d%n",i);
			System.out.print("Enter hours worked: ");
			int hours = input.nextInt();
			
			System.out.print("Enter hourly rate: $");
			double rate = input.nextDouble();
			
			double pay = 0;
			if (hours <= 40 ){
				pay = hours * rate;
			}
			else{
				pay = 40 * rate + (hours - 40) * rate * 1.5;
			}
			System.out.printf("Gross pay: $%.2f%n",pay);
		}
	}
}