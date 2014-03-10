package screener.OrientDBIntegration;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import net.objectlab.kit.datecalc.common.DateCalculator;
import net.objectlab.kit.datecalc.common.DefaultHolidayCalendar;
import net.objectlab.kit.datecalc.common.HolidayCalendar;
import net.objectlab.kit.datecalc.common.HolidayHandlerType;
import net.objectlab.kit.datecalc.common.StandardTenor;
import net.objectlab.kit.datecalc.joda.LocalDateKitCalculatorsFactory;

import org.joda.time.LocalDate;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.entendior.screener.util.Util;

import de.jollyday.Holiday;
import de.jollyday.HolidayManager;


/**
 * Although JollyDay works quite well as a holiday list.  It has flaws, e.g. the royal wedding and bank holiday
 *  dates that were moved in 2011.
 * 
 * The best way of determining holidays is probably heuristics i.e. if there is no trading volumne 
 *  for all of these tickers then, most likely, it is a holiday.
 * 
 * @author davidroberts
 *
 */
public class HolidayAndWorkingDayTest {
	
	@Test
	public void testDateAndExchangeFiles() {
		
		File csvClasspathDir = new File("/LSE");
		System.out.println("Dir /LSE exits = " + csvClasspathDir.exists());
		Assert.assertFalse(csvClasspathDir.exists());
		// test the directory relative to the project directory
		File csvProjectRelativeDir = new File("./src/test/resources/LSE/");
		System.out.println("Dir ./src/test/resources/LSE/ exits = " + csvProjectRelativeDir.exists());
		Assert.assertTrue(csvProjectRelativeDir.exists());
		File[] files = csvProjectRelativeDir.listFiles();
		
		Arrays.sort(files, Util.CP_FILES_BY_NAME);
		LocalDate startDate = new LocalDate("2011-01-01");
		LocalDate endDate = new LocalDate("2013-07-17");
		
		
		DateCalculator<LocalDate> ukCalForward1 = 
				createDateCalculator("UK", startDate, endDate);
		
		LocalDate currentDate = ukCalForward1.setCurrentBusinessDate(startDate); 
		List<File> filesList = Arrays.asList(files);
		Iterator<File> filesIt = filesList.iterator();
		while (!currentDate.equals(endDate)){
			// 29 Aug 06
			System.out.println("Current Date = " + ukCalForward1.getCurrentBusinessDate()
					+ " file date = " + filesIt.next()
					);
			// NB - throws java.lang.IndexOutOfBoundsException if outside of set startdate and enddate.
			currentDate = ukCalForward1.moveByDays(1).getCurrentBusinessDate();
		}
	}
	
	@Test 
	public void testIterationAndCreationClass() throws Exception {
		LocalDate startDate = new LocalDate("2011-01-01");
		LocalDate endDate = new LocalDate("2013-07-17");
		
		
		DateCalculator<LocalDate> ukCalForward1 = 
				createDateCalculator("UK", startDate, endDate);
		
		LocalDate currentDate = ukCalForward1.setCurrentBusinessDate(startDate); 
		
		while (!currentDate.equals(endDate)){
			// 29 Aug 06
			System.out.println("Current Date = " + ukCalForward1.getCurrentBusinessDate());
			// NB - throws java.lang.IndexOutOfBoundsException if outside of set startdate and enddate.
			currentDate = ukCalForward1.moveByDays(1).getCurrentBusinessDate();
		}

	}
	
	public static DateCalculator<LocalDate> createDateCalculator(String countryCode, LocalDate startDate, LocalDate endDate ) {
		HolidayManager manager = HolidayManager.getInstance(countryCode);
		String forwardBackHoliday;
		Set<LocalDate> holidaysForYears;
		final HolidayCalendar<LocalDate> calendar;
		DateCalculator<LocalDate> cal;
		if (startDate.toDate().getTime() < endDate.toDate().getTime()){
			forwardBackHoliday = HolidayHandlerType.FORWARD;
			holidaysForYears = getHolidays(manager, startDate, endDate);
			calendar = new DefaultHolidayCalendar<LocalDate>(holidaysForYears, startDate, endDate);// register the holidays, any calculator with name "UK"
			cal = getCal(forwardBackHoliday, calendar);
		} else if (startDate.toDate().getTime() > endDate.toDate().getTime()){
			forwardBackHoliday = HolidayHandlerType.BACKWARD;
			holidaysForYears = getHolidays(manager, endDate, startDate);
			calendar = new DefaultHolidayCalendar<LocalDate>(holidaysForYears, endDate	, startDate);
			cal = getCal(forwardBackHoliday, calendar);
		} else {
			throw new IllegalStateException("start date and end date are equal");
		}
		
		return cal;
	}

