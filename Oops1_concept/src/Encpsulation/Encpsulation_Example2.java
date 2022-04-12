package Encpsulation;
class Karnatak 
{
	String bank_name;
	private int accont_number;
	public void set_account_number(int accont_number)
	{
		this.accont_number=accont_number;
	}
	public int get_account_number()
	{
		return accont_number;
	}
	
}

public class Encpsulation_Example2 {

	public static void main(String[] args) {
		Karnatak obj=new Karnatak();
		obj.bank_name="karnaka";
		obj.set_account_number(1234);
		int account_num=obj.get_account_number();
		System.out.println(account_num);
		
	}

}
