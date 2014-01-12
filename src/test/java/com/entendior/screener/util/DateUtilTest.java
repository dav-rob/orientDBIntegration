package com.entendior.screener.util;

import java.util.Date;

import org.testng.annotations.Test;

public class DateUtilTest {
	
  @Test
  public void printDate() {
	  Date now = new Date();
	  System.out.println("Daily format = " + DateUtil.format(now, DateUtil.FM_DAILY));
	  System.out.println("Intraday format = " + DateUtil.format(now, DateUtil.FM_INTRADAY));
  }
  
  
}
