package practice_progrms;

import java.util.ArrayList;
import java.util.HashMap;

class throwecxe
{
 static void display()
 {
	 int a=0,b=1,c=0,d=0;
	 System.out.print(a+" "+b+" ");
	 for(int i=1;i<=5;i++)
	 {
		c=a+b;
		a=b;
		b=c;
		System.out.print(c+" ");
	 }
 }
	
}
class throwecxe1
{
  static void show()
   {
	 int a=13;
	 for(int i=1;i<=a;i++)
	 {
		 System.out.println();
	 }
   }

}
class  throwecxe2
{
	static void show1()
	{
		int a[]= {9,7,5,2,4};
		int d=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
				d=a[i];
				a[i]=a[j];
				a[j]=d;
				}
			}
		
		
		}
		for(int k=0;k<a.length;k++)
		{
			System.out.println(a[k]);
		}
	}
	static void show12()
	
	{
		String s="madhu manchalakar ramu leekihal";
	String  r;
		String d[]=s.split(" ");
		for(int i=d.length-1;i>=0;i--)
		{
			//System.out.println(d[i]);
			r=d[i];
		
			char  ch[]=r.toCharArray();
			for(int  n=ch.length-1;n>=0;n--)
			{
				System.out.print(ch[n]);
			}
			System.out.println();
			
		
		}
	}

}
class Thread123 implements  Runnable
{
    public	void run()
	{
		System.out.println("madhu");
	}
    
}


public class Exception12 {

	public static void main(String[] args) {
		
	}

}