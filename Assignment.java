//Create a code that generates a 18-digits password using the random class (including symbols, alphabets)

import java.util.*;

public class Assignment{
	public static void main(String[] args){
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter length of password: ");
		int codeLen = input.nextInt();
		
		String code = "1234567890!@#$%&()_QWERTYUIOPLKJHGFDSAZXCVBNM<>?{}qwertyuioplkjhgfdsazxcvbnm";
		
		for(int i = 1; i <= codeLen; i++){
			System.out.print(code.charAt(rand.nextInt(code.length())));
		}
		
	}
}