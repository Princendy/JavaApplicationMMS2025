//A method has 6 parts:
//Access specifier,
//Return Type,
//Method name,
//Parameter lists,
//Method signature,
//Method body.

public class UserDefinedMethod{
	public static String userName(String name){
		return name;
	}
	
	public static void checkAge(int age){
		if (age >= 18){
			System.out.println(UserDefinedMethod.userName("Prince David ") + "You are an adult");
		}
		else{
			System.out.println(UserDefinedMethod.userName("Prince David ") + "Sorry, You are not an adult");
		}
		return age;
	}
	
	public static void main(String[] args){
		UserDefinedMethod.checkAge(15);
	}
}