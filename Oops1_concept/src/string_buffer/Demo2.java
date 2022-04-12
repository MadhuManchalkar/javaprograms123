package string_buffer;
class User1
{
	static void display()
	{
		String s1="madhu";
		System.out.println(s1);
		String s2=s1.concat("manchalakar");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("+++++++++");
		
		StringBuilder  s=new StringBuilder("madhu");
		System.out.println(s);
		s.append("machalakar");
		System.out.println(s);
		s.append("madhu1");
		System.out.println(s);
		
	}
}

public class Demo2 {

	public static void main(String[] args) {
		User1.display();
		
	}

}