	private static DateCalculator<LocalDate> getCal(String forwardBackHoliday,
			final HolidayCalendar<LocalDate> calendar) {
		LocalDateKitCalculatorsFactory.getDefaultInstance().registerHolidays("UK", calendar);   
		DateCalculator<LocalDate> cal = LocalDateKitCalculatorsFactory.getDefaultInstance()
		        .getDateCalculator("UK", forwardBackHoliday);
		return cal;
	}
	
	private static Set<LocalDate> getHolidays(HolidayManager manager, LocalDate startDate, LocalDate endDate) {
		int startYear = startDate.getYear();
		int endYear = endDate.getYear();
		if (startYear > endYear){
			throw new IllegalStateException("start year before end year.");
		}
		Set<Holiday> holidays = manager.getHolidays(startYear);
		int year = startYear;
		while (year<endYear){
			year+=1;
			Set<Holiday> localHolidays = manager.getHolidays(year);
			holidays.addAll(localHolidays);
			
		}
		
		Set<LocalDate> holidayDates = new HashSet<LocalDate>();
		for(Holiday h : holidays){
			holidayDates.add(h.getDate());
		}
		
		return holidayDates;
	}

	@Test 
	public void testVariableBehavior() throws Exception {
		HolidayManager manager;
		try {
			manager = HolidayManager.getInstance("hhhhhh");
			Assert.fail();
			System.out.print("Manager = " + manager);
		} catch (IllegalStateException e) {
			System.out.println("Throws Exception for [hhhhhh]");
		}
		try {
			manager = HolidayManager.getInstance("xx");
			Assert.fail();
			System.out.print("Manager = " + manager);
		} catch (IllegalStateException e) {
			System.out.println("Throws Exception for [xx]");
		}
		
		LocalDate testLocalDate1 = new LocalDate("2006-12-31");
		System.out.println("getYear:" + testLocalDate1.getYear());
		
	}
	
	@Test
	public void test1() throws Exception{
		HolidayManager manager = HolidayManager.getInstance("UK"); // get UK HolidayManager
        
		// create or get the Holidays
		final Set<Holiday> holidays = manager.getHolidays(2006);

		// fill dates into set of LocalDate
		Set<LocalDate> holidayDates = new HashSet<LocalDate>();
		for(Holiday h : holidays){
			holidayDates.add(h.getDate());
		}
		         
		// create the HolidayCalendar ASSUMING that the set covers 2006!
		final HolidayCalendar<LocalDate> calendar = 
			new DefaultHolidayCalendar<LocalDate>(holidayDates, 
					new LocalDate("2006-01-01"), new LocalDate("2006-12-31"));
		           
		// register the holidays, any calculator with name "UK"
		// asked from now on will receive an IMMUTABLE reference to this calendar
		LocalDateKitCalculatorsFactory.getDefaultInstance().registerHolidays("UK", calendar);
		         
		// ask for a LocalDate calculator for "UK"
		// (even if a new set of holidays is registered, this one calculator is not affected
		DateCalculator<LocalDate> cal = LocalDateKitCalculatorsFactory.getDefaultInstance()
		        .getDateCalculator("UK", HolidayHandlerType.FORWARD);
		                 
		// set startDate, this will also set the current business date.
		cal.setStartDate(new LocalDate("2006-08-28"));
		         
		// startDate stays 28 Aug 06 BUT the currentDate has moved,
		// according to Forward handler to 29 Aug 2006.
		LocalDate start = cal.getStartDate();   // 28 Aug 06
		LocalDate current = cal.getCurrentBusinessDate(); // 29 Aug 06
		 
		LocalDate newCurrent = cal.moveByDays(4).getCurrentBusinessDate(); // 4 Sept 06 due to weekend!
		         
		// Example with Tenor, 1W with a 2 day spot lag
		LocalDate date1WeekFromSpot = cal.moveByTenor(StandardTenor.T_1W, 2).getCurrentBusinessDate();
	}

}
