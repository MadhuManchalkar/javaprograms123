package collection_assignment;

import java.util.LinkedList;
import java.util.Queue;

class User2
{
	static Queue Show()
	{
		Queue<String> obj=new LinkedList<String>();
		obj.add("apple");
		obj.add("orange");
		obj.add("mango");
		return obj;
	}
}
public class Demo2 {

	public static void main(String[] args) {
	Queue d=	User2.Show();
	d.remove("apple");
	System.out.println(d);
		

	}

}
