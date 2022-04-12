package string_buffer;
class app
{
	static void display() 
	{
		StringBuffer obj=new StringBuffer("madhu");
		//System.out.println(obj);
		obj.append("manchalakr");
		//System.out.println(obj);
		obj.append("raamu");
		System.out.println(obj);
    }
	static void show()
	{
		StringBuffer obj1=new StringBuffer("madhumanchalakar");
	int  obj2=obj1.length();
	System.out.println(obj2);
		
		
	}
	static void show1()
	{
		StringBuffer obj1=new StringBuffer();
		boolean obj3=obj1.isEmpty();
		System.out.println(obj3);
	}
	static void show2()
	{
		StringBuffer obj2=new StringBuffer("madhu");
	   StringBuffer  ch=obj2.reverse();
	   System.out.println(ch);
	}
	static void shw3()
	{
		StringBuffer obj3=new StringBuffer("maanasa");
		StringBuffer ch=obj3.delete(3,5);
		System.out.println(ch);
	}
}
public class Append123 {

	public static void main(String[] args) {
		//app.display();
		//app.show();
		//app.show1();
		//app.show2();
		app.shw3();
		
	}

}
