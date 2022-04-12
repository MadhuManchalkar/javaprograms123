package treeset123;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

class User123
{
	static void write()
	{
	TreeSet<String> obj=new TreeSet<String>();
		obj.add("apple");
		obj.add("orange");
		obj.add("graphes");
		obj.add("apple");
		System.out.println(obj);
		TreeSet<String>  obj2=new TreeSet<String>();
		obj2.add("apple1");
		obj2.add("orange2");
		obj2.add("graphes1");
		obj2.addAll(obj);
		System.out.println(obj2);
		
	}
	static void read()
	{
	TreeSet<String> obj=new TreeSet<String>();
	obj.add("apple");
	obj.add("orange");
	obj.add("graphes");
	obj.add("apple");
	for(String kk:obj)
	{
		System.out.println(kk);
	}
	}
	static void read1()
	{
	TreeSet<String> obj=new TreeSet<String>();
	obj.add("apple");
	obj.add("orange");
	obj.add("graphes");
	obj.add("apple");
	Iterator<String> obj1=obj.iterator();
	while(obj1.hasNext())
	{
		System.out.println(obj1.next());
	}
	
	}
	static void read2()
	{
	TreeSet<String> obj=new TreeSet<String>();
	obj.add("apple");
	obj.add("orange");
	obj.add("graphes");
	obj.add("apple");
	}
}
public class Demo1 {

	public static void main(String[] args) {
		//User123.write();
	//	User123.read();
		User123.read1();
	}

}
