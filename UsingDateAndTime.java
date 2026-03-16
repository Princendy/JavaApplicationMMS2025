import java.time.LocalDate;
import java.time.LocalTime;

public class UsingDateAndTime{
	public static void main(String[] args){
		LocalDate currentDate = LocalDate.now();
		LocalDate myDate = LocalDate.of(2014,3,12);
		LocalDate resumeDate = LocalDate.parse("2026-06-30");
		
		if(currentDate.equals(myDate.plusYears(12))){
			System.out.println("Today is your appointment day");
		}
		else{
			System.out.println("Today is not your appointment day");
		}
		
		System.out.printf("%nToday's date is %s%n",currentDate);
		System.out.printf("The wedding date is %s%n",myDate);
		System.out.printf("The resumption date is %s%n",resumeDate);
		System.out.printf("The year is %s%n",currentDate.getYear());
		System.out.printf("The month is %s%n",currentDate.getMonth());
		System.out.printf("The day is %s%n",currentDate.getDayOfMonth());
		System.out.printf("My exam is on the %s%n",currentDate.plusDays(7));
		System.out.printf("My exam is on the %s%n",currentDate.plusYears(2));
		
		LocalTime currentTime = LocalTime.now();
		LocalTime myTime = LocalTime.of(20,3,12);
		LocalTime resumeTime = LocalTime.parse("06:06:30");
		
		System.out.printf("%nThe time is %s%n",currentTime);
		System.out.printf("The wedding time is %s%n",myTime);
		System.out.printf("The resumption time is %s%n",resumeTime);
		System.out.printf("The Hour is %s%n",currentTime.getHour());
		System.out.printf("The minute is %s%n",currentTime.getMinute());
		System.out.printf("The seconds is %s%n",currentTime.getSecond());
		System.out.printf("My exam is by %s%n",currentTime.plusHours(3));
		System.out.printf("My exam is by %s%n",currentTime.plusMinutes(2));
		
		
		
	}
}