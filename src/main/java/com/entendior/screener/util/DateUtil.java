package com.entendior.screener.util;

import java.util.Calendar;
import java.util.Date;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;

public class DateUtil {
	
	public static DateTimeFormatter FM_EODDATA_DAILY = new DateTimeFormatterBuilder()
	.appendDayOfMonth(2)
	.appendLiteral('-')
    .appendMonthOfYearShortText()
    .appendLiteral('-')
	.appendYear(4, 4)
    .toFormatter();
	
	public static DateTimeFormatter FM_DAILY = new DateTimeFormatterBuilder()
    .appendYear(4, 4)
    .appendLiteral('-')
    .appendMonthOfYear(2)
    .appendLiteral('-')
    .appendDayOfMonth(2)
    .appendTimeZoneOffset(null, true, 2, 2)
    .toFormatter();

	public static DateTimeFormatter FM_INTRADAY = new DateTimeFormatterBuilder()
    .appendYear(4, 4)
    .appendLiteral('-')
    .appendMonthOfYear(2)
    .appendLiteral('-')
    .appendDayOfMonth(2)
    .appendLiteral('-')
    .appendHourOfDay(2)
    .appendLiteral('-')
    .appendMinuteOfHour(2)
    .appendLiteral('-')
    .appendSecondOfMinute(2)
    .appendTimeZoneOffset(null, true, 2, 2)
    .toFormatter();
	
	public static DateTime getJodaTime(Date jdkDate) {
		DateTime dt = new DateTime(jdkDate);
		return dt;
	}
	
	public static DateTime getJodaTime(Calendar jdkCalendar) {
		DateTime dt = new DateTime(jdkCalendar);
		return dt;
	}
	
	public static String format(Date jdkDate, DateTimeFormatter format){
		DateTime dt = getJodaTime(jdkDate);
		String formattedStr = format.print(dt);
		return formattedStr;
	}
	
	public static String format(Calendar jdkCalendar, DateTimeFormatter format){
		DateTime dt = getJodaTime(jdkCalendar);
		String formattedStr = format.print(dt);
		return formattedStr;
	}
	
}
