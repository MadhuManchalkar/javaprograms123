package Encpsulation;
class HDFCBank
{
	String bankname;
	private int account_number;
	public void setaccount(int account_number)
	{
		 this.account_number=account_number;
	}
	public int getaccount_number()
	{
		return account_number;
	}
	
}

public class Encpsulation_example {

	public static void main(String[] args) {
		
		HDFCBank obj=new HDFCBank();
		obj.bankname="HDFC_bank";
		obj.setaccount(1234);
		int accounum=obj.getaccount_number();
		System.out.println(	obj.bankname+" "+accounum);
		

	}

}
