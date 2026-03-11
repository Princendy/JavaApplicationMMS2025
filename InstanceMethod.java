public class InstanceMethod{
	public static void main(String[] args){
		InstanceMethod im = new InstanceMethod();
		
		System.out.println(im.name("Prince David") + " is saying ");
		im.greetings();
	}
	
	public void greetings(){
		int i = 1;
		while(i <= 10){
			System.out.printf("%d Good Morning class%n",i);
			i++;
		}
	}
	
	public String name(String fullName){
		return fullName;
	}
}