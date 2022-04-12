package abstract1;
class mrThrow
{
	void display(int n)
	
	{
		if(n<1)
		{
			throw new ArithmeticException("the negative number is not didvosable");
		}
		else
		{
			int j=n*n*n;
			System.out.println(j);
		}
	}
	int  display1(int m,int n) throws ArithmeticException
	{
		
		int dev=m/n;
		return dev;
		
	}
	void disply()
	{
		System.out.println(this.getClass());
	}
}


public class Armsrong_number {

	public static void main(String[] args) {
		mrThrow obj=new mrThrow();
		obj.disply();
		
   }

}

