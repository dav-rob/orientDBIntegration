package com.entendior.screener.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.persistence.Cacheable;

import com.eoddata.ws.Data.SYMBOL;

public class Symbol extends IdObject{
	
	private String code;  // attribute
    private String name;  // attribute
    private String longName;  // attribute
    private Date dateTime;  // attribute
	
    /**
     * !!!!!  NB - maps need to be declared like this, then initialised in the getter !!!!!
     */
	private Map<String, BrokerPrice> brokerPrices = null;//new HashMap<String, BrokerPrice>();
	private Map<String, List<OHLC>> periodMap = null;
	private Map<String, OHLC> dateMap = null; //new HashMap<String, OHLC>(500);
	
	public Symbol() { }
	
	public Symbol(SYMBOL symbol){
		this.code = symbol.getCode();
		this.name = symbol.getName();
		this.longName = symbol.getLongName();
		this.dateTime = symbol.getDateTime().getTime();
	}
	
	public Map<String, BrokerPrice> getBrokerPrices() {
		return brokerPrices;
	}
	public void setBrokerPrices(Map<String, BrokerPrice> brokerPrices) {
		this.brokerPrices = brokerPrices;
	}
	public Map<String, List<OHLC>> getPeriodMap() {
		if (this.periodMap == null){
			this.periodMap = new HashMap<String, List<OHLC>>();
			this.periodMap.put(PeriodEnum.ONE_DAY.toString(), new ArrayList<OHLC>());
		}
		return periodMap;
	}
	public void setPeriodMap(Map<String, List<OHLC>> periodMap) {
		this.periodMap = periodMap;
	}
	
	
	public Map<String, OHLC> getDateMap() {
		if (this.dateMap == null){
			this.dateMap = new HashMap<String, OHLC>();
		}
		return dateMap;
	}
	public void setDateMap(Map<String, OHLC> dateMap) {
		this.dateMap = dateMap;
	}

	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLongName() {
		return longName;
	}
	public void setLongName(String longName) {
		this.longName = longName;
	}
	public Date getDateTime() {
		return dateTime;
	}
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

}
