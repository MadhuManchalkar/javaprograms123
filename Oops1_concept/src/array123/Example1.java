package array123;

public class Example1 {

	public static void main(String[] args) {
		int a[]=new int[10];
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
			{
				a[i]=i;
				System.out.println(a[i]);
			}
		}

	}

}
