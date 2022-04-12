package String_concept;
class pal123
{
	void display()
	{
		
		String s="gadag";
		String s4=s;
		String s2;
		String s3[]=s.split("");
		for(int i=s3.length-1;i>=0;i--)
		{
			s2=s3[i];
			System.out.println(s2);
			
		}


	}
}

public class Pal {

	public static void main(String[] args) {
	
		pal123 obj=new pal123();
		obj.display();
	}

}
