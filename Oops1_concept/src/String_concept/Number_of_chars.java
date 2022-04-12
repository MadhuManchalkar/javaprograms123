package String_concept;
class Demo2
{
	static void  Show()
	{
		String s="madhura";
		char ch[]=s.toCharArray();
		int c=0;
		for(int i=0;i<ch.length;i++)
		{
			c++;
		}
		
		System.out.println(c);
	}
}

public class Number_of_chars {

	public static void main(String[] args) {
		Demo2.Show();

	}

}
