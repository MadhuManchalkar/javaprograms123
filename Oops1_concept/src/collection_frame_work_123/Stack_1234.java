package collection_frame_work_123;

import java.util.Iterator;
import java.util.Stack;

class list_stack
{
	static void display()
	{
		Stack obj=new Stack();
		obj.push("madhu");
		obj.push("megha");
		obj.push("mahendra");
		obj.push("mohan");
		obj.pop();
		
		System.out.println(obj);
		Iterator obj1=obj.iterator();
		while(obj1.hasNext())
		{
			System.out.println(obj1.next());
		}
	}

}
public class Stack_1234 {

	public static void main(String[] args) {
		list_stack.display();
	}

}
