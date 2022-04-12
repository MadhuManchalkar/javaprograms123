package inheritance;
class User4
{
	void show()
	{
		System.out.println("madhu");
	}
}
class User5 extends User4
{
	void disply()
	{
		System.out.println("megha");
	}
}

public class Exaple2 {

	public static void main(String[] args) {
		User5 obj=new User5();
		obj.show();
		obj.disply();
				

	}

}
