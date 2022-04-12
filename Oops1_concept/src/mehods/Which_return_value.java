package mehods;
class Mathematics
{
	void display()
	{
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		
		int d=a.length;
		int m=a.length/2;
		int a1[]=new int[m];
		int n;
		int k=0,b=0;
		for(int i=0;i<m;i++)
		{
			a1[i]=a[i];
		}
		
		for(int j=m;j<d;j++)
		{
			
			if(k<m)
			{
				a[k]=a[j];
				
			}
			k++;
		}
		for(int l=m;l<d;l++)
		{
			if(b<m)
			{
				a[l]=a1[b];
				
			}
			b++;
		}
		for(int i=0;i<a.length;i++)
		{
		System.out.print(a[i]+" ");
		}
		
	}
}

public class Which_return_value {

	public static void main(String[] args) {
		Mathematics obj=new Mathematics();
		obj.display();
	

	}

}
