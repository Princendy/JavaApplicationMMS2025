import java.util.Random;

public class NumberGenerator{
	public static void main(String[] args){
		Random rand = new Random();
		
		//Any integer
		System.out.println(rand.nextInt());
		
		//Generating from 0 - 50
		System.out.println(rand.nextInt(51));
		//OR
		System.out.println(rand.nextInt(50)+1);
		
		//Generating any double
		System.out.println(rand.nextDouble());
		
		//Generating any boolean
		System.out.println(rand.nextBoolean());
	}
}