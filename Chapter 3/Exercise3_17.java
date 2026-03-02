import java.util.Scanner;

public class Exercise3_17{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int totalMiles = 0;
		int totalGallons = 0;
		int tripCount = 0;
		
		System.out.print("Enter miles driven (enter -1 to quit): ");
		int miles = input.nextInt();
		
		while (miles != -1){
			System.out.print("Enter gallons used: ");
			int gallons = input.nextInt();
			
			if (gallons != 0){
				double mpg = (double) miles/gallons;
				System.out.printf("MPG for this trip: %.2f%n",mpg);
				
				totalMiles += miles;
				totalGallons += gallons;
				tripCount++;
				
				if (totalGallons != 0){
					double combinedMPG = (double) totalMiles/totalGallons;
					System.out.printf("Combined MPG: %.2f%n%n",combinedMPG);
				}
			}
			
			System.out.print("Enter miles driven (enter -1 to quit): ");
			miles = input.nextInt();
		}
		
		if (tripCount == 0){
			System.out.println("No trips were entered.");
		}
	}
}