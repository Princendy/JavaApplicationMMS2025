public class Exercise1 {
	public static void main(String[] args){
		
		double x;
		x = Math.abs(7.5);
		System.out.printf("The value is x is %.2f%n", x);
		
		x = Math.floor(7.5);
		System.out.printf("The value is x is %.2f%n", x);
		
		x = Math.abs(0.0);
		System.out.printf("The value is x is %.2f%n", x);
		
		x = Math.ceil(0.0);
		System.out.printf("The value is x is %.2f%n", x);
		
		x = Math.abs(-6.4);
		System.out.printf("The value is x is %.2f%n", x);
		
		x = Math.ceil(-6.4);
		System.out.printf("The value is x is %.2f%n", x);
		
		x = Math.ceil(-Math.abs(-8 + Math.floor(-5.5)));
		System.out.printf("The value is x is %.2f", x);
	}
}