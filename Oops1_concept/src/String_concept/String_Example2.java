package String_concept;
class Demo1
{
	static void Strin_length()
	{
		String s="Masghu";
		int obj=s.length();
		System.out.println(obj);
	}
	static void empty_String()
	{
		String s=new String();
		boolean v1=s.isEmpty();
		System.out.println(v1);
	}
	static void get_char()
	{
		String s="madhu";
		char a=s.charAt(0);
		System.out.println(a);
	}
	static void strReplace()
	{
		String s="it was a new  city";
		String obj=s.replace("was","is");
		System.out.println(obj);
	}
	static void Str_Compare()
	{
		String s="madhu";
		String s1="MADHU";
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s1));
	}
	static void Str_compare1()
	{
		String s="madhu";
		String s1="MADHU";
		System.out.println(s.compareTo(s1));
		System.out.println(s.compareToIgnoreCase(s1));
	}
	static void Str_get_Array()
	{
		String s="madhu";
		char a[]=s.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
	}
	static void Str_split()
	{
		String s="madhu,maanas,raamu";
		String s1[]=s.split(",");
		for(int i=0;i<s1.length;i++)
		{
		System.out.println(s1[i]);
		}
	}
	static void Str_String()
	{
		int a=25;
		String s=String.valueOf(a);
		System.out.println(s);
		
	}
}

public class String_Example2 {

	public static void main(String[] args) {
		//Demo1.Strin_length();
		//  Demo1.empty_String();
		 // Demo1.get_char();
		//  Demo1.strReplace();
	//	  Demo1.Str_Compare();
		 // Demo1.Str_compare1();
		//Demo1.Str_get_Array();
		//  Demo1.Str_split();
		  Demo1.Str_String();
	}

}
