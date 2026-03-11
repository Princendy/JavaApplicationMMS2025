
public class Exercise6_10{
	public static void main(String[] args){
		int[] counters = new int[9];
		
		int salary = (int)(200 + 0.09 * grossSales);
		int index = Math.min(salary - 200) / 100,8);
		counters[index]++;
		
		System.out.println("Range       Count");
		for(int i = 0; i < 8; i++){
			System.out.printf("\( %d- \)%d      %5d%n",200 + i+100,299 + i+100,counters[i];
		}
		System.out.printf("$1000+     %5d%n",counters[8]);
	}
}