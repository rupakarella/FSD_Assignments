package datetime;

import java.time.LocalDate;

public class DateAPIs {
	public static void main(String[] args) {
		LocalDate date1= LocalDate.now();
		System.out.println(date1.isLeapYear());
		LocalDate date2= LocalDate.of(2023, 12, 31);
		System.out.println(date1.isAfter(date2));
		System.out.println(date1.isBefore(date2));
		System.out.println(date1.plusDays(1));
		System.out.println(date1.plusMonths(1));
		System.out.println(date1.plusYears(25));
		System.out.println(date1.minusYears(23));
		System.out.println(date1.withYear(1999));
		System.out.println(date1.getYear());
		System.out.println(date2.getDayOfYear());
		
		
	}
}
