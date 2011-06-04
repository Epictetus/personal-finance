package br.com.personalfinance.mobile.app.formatter;

import java.text.MessageFormat;
import java.util.Date;

public class DateFormatter implements Formatter<Date> {

	@Override
	public Date parse(String s) {
		return null;
	}

	@Override
	public String format(Date t) {
		return null;
	}
	
	public static Date toDate(int day, int month, int year) {
		String dateString = MessageFormat.format("{0}/{1}/{2}", day, month, year);
		
		DateFormatter formatter = new DateFormatter();
		
		return formatter.parse(dateString);
	}

}