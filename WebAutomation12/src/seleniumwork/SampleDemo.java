package seleniumwork;

import java.lang.reflect.Method;

public class SampleDemo {

	public static void main(String[] args) {
		Sampl12 obj=null;
		try
		{
			obj=new Sampl12();
			Method method[]=obj.getClass().getMethods();
			for(int i=0;i<method.length;i++)
			{
				String methodname=method[i].getName();
				System.out.println(methodname);
			}
			Method method1[]=obj.getClass().getDeclaredMethods();
			for(int i=0;i<method1.length;i++)
			{
				String methodname1=method1[i].getName();
				System.out.println(methodname1);
				if(methodname1.startsWith("display"))
				{
					method1[i].invoke(obj);
				}
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
