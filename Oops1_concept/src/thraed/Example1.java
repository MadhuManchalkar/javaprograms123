package thraed;
class Sample implements Runnable
{
		public void run()
	{
		
		display();
	}
		synchronized	void display()
	{
		System.out.println("display even number");
		for(int i=0;i<=20;i++)
		{
			if(i%2==0)
			{
				System.out.println(Thread.currentThread().getName()+i);
			}
		}
	}
}
class Madhu implements Runnable
{
	public void run()
	{
		display();
	}
	void display()
	{
		System.out.println("madhu");
	}
}

public class Example1 {

	public static void main(String[] args) {
		//Sample obj=new Sample();
	//	Thread t1=new Thread(obj);
	 //   t1.setName("megha");
	//    t1.start();
        
	    
	  //  Thread t2=new Thread(obj);
	  //  t2.setName("manasa");
	  //  t2.start();
	    Madhu obj2=new Madhu();
	    Thread j=new Thread(obj2);
	    j.start();
	    
	}

}
