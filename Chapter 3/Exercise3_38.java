import java.util.Scanner;

public class Exercise3_38{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//ENCRYPTION
		System.out.print("Enter 4 digits number to encrypt: ");
		int num = input.nextInt();
		
		int d1 = num/1000;
		int d2 = (num/100) % 10;
		int d3 = (num/10) % 10;
		int d4 = num % 10;
		
		d1 = (d1 + 7) % 10;
		d2 = (d2 + 7) % 10;
		d3 = (d3 + 7) % 10;
		d4 = (d4 + 7) % 10;
		
		int encrypted = d3 * 1000 + d4 * 100 + d1 * 10 + d2;
		System.out.printf("Encrypted: %04d%n",encrypted);
		
		
		//DECRYPTION (same program - reverse process)
		System.out.print("Enter 4 digits number to encrypt: ");
		num = input.nextInt();
		
		d1 = num/1000;
		d2 = (num/100) % 10;
		d3 = (num/10) % 10;
		d4 = num % 10;
		
		d1 = (d1 + 3) % 10;
		d2 = (d2 + 3) % 10;
		d3 = (d3 + 3) % 10;
		d4 = (d4 + 3) % 10;
		
		int decrypted = d3 * 1000 + d4 * 100 + d1 * 10 + d2;
		System.out.printf("Decrypted: %04d%n",decrypted);
	}
}
		