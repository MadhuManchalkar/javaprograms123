package com.xworkz.sorting;

public class Number {

	public static void main(String[] args) {
		int a1=123456,b1=0,p=0,k=0;
		
		while(a1!=0)
		{
			b1=a1%10;
			p=p*10+b1;
			
			a1=a1/10;
		}
		System.out.println("number"+p);
		while(p!=0)
		{
		   k=p%10;
		   System.out.println(k);
		   p=p/10;
		}
	}

}
