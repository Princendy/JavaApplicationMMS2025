import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int i = 1;
		while (i <= 10) {
			++i;
		}
		System.out.printf("%d", i);
		
		for (double k = 0.1; k < 1.0; k += 0.1)
			System.out.println(k);
		
		
		System.out.print("Enter an Integer for n: ");
		int n = input.nextInt();
		
		switch (n) {
		case 1:
			System.out.println("The number is 1");
			break;
		case 2:
			System.out.println("The number is 2");
			break;
		default:
			System.out.println("The number is not 1 or 2");
			break;
		}
		
		n = 1;
		while (n <= 10)
			System.out.println(n++);
		
	}
}