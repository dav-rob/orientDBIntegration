package com.entendior.screener.util;

import java.util.Date;

public class Timer {
	
	private Date startDate;
	private Date endDate;
	private String lengthInMillis;

	public Timer() {
		this.startDate = new Date();
	}
	
	public static Timer start(){
		return new Timer();
	}
	
	public String end(String desc){
		this.endDate = new Date();
		this.lengthInMillis = "["+ (this.endDate.getTime() - this.startDate.getTime()) +"]";
		return desc == null ? lengthInMillis : desc + lengthInMillis;
	}

}
