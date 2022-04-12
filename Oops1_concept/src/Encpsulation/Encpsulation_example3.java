package Encpsulation;
class Demo3
{
	String name;
	private int accountnum;
	public void set_account(int accountnum)
	{
		 this.accountnum=accountnum;
	}
	public int get_account()
	{
		return accountnum;
	}
	
}

public class Encpsulation_example3 {

	public static void main(String[] args) {
		Demo3 obj=new Demo3();
		obj.name="karnatak";
		obj.set_account(1234);
		int obj1=obj.get_account();
		System.out.println(obj1);

	}

}
