import java.util.Scanner;

public class ClassWork{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int pos = 0;
		int neg = 0;
		int zero = 0;
		
		while(true){
			System.out.print("Enter any number(enter -1 to end): ");
			int num = input.nextInt();
			
			if(num == -1){
				break;
			}
			
			if(num < 0){
				neg++;
			}
			else if(num > 0){
				pos++;
			}
			else{
				zero++;
			}
		}
		
		System.out.printf("%nPositive numbers: %d%n",pos);
	    System.out.printf("Negative numbers: %d%n",neg);
		System.out.printf("Zeroes: %d%n",zero);
	}
}