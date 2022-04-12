package mehods;
class Demo1
{
	int[] add(int a,int b)
	{
		int c=0,d=0;
		for(int i=a;i<b;i++)
		{
			if(i%2==0)
			{
				c++;
			}
		}
		int m[]=new int[c];
		
		for(int i=a;i<b;i++)
		{
			if(i%2==0)
			{
				m[d]=i;
				d++;
			}
		}
		return m;
	}
}

public class Return_from_91to71 {

	public static void main(String[] args) {
		Demo1 obj=new Demo1();
		
		int c[]=obj.add(71, 91);
		for(int i=0;i<10;i++)
		{
			
			System.out.print(c[i]+" ");
		}
		
		

	}

}
