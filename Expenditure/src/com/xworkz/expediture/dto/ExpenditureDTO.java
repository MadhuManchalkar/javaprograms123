package com.xworkz.expediture.dto;



public class ExpenditureDTO  {//predefined class String--datatype ,user defined class
	private double amount;//ExpenditureDTO--datatype ,userdefined non 
	private double tax;
	private ExpenditurePeriod   expenditurePeriod;//enum class 
	private String spenOn;
	private String personName;
	public double getAmount() {//setAmount and getAmount
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	public ExpenditurePeriod getExpenditurePeriod() {
		return expenditurePeriod;
	}
	public void setExpenditurePeriod(ExpenditurePeriod expenditurePeriod) {
		this.expenditurePeriod = expenditurePeriod;
	}
	public String getSpenOn() {
		return spenOn;
	}
	public void setSpenOn(String spenOn) {
		this.spenOn = spenOn;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}

}
