package Program_practice;
class Madhu
{
	static void display()
	{
		System.out.println("madhu");
	}
	void dispaly1()
	{
		System.out.println("meght");
	}
	int s123()
	{
	int name=23;
	 return name;
}
}
	class Encpsulation
	{
		private long a;
		void display(long a)
		{
			this.a=a;
		}
		long show()
		{
		
			return a;
		}
	}
	
  abstract 	class  AB
	{
	   abstract void display();
		
	}
  interface ma
  {
	  void display();
  }
  interface ma1
  {
	  void show();
  }
  class  ma3 implements ma,ma1
  {
	  public void display()
	  {
		  
	  }
	  public void show()
	  {
		  
	  }
  }
  
  class Ab1 extends AB
  {
	  void display()
	  {
		  System.out.println("madhu");
	  }
  }
  class Ab2 extends Ab1
  {
	 void disp()
	 {
		 System.out.println("megha");
	 }
  }

public class Array1 {

	public static void main(String[] args) {
		AB obj=new Ab1();
		obj.display();
		
	
		
		
		
	}

}
