package String_concept;
class Weeks
{
	static void display()
	{
		String s="sundaymondaytuesday,madhu,neela";
		char a[]=s.toCharArray();
		String s1[]=s.split(",");
		for(int i=0;i<s1.length;i++)
		{
			System.out.println(s1[i]);
		}
		
	}
}

public class Day123 {

	public static void main(String[] args) {
		Weeks.display();

	}

}
