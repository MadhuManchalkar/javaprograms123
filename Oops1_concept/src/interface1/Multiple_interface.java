package interface1;
interface Family
{
	void display_name(String name);
}
interface Family1
{
	void dislay_name1(String surname);
}
class Family2 implements Family,Family1
{
	public void display_name(String name)
	{
		System.out.println(name);
	}
	public void dislay_name1(String surname)
	{
		System.out.println(surname);
	}
}
public class Multiple_interface {

	public static void main(String[] args) {
		Family2 obj=new Family2();
		obj.display_name("Laxman");
        obj.dislay_name1("Manchalakar");
		
	}

}
