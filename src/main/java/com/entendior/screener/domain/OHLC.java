package com.entendior.screener.domain;

import java.util.Date;

import com.entendior.screener.util.DateUtil;
import com.eoddata.ws.Data.QUOTE;
import com.orientechnologies.orient.core.exception.OSerializationException;
import com.orientechnologies.orient.core.serialization.OSerializableStream;

public class OHLC extends IdObject implements OSerializableStream {
	
	private double open;
	private double high;
	private double low;
	private double close;
	
	private long volume;
	private Date date;
	private String dateString;//2013-02-24 for daily
	                  //2013-02-24-15-03-00 for intraday
	                  // + timezone offset
	private int order;
	
	public OHLC() {}
	
	public OHLC(QUOTE quote){
		this.open = quote.getOpen();
		this.high = quote.getHigh();
		this.low = quote.getLow();
		this.close = quote.getClose();
		this.date = quote.getDateTime().getTime();
		this.dateString = DateUtil.format(this.date, DateUtil.FM_INTRADAY);
		this.volume = quote.getVolume();
	}

	public OHLC(double open, double high, double low, double close) {
		super();
		this.open = open;
		this.high = high;
		this.low = low;
		this.close = close;
	}

	public OHLC(double open, double high, double low, double close, long volume) {
		super();
		this.open = open;
		this.high = high;
		this.low = low;
		this.close = close;
		this.volume = volume;
	}

	public double getOpen() {
		return open;
	}

	public void setOpen(double open) {
		this.open = open;
	}

	public double getHigh() {
		return high;
	}

	public void setHigh(double high) {
		this.high = high;
	}

	public double getLow() {
		return low;
	}

	public void setLow(double low) {
		this.low = low;
	}

	public double getClose() {
		return close;
	}

	public void setClose(double close) {
		this.close = close;
	}

	public long getVolume() {
		return volume;
	}

	public void setVolume(long volume) {
		this.volume = volume;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDateString() {
		return dateString;
	}

	public void setDateString(String dateString) {
		this.dateString = dateString;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public byte[] toStream() throws OSerializationException {
		// TODO Auto-generated method stub
		return null;
	}

	public OSerializableStream fromStream(byte[] iStream) throws OSerializationException {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean equalsApartFromDate(OHLC fileOHLC) {
		if (this.close != fileOHLC.close){
			return false;
		}
		if (this.low != fileOHLC.low){
			return false;
		}
		if (this.high != fileOHLC.high){
			return false;
		}
		if (this.open != fileOHLC.open){
			return false;
		}
		
		return true;
	}

}
