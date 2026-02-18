package dateTimeApi;
import java.time.*;
import java.time.format.DateTimeFormatter;


public class IntroductionToDateTimeApi {

	public static void main(String[] args) {

		//to get the current date
		LocalDate localDate=LocalDate.now();
		System.out.println(localDate);
		
		
		//to create the date
		LocalDate date=LocalDate.of(2004,04,23);
		System.out.println(date);
		System.out.println(date.plusDays(19));
		
		System.out.println(date.getYear());
		System.out.println(date.getMonth());
		System.out.println(date.getDayOfMonth());
		System.out.println(date.getMonthValue());
		System.out.println(date.getEra());
		
		LocalTime localTime=LocalTime.now();
		System.out.println(localTime);
		
		
		LocalTime time=LocalTime.of(10,30);
		System.out.println(time);
		System.out.println(time.plusHours(3));
		System.out.println();
		
		
		LocalDateTime localDateTime=LocalDateTime.of(2004,4,23,10,30);
		System.out.println(localDateTime);
		
		
		LocalDate todayDate=LocalDate.now();
		DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String formattedDateString=todayDate.format(dateTimeFormatter);
		System.out.println(formattedDateString);
		
		
		
		LocalDate birthDate=LocalDate.of(2004,04,23);
		LocalDate todayDate2=LocalDate.now();
		
		Period period=Period.between(birthDate,todayDate2);
		System.out.println(period.getYears());
		System.out.println(period.getMonths());
		System.out.println(period.getDays());
	}

}
