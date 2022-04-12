package mehods;
class Demo4
{
	 void display(int a,int b)
	 {
		 int c=a+b;
		 System.out.println(c);
	 }
	 void display(int age,String name)
	 {
		 System.out.println(age+" "+name);
	 }
	 void display(String surname,String college_name)
	 {
		 System.out.println(surname+" "+college_name);
		 
	 }

}

public class Method_overloading {

	public static void main(String[] args) {
		Demo4 obj=new Demo4();
		obj.display(10, 20);
		obj.display(23, "madhu");
		obj.display("manchalkar","BGMIT");

	}

}
