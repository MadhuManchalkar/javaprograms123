package collection_assignment;

import java.util.ArrayList;
import java.util.Vector;

class User3
{
	static Vector show()
	{
		ArrayList<String>  obj=new ArrayList<String>();
		obj.add("apple");
		obj.add("orange");
		obj.add("mango");
		Vector<String> obj1=new Vector<String>();
		obj1.add("apple1");
		obj1.add("orange");
		obj1.addAll(obj);
		return obj1;
	}
}

public class Demo3 {

	public static void main(String[] args) {
		
		Vector c=User3.show();
		System.out.println(c);
		

	}

}
