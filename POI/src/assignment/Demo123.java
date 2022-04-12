package assignment;

public class Demo123 {

	public void Strin_length()
	{
		String s="Masghu";
		int obj=s.length();
		System.out.println(obj);
	}
	public void empty_String()
	{
		String s=new String();
		boolean v1=s.isEmpty();
		System.out.println(v1);
	}
	public void get_char()
	{
		String s="madhu";
		char a=s.charAt(0);
		System.out.println(a);
	}
	public void strReplace()
	{
		String s="it was a new  city";
		String obj=s.replace("was","is");
		System.out.println(obj);
	}
	public void Str_Compare()
	{
		String s="madhu";
		String s1="MADHU";
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s1));
	}
	public void Str_compare1()
	{
		String s="madhu";
		String s1="MADHU";
		System.out.println(s.compareTo(s1));
		System.out.println(s.compareToIgnoreCase(s1));
	}

	public void Str_get_Array()
	{
		String s="madhu";
		char a[]=s.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
	}
	public void Str_split()
	{
		String s="madhu,maanas,raamu";
		String s1[]=s.split(",");
		for(int i=0;i<s1.length;i++)
		{
		System.out.println(s1[i]);
		}
	}
	public void Str_String()
	{
		int a=25;
		String s=String.valueOf(a);
		System.out.println(s);
		
	}
}
