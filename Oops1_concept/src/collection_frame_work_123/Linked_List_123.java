package collection_frame_work_123;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

class List_Link
{
	static void display()
	{
		LinkedList  obj=new LinkedList();
		obj.add("madhu");
		obj.add("raamu");
		obj.add(1,"maanasa");
		obj.add("madhiii");
		System.out.println(obj);
		for(int i=0;i<obj.size();i++)
		{
			System.out.println(obj.get(i));
		}
		for(Object kk:obj)
		{
			System.out.println(kk);
		}
		Iterator obj1=obj.iterator();
		while(obj1.hasNext())
		{
			System.out.println(obj1.next());
		}
		obj.remove(0);
		System.out.println(obj);
		
	}
	static void show()
	{
		Vector obj=new  Vector();
		obj.add("madhu");
		obj.add("raamu");
		obj.add(1,"maanasa");
		obj.add("madhiii");
		System.out.println(obj);
		Enumeration obj3=obj.elements();
		while(obj3.hasMoreElements())
		{
			System.out.println(obj3.nextElement());
		}
	}
	
}
public class Linked_List_123 {

	public static void main(String[] args) {
		//List_Link.display();
		List_Link.show();
	}

}
