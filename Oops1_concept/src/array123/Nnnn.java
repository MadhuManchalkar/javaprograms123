package array123;
class eee
{
	static void display()
	{
		String s="madhu";
		int c=0;
		char a[]=s.toCharArray();
		for(int m:a)
		{
			c++;
		}
		System.out.println(c);
	}
	static void prime123()
	{
		int a=5,c=0;
		for(int i=0;i<=a;i++)
		{
			if(i%2==0)
			{
				c++;
			}
		}
		System.out.println(c);
		if(c==2)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not aprime");
		}
	}
	static void prime1234()
	{
		int a,b=0,i,j;
		for( i=1;i<=10;i++)
		{
			b=0;
		
			for( j=1;j<=i;j++)
			{	
				if(i%j==0)
				{
					b++;
				}
			if(b==2)
			{
				System.out.println(i);
				
			}
			}
		}
		
	}
	static void thraed123()
	{
		
		
	}
	static void madg()
	{
		String s="gadag";
		StringBuffer d=new StringBuffer(s);
		StringBuffer m=new StringBuffer();
		char a[]=s.toCharArray();
		for(int j=s.length()-1;j>=0;j--)
		{
			m.append(a[j]);
		}
		System.out.println(m);
		if(m.equals(d))
		{
			System.out.println("palindrome");
		}
		else
		{
		System.out.println("not");
		}
		
	}
	static void display12()
	{
		int a=10,b=0,c=1,d=0;
		System.out.print(b+" ");
		for(int i=0;i<=a;i++)
		{
			d=b+c;
			b=c;
			c=d;
			System.out.print(d+" ");
		}
	}
	static void mddd()
	{
		
		String s="madhu",rev="";
		int length=s.length();
		for(int i=length-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		if(s.equals(rev))
		{
			System.out.println("palindrome");
			
		}
		else
		{
			System.out.println("not palindrome");
		}
		
	}
}

public class Nnnn {

	public static void main(String[] args) {
	//	eee.display();
	//	eee.prime123();
		eee.prime1234();
	//	eee.madg();
		//eee.display12();
	//	eee.mddd();
	}

}
