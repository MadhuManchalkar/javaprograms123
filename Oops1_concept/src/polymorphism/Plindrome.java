package polymorphism;

public class Plindrome {

	public static void main(String[] args) {
		int a=222,b=0,c=0,d=0;
		int m=a;
		while(a!=0)
		{
		 
		  c=a%10;
		  d=c+(10*d);
		
		  a=a/10;
			 
		}
		System.out.println(d);
		
		if(d==m)
		 {
			 System.out.println("the given number is palindrome");
		 }
		 else 
		 {
			 System.out.println("the given number is not palindrome ");
		 }

	}

}
