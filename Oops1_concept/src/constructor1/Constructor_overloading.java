package constructor1;
class Student
{
	Student(String name)
	{
		this("madhu",23);
		System.out.println(name);
	}
	Student(int age)
	{
		//this("madhu1");
		System.out.println(age);
	}
	Student(String name,int age)
	{
		
		System.out.println(name+" "+age);
	}
}
public class Constructor_overloading {

	public static void main(String[] args) {
		Student obj=new Student("madhu");
		Student obj1=new Student(23);
//		Student obj2=new Student("madhu",23);
		

	}

}
