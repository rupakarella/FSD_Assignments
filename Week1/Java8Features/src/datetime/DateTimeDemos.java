package datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeDemos {
	public static void main(String[] args) {
		LocalDate date1=LocalDate.now();
		System.out.println(date1);
		LocalDate independence=LocalDate.of(1947, 8, 15);
		System.out.println(independence);
		String str="2001-12-11";
		LocalDate dob= LocalDate.parse(str);
		System.out.println(dob);
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String str2= "11-12-2001";
		LocalDate date=LocalDate.parse(str2,formatter);
		System.out.println(date);
		DateTimeFormatter formatter1=DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		//LocalDate date2=LocalDate.parse(str,formatter1);
		String date2=date1.format(formatter1);
		System.out.println(date2);
		LocalDateTime datetime=LocalDateTime.now();
		System.out.println(datetime);
		DateTimeFormatter Myformatter=DateTimeFormatter.ofPattern("dd/MM/YYYY");
		String mydate= date1.format(Myformatter);
		System.out.println(mydate);
	}
	
}
