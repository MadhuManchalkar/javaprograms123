package interface1;
class Bank
{
	String name;
	private int bank_balance;
	public void set_balance(int bank_balance)
	{
		this.bank_balance=bank_balance;
	}
	int get_bank_balance()
	{
		return bank_balance;
	}
}

public class Encpalulation {

	public static void main(String[] args) {
		Bank obj=new Bank();
		obj.name="Karnatak";
		System.out.println(obj.name);
		obj.set_balance(12345678);
		int obj1=obj.get_bank_balance();
		System.out.println(obj1);
		
		

	}

}
