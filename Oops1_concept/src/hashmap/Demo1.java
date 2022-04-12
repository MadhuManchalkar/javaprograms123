package hashmap;

import java.util.HashMap;

class Usre1
{
	static void write()
	{
		HashMap<String,String> obj=new HashMap<String,String>();
		obj.put("College", "BGMIT");
		obj.put("faculty Name", "ramangouda");
		obj.put("Subject", "Java");
		obj.put(null, "null keyword is supported in java");
		System.out.println(obj);
		
	}
	static void Remove()
	{
		HashMap<String,String> obj=new HashMap<String,String>();
		obj.put("College", "BGMIT");
		obj.put("faculty Name", "ramangouda");
		obj.put("Subject", "Java");
		obj.put(null, "null keyword is supported in java");
        System.out.println(obj);
        
        String s=obj.get("faculty Name");
        System.out.println(s);
        obj.remove("faculty Name");
        System.out.println(obj);
        
        String s1=obj.get("faculty Name");
        System.out.println(s1);
	}
	static void Read()
	{
		HashMap<String,String> obj=new HashMap<String,String>();
		obj.put("College", "BGMIT");
		obj.put("faculty Name", "ramangouda");
		obj.put("Subject", "Java");
		obj.put(null, "null keyword is supported in java");
		obj.forEach((k,v)-> System.out.println(k+"-------"+v));
	}
	
}
public class Demo1 {

	public static void main(String[] args) {
	//	Usre1.write();
	//	Usre1.Remove();
		Usre1.Read();
	}

}
