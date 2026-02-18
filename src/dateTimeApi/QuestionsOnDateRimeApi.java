package dateTimeApi;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class QuestionsOnDateRimeApi {
	public static void main(String[] args) {
		
		LocalDate joiningDate=LocalDate.of(2024,1,1);
		DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
		String formaString=joiningDate.format(dateTimeFormatter);
		
		System.out.println(formaString);
		
		Period period=Period.between(joiningDate,LocalDate.now());
		System.out.println(period.getYears()+" years"+period.getMonths()+" months "+period.getDays()+" days");
	}


}
