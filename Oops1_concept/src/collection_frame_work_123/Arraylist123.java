package collection_frame_work_123;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

class ListAraay
{
	static void array_list()
	{
		ArrayList<String> obj=new ArrayList<String>();
		obj.add("madhu");
		obj.add("megha");
		obj.add("mahendra");
		obj.add("mohan");
		System.out.println(obj);
		
		for(int i=0;i<obj.size();i++)
		{
			System.out.println(obj.get(i));
		}
	}	
	static void linked_list()
	{
		LinkedList obj=new LinkedList();
		obj.add("madhu");
		obj.add(123);
		obj.add(true);
		obj.add("neha");
		System.out.println(obj);
		
		for(int i=0;i<obj.size();i++)
		{
			System.out.println(obj.get(i));
		}
				
	}
	static void Hash_set()
	{
		Set hashset=new HashSet();
		hashset.add("madhu");
		hashset.add("neela");
		hashset.add("123");
		hashset.add(true);
		hashset.add(null);
		System.out.println(hashset);
		
	}
	static void Tree_set()
	{
		
	}
		
}
	

public class Arraylist123 {

	public static void main(String[] args) {
		ListAraay.array_list();
		ListAraay.linked_list();
		ListAraay.Hash_set();

	}

}
