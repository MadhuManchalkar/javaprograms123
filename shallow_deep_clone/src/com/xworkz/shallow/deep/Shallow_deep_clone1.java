package com.xworkz.shallow.deep;

class Demo implements Cloneable
{
	int j;
  public Object clone() throws CloneNotSupportedException 
  {
	  return super.clone();
  }
}

public class Shallow_deep_clone1 {

	public static void main(String[] args)throws CloneNotSupportedException {
		//shallow copy
		Demo obj=new Demo();
		  obj.j=20;
		  System.out.println("j from obj"+obj.j);
		  
		  Demo  obj1=obj;
		  obj1.j=30;
		  System.out.println("j from obj1>>"+obj1.j);
	      System.out.println("j from obj>>"+obj.j);
		//deep copy
		  
		  
	      Demo obj3=new Demo();
		  obj3.j=obj1.j;
		  System.out.println(obj1.j);
		  System.out.println(obj3.j);
		  obj3.j=80;
		  System.out.println(obj1.j);
		  System.out.println(obj3.j);
		  //cloning
		  
		  Demo obj4=new Demo();
		  obj4.j=90;
		  Demo obj5=(Demo) obj4.clone();
		  obj5.j=66;
		  System.out.println(obj5.j+" "+obj4.j);
	 
	}

}
