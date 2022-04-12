package company_work;

public class Sorting {

	public static void main(String[] args) {
		int a[]= {80,60,30,50,90};
		int c;
		for( int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
				c=a[j];
				a[j]=a[i];
				a[i]=c;
				}
			}
		}
   for(int k=0;k<a.length;k++)
   {
	   System.out.println(a[k]);
   }
	}

}
