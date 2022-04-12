package com.xowrkz.inheritence;
public class Tyre {
	String company;
	int price;
	long mobileNumber;
	boolean available;
	String modelnumber;
	public Tyre(String company,int price,long mobileNumber,boolean available,String modelnumber )
	{
		this.company=company;
		this.price=price;
		this.mobileNumber=mobileNumber;
		this.available=available;
		this.modelnumber=modelnumber;
	}
	public boolean equals(Object obj)//19
	{
		if(obj==null)
		{
			System.out.println("the object is null");
			return false;
		}
		else
		{
			if(obj instanceof Tyre)
			{
				System.out.println("start comparing");
				Tyre obj1=(Tyre)obj;
				String tempcompany=obj1.company;
				String  tempmodelnumber=obj1.modelnumber;
		if(this.company.equals(tempcompany) && this.modelnumber.equals(tempmodelnumber) )
		{
		   System.out.println("casted method");
			return true;
				
		}
		
				
			}
			else
			{
				System.out.println("we canot compare");
			}
			
		}
		System.out.println("main method");
		return false;
	}
}
