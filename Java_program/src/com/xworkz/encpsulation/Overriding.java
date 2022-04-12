package com.xworkz.encpsulation;
public abstract  class Overriding {

	private	String name;
	private	String version;
	private 	String company;
	public Overriding(String name,String version,String company)
	{
		this.company=company;
		this.name=name;
		this.version=version;
		
	}
	
	public  void connect()
	{
		System.out.println("connect mrthod");
	}
	abstract  	void developer();
	abstract  void showTime();
	public String getName()
	{
		
		return name;
	}
	public String getversion()
	{
		return version;
	}
	public  String getCompany()
	{
		return company;
	}
	
}
