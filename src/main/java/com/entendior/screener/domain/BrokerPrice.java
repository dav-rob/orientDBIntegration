package com.entendior.screener.domain;

public class BrokerPrice {
	
	private Double bid;
	private Double ask;
	private Double spread;
	private String currency;
	private Double percentCommission;
	private Double currencyCommission;
	private Double onePercentLoss;
	private Integer minimumLotSize;
	private Double minimumOnePercentLossAmount;
	
	
	public static Double getMinimumOnePercentLossCurrencyComm(String currency, Double currencyComm, Double ask, Integer minimumLotSize ){
		Double min = (ask /100) * minimumLotSize + currencyComm;
		return min;
	}
	
	public static Double getMinimumOnePercentLossPercentComm(String currency, Double percentCommission, Double ask, Integer minimumLotSize ){
		Double min = (ask /100) * minimumLotSize + (percentCommission / 100)*ask;
		return min;
	}
	
	public static Double getMinimumOnePercentLossSpread(String currency, Double ask, Double bid, Integer minimumLotSize ){
		BrokerPrice bp = caluculateCommissionSpread(currency, ask, bid, minimumLotSize);
		return bp.minimumOnePercentLossAmount;
	}
	
	public static BrokerPrice caluculateCommissionSpread(String currency, Double ask, Double bid, Integer minimumLotSize ){
		BrokerPrice bp = new BrokerPrice();
		bp.bid = bid;
		bp.ask = ask;
		bp.spread = ask - bid;
		bp.currency = currency;
		bp.percentCommission = ((ask - bid)/ask) *100;
		bp.currencyCommission = ask - bid;
		bp.onePercentLoss = ask/100;
		bp.minimumOnePercentLossAmount = bp.onePercentLoss * minimumLotSize;
		
		return bp;
	}


	public Double getBid() {
		return bid;
	}

	public void setBid(Double bid) {
		this.bid = bid;
	}

	public Double getAsk() {
		return ask;
	}

	public void setAsk(Double ask) {
		this.ask = ask;
	}

	public Double getSpread() {
		return spread;
	}

	public void setSpread(Double spread) {
		this.spread = spread;
	}

	public Double getCurrencyCommission() {
		return currencyCommission;
	}

	public void setCurrencyCommission(Double currencyCommission) {
		this.currencyCommission = currencyCommission;
	}

	public String getCurrency() {
		return currency;
	}


	public void setCurrency(String currency) {
		this.currency = currency;
	}


	public Double getPercentCommission() {
		return percentCommission;
	}


	public void setPercentCommission(Double percentCommission) {
		this.percentCommission = percentCommission;
	}


	public Double getCurrencyComission() {
		return currencyCommission;
	}


	public void setCurrencyComission(Double currencyComission) {
		this.currencyCommission = currencyComission;
	}


	public Double getOnePercentLoss() {
		return onePercentLoss;
	}


	public void setOnePercentLoss(Double onePercentLoss) {
		this.onePercentLoss = onePercentLoss;
	}


	public Integer getMinimumLotSize() {
		return minimumLotSize;
	}


	public void setMinimumLotSize(Integer minimumLotSize) {
		this.minimumLotSize = minimumLotSize;
	}


	public Double getMinimumOnePercentLossAmount() {
		return minimumOnePercentLossAmount;
	}


	public void setMinimumOnePercentLossAmount(Double minimumOnePercentLossAmount) {
		this.minimumOnePercentLossAmount = minimumOnePercentLossAmount;
	}
	

}
