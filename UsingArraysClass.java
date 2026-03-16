import java.util.Arrays;

public class UsingArraysClass{
	public static void main(String[] args){
		
		int[] myArrays = new int[5];
		Arrays.fill(myArrays,10);
		
		System.out.println("------Filling an array------");
		for(int myNum : myArrays){
			System.out.printf("%d%n",myNum);
		}
		
		
		int[] num = {6,2,5,9,1,3,7,4,8,10};
		
		System.out.println("------Sorting an array------");
		//Sorting arrays in ascending order
		Arrays.sort(num);
		for(int n : num){
			System.out.printf("%d%n",n);
		}
		
		//Copying an array
		System.out.println("------Copying an array------");
		int[] copy = Arrays.copyOf(num,10);
		for(int nCopy : copy){
			System.out.printf("%d%n",nCopy);
		}
		
		//Searching for the index number of an element
		int index = Arrays.binarySearch(num,7);
		System.out.println("The index number of 7 is " + index);
		
	}
}