package com.entendior.screener.domain;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.eoddata.ws.Data.EXCHANGE;

public class Exchange {
	
    private String code;  // attribute

    private String name;  // attribute

    private Date lastTradeDate;  // attribute

    private String country;  // attribute

    private String currency;  // attribute

    private String timeZone;  // attribute
	
	Map<String, Symbol> symbols = new HashMap<String, Symbol>();
	
	public Exchange() { }
	
	public Exchange(EXCHANGE exchange){
		this.code = exchange.getCode();
		this.name = exchange.getName();
		this.lastTradeDate = exchange.getLastTradeDateTime().getTime();
		this.country = exchange.getCountry();
		this.currency = exchange.getCurrency();
		this.timeZone = exchange.getTimeZone();
	}

	public Map<String, Symbol> getSymbols() {
		return symbols;
	}

	public void setSymbols(Map<String, Symbol> symbols) {
		this.symbols = symbols;
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	public Date getLastTradeDate() {
		return lastTradeDate;
	}

	public void setLastTradeDate(Date lastTradeDate) {
		this.lastTradeDate = lastTradeDate;
	}

}
