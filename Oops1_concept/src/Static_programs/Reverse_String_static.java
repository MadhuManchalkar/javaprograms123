package Static_programs;
class Reverse
{
	static int[] rev(int a[])
	{
		int reverse123[]=new int[a.length];
		int k=0;
		for(int i=a.length-1;i>=0;i--)
		{
			reverse123[i]=a[i];
		}
		return reverse123;
	}
	
}

public class Reverse_String_static {

	public static void main(String[] args) {
		int a[]= {2,2,3,8,5,6};
	    int b[]=Reverse.rev(a);
	    for(int i=b.length-1;i>=0;i--)
	    {
	    	System.out.print(b[i]+" ");
	    }
		

	}

}
