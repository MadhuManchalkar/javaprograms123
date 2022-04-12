package collection_frame_work_123;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class set_1234
{
	static void disply()
	{
		Set obj=new HashSet();
		obj.add("madhu");
		obj.add("neela");
		obj.add("manasa");
		obj.add("raamu");
		System.out.println(obj);
		for(Object kk:obj)
		{
			System.out.println(kk);
		}
		Iterator obj3=obj.iterator();
		while(obj3.hasNext())
		{
			System.out.println(obj3.next());
		}
	}

}




public class Set_123 {

	public static void main(String[] args) {
		set_1234.disply();

	}

}
