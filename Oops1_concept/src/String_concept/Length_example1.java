package String_concept;
class Length12
{
	void displauy()
	{
	String s="madhu";
	int c=0;
	char a[]=s.toCharArray();
	for(int i=0;i<a.length;i++)
	{
		c++;
	}
	System.out.println(c);
	}
	
}



public class Length_example1 {

	public static void main(String[] args) {
		Length12  obj=new Length12();
		obj.displauy();

	}

}
