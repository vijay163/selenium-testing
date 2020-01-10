package framework1;

import java.time.LocalDate;
import java.util.Date;

public class date {
	public static void main(String[] args) {
		Date d1 = new Date();
	   System.out.println("*year*"+d1.getYear());
	   System.out.println("*time zone*"+d1.getTimezoneOffset());
	   System.out.println("**instant**"+d1.toInstant());
	   System.out.println("**to String**"+d1.toString());
	   System.out.println("*localString*"+d1.toLocaleString());
	   System.out.println("**getdate"+d1.getDate());
	   System.out.println("**getday**"+d1.getDay());
	   System.out.println("*getmonth*"+d1.getMonth());
	    LocalDate l = LocalDate.now();
	   System.out.println("**localMonth value**"+l.getMonthValue());
	   System.out.println("**get year**"+l.getYear());
	   System.out.println("**plus day**"+l.plusDays(7));
	   System.out.println("**minus day**"+l.minusDays(4));
	   System.out.println("******my bith year****"+l.minusYears(25));
	}

}
