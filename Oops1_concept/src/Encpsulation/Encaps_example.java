package Encpsulation;
class user1
{
	 String name;
	 private int age1;
	 public void  get_age(int age ) 
	 {
		 this.age1=age;
	 }
	 public int set_age()
	 {
		 return age1;
	 }
}
public class Encaps_example {

	public static void main(String[] args) {
		user1 obj=new user1();
		obj.name="madhu";
		System.out.println(obj.name);
		obj.get_age(23);
		int obj1=obj.set_age();
		System.out.println(obj1);
		

	}

}
