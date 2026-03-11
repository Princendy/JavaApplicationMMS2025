import java.util.Scanner;

public class One_Dimensional_Array{
	public static void main(String[] args){
		int[] marks = {90,77,89,100,60,79,80,45,91,101};
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Element at index number 7 is %d%n",marks[7]);
		System.out.printf("Element at index number 3 is %d%n",marks[3]);
		
		System.out.println("The elements of the array are: ");
		for(int x = 0; x < 10; x++){
			System.out.printf("%d%n",marks[x]);
		}
		
		//Using the new keyword
		int[] mark = new int[10];
		int counter = 1;
		
		for(int i = 0; i < 10; i++){
			System.out.printf("Enter element %d: ",counter);
			mark[i] = input.nextInt();
			counter++;
		}
		
		System.out.println("\nYour Elements are: ");
		System.out.print("[");
		for(int y = 0; y < 10; y++){
			System.out.printf("%d, ",mark[y]);
		}
		System.out.print("]");
	}
}