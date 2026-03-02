import java.util.Scanner;

public class Exercise3_25{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int row = 1;
		
		while (row <= 8){
			int column = 1;
			
			if (row % 2 == 0){
				System.out.print(" ");
			}
			
			while (column <= 8){
				System.out.print("* ");
				column++;
			}
			
			System.out.println();
			row++;
		}
	}
}