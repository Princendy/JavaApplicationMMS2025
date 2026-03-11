public class EnhancedForLoop{
	public static void main(String[] args){
		String[] names = {"Joy","Peace","Jack","Lucy","John"};
		int[] scores = {80,70,99,69,79};
		
		for(String name : names){
			System.out.printf("%s ",name);
		}
		System.out.println("\n=======================");
		for(int score : scores){
			System.out.printf("%d ",score);
		}
	}
}