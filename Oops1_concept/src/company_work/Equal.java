package company_work;

import java.util.Scanner;
class Madhu
{
	String m[]=new String[2];
	String k[]=new String[2];
	int age[]=new int[2];
	int temp=0;
	void display(String name,String fullname,int age)
	{
		  if(m[0]!=null)
			{
				for(int i=0;i<m.length;i++)
				{
					if(name.equals(m[i]))
					{
						
					return;
					}
				}
			}
		  if(k[0]!=null)
		  {
			  for(int i=0;i<m.length;i++)
				{
					if(name.equals(k[i]))
					{
						
					return;
					}
				}  
		  }
			this.m[temp]=name;
			this.k[temp]=fullname;
			this.age[temp]=age;
		
		for(int i=0;i<=temp;i++)
		{
			System.out.println(this.m[i]+" "+this.k[i]+" "+" "+this.age[i]);
		}
		
		temp++;
		
	
	}
	void show()
	{
		int empid=1;
		for(int i=0;i<m.length;i++)
		{
			
			System.out.println(m[i]+" "+k[i]+" "+age[i]+" "+empid);
			empid++;
		}
	}
}
public class Equal {

	public static void main(String[] args) {
		Madhu obj12=new Madhu();
		for(int i=0;i<2;i++)
		{
			Scanner obj=new Scanner(System.in);
			System.out.println();
			String name=obj.next();
			String name1=obj.next();
			int age=obj.nextInt();
			obj12.display(name,name1,age);
			
		}
		//obj12.show();
	}

}
