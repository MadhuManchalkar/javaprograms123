package abstract1;
abstract class Family
{
	  static 
	{
		String name="madhu";
		String college_name="BGMIT";
		int age=23;
		System.out.println(name);
		System.out.println(college_name);
		System.out.println(age);
	}
}
class Family1 extends Family
{
	void dispaly()
	{
		System.out.println("010");
	}

}
public class Static_block_abstact {

	public static void main(String[] args) {
		Family1 obj=new Family1();
		obj.dispaly();
		
	}

}
