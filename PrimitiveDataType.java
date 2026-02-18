public class PrimitiveDataType{
	public static void main(String[] args){
		//Whole number primitive data types
		byte age = 30;
		System.out.printf("I am %d years old.%n",age);
		
		short quantityOfBags = 10000;
		System.out.printf("The quantity of bags ordered is %d%n",quantityOfBags);
		
		int nigeriaPopulation = 2000000000;
		System.out.printf("The Population of Nigeria is %d%n",nigeriaPopulation);
		
		long worldsPopulation = 9000000000000L;
		System.out.printf("The worlds population is %d%n",worldsPopulation);
		
		//Decimals or float-point primitive data types
		float myBalance = 6945.6000057F;
		System.out.printf("My account balance is %.2f%n",myBalance);
		
		double cbnBalance = 9387883838.904;
		System.out.printf("CBN Account Balance is %f%n",cbnBalance);
		
		//Single character primitive data type
		char symbol = '$';
		System.out.printf("My account balance is %c%.2f%n",symbol,myBalance);
		
		//Boolean primitive data type
		boolean isJavaFun = true;
		System.out.printf("Do you love learning java? %b%n",isJavaFun);
		
		
	}	
}