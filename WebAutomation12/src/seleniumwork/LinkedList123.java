package seleniumwork;

import java.util.Iterator;
import java.util.LinkedList;

class Demo1123
{
	static void Read()
	{
	LinkedList<String>  obj=new LinkedList<String>();
	obj.add("Madhu");
	obj.add("Manasa");
	obj.add("raamu");
	obj.add("raman");
	System.out.println(obj);
	for(String R:obj)
	{
		System.out.println(R);
		
	}
	for(int i=0;i<obj.size();i++)
	{
		System.out.println(obj.get(i));
	}
	Iterator obj1=obj.iterator();
	while(obj1.hasNext())
	{
		System.out.println(obj1.next());
	}
	
	}
	static void RawApproach()
	{
		LinkedList obj=new LinkedList();
		obj.add("madhu");
		obj.add(123);
		obj.add(1,true);
		System.out.println(obj);
	}
	
}

public class LinkedList123 {

	public static void main(String[] args) {
		//Demo1123.Read();
		Demo1123.RawApproach();

	}

}
