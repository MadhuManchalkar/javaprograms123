package String_concept;
class Revesrw
{
	static void show()
	{
		String n="madhu raamu manasa";
		String m;
		StringBuilder r=new StringBuilder();
		String s1[]=n.split(" ");
		for(int i=0;i<s1.length;i++)
		{
          // m=s1[i];
          
           char ch1[]=s1[i].toCharArray();
           for(int k=ch1.length-1;k>=0;k--)
           {
        	r.append(ch1[k]);
        	  
           }
           r.append(" ");
		}
		
        System.out.println(r);
    }
}

public class ReversetheString {

	public static void main(String[] args) {
		Revesrw.show();

	}

}
