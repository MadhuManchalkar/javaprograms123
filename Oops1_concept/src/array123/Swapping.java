package array123;

public class Swapping {

	public static void main(String[] args) {
		int a[]={2,5,6,8,9,10};
		int d=0,c=0,b=0;
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]<a[j])
			{
				d=a[i];
				a[i]=a[j];
				a[j]=d;
			}
		}
	}
	
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i+1]);
		break;
	}
 }
}
