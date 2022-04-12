package String_concept;
class Revers12
{
	static void  show()
	{
	String s="madhumanchalakar";
	String m[]=s.split("");
	
	for(int i=m.length-1;i>=0;i--)
	  {
	      System.out.print(m[i]+"");
	  }
	}
}
public class Reveresemethod {

	public static void main(String[] args) {
		Revers12.show();
	}

}

