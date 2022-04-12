package Program_practice;
class Bank
{
	String bankname;
	private int  accountnumber;
	public void show(int accountnumber)
	{
		this.accountnumber=accountnumber;
	}
	public int  show1()
	{
		return accountnumber;
	}
}
public class Encapsulation1 {

	public static void main(String[] args) {
		Bank obj=new Bank();
		obj.bankname="karnatak";
		System.out.println(	obj.bankname);
		obj.show(100000);
		int d=obj.show1();
		System.out.println(d);
		
	}

}
