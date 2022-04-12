package mehods;
class Demo2
{
	int[] add()
	{
		int b=0,k=0;
		int d[]=new int[10];
		for(int i=1;i<=10;i++)
		{
			k=i*i;
			d[b]=k;
			b++;
			k=0;
		}
		return d;
	}

}
public class Square_of_number_1to10 {

	public static void main(String[] args) {
		Demo2 obj=new Demo2();
		int c[]=obj.add();
		for(int i=0;i<10;i++)
		{
			System.out.print(c[i]+" ");
		}
		
		
		

	}

}
