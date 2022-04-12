package abstract1;
abstract class parleg
{
	static String name="parle g";
	static int number_of_biscits=24;
	 static void display()
	{
		System.out.println(name);
		System.out.println(number_of_biscits);
	}
}
class parleg12 extends parleg
{
	void types_of_biscit_packet_name()
	{
		System.out.println("50-50");
	}
}
public class Static_member {

	public static void main(String[] args) {
		parleg12 obj=new parleg12();
		obj.display();
		obj.types_of_biscit_packet_name();
	}

	
}
