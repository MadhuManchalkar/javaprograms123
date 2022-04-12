package vector123;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

class User1
{
	static void Write()
	{
		Vector<String>  obj=new Vector<String>();
		obj.add("madhu");
		obj.add("madhii");
		obj.add("raamu");
		obj.add("raamu123");
		System.out.println(obj);	
		Vector<String> obj1=new Vector<String>();
		obj1.add("Mansa");
		obj1.add("maans123");
		obj1.add("goudraa");
		obj1.addAll(obj);
		System.out.println(obj1);
		
	}
	static void Read()
	{
		Vector<String> obj=new Vector<String>();
		obj.add("madhu");
		obj.add("madhii");
		obj.add(1,"raamu");
		obj.add("raamu123");
		System.out.println(obj);
		for(String kk:obj)
		{
			System.out.println(kk);
		}
		for(int i=0;i<obj.size();i++)
		{
			System.out.println(obj.get(i));
		}
		Iterator<String> obj1=obj.iterator();
		while(obj1.hasNext())
		{
			System.out.println(obj1.next());
		}
		Enumeration<String> obj2=obj.elements();
		while(obj2.hasMoreElements())
		{
			System.out.println(obj2.nextElement());
		}
		
	}
}

public class Demo1 {

	public static void main(String[] args) {
	//	User1.Write();
		User1.Read();
		

	}

}
