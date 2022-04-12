package mehods;
class Demo3
{
	int[] fibbonacci(int a,int b)
	{
		int c=0,k=0;
		int d[]=new int[10];
		System.out.print(a+" "+b+" ");
		
		for(int i=0;i<10;i++)
		{
			c=a+b;
			a=b;
			b=c;
			d[k]=c;
			k++;
			
		}
		return d;
	}
}

public class fibbonacci_using_return {

	public static void main(String[] args) {
		Demo3 obj=new Demo3();
		int d[]=obj.fibbonacci(0, 1);
		for(int i=0;i<10;i++)
		{
		 System.out.print(d[i]+" ");
		}
	}

}
