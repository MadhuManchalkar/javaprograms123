package string_work;
class example
{
	static void  tochararray1()
	{
		String name="madhu";
		char a[]=name.toCharArray();
		for(int i=0;i<a.length;i++)
		{
		     System.out.print(a[i]);
		     
		}
		System.out.println();
	} 
	
	static void charat()
	{
		String name="madhu";
		char a=name.charAt(0);
		
		     System.out.println(a);
		
	}
	static void split()
	{
		String  name="madhu manchalkar";
		String a[]=name.split("n");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
	}
}


public class Demo1 {

	public static void main(String[] args) {
		//example.tochararray1();
	//	example.charat();
		example.split();
		

    
   
	}

}
