package practice_progrms;

public class STRING_palindrome {

	public static void main(String[] args) {
		String s="gadag";
		StringBuffer d=new StringBuffer(s);
		StringBuffer c=new StringBuffer();
     
   
           for(int i=s.length()-1;i>=0;i--)
		{
		      char a=s.charAt(i);
		      c.append(a);
		}
           System.out.println(d);
           System.out.println(c);
        if(c.equals(d) )
        {
        	System.out.println("palindrome");
        }
        else
        {
        	System.out.println("not palindrome");
        }
        
    }
	
	

}






