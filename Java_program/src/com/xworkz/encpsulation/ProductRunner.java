package com.xworkz.encpsulation;


class Madhu
{
	int a=10,c=390;
	public String toString()
	{
		return "(b="+a+"),(c="+c+")";
	}
}
public class ProductRunner {

	public static void main(String[] args) {
		
	     Madhu obj=new Madhu();
	    String d=obj.toString();
	    System.out.println(d);
	}

}
