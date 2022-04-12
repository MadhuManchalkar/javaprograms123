package collection_assignment;

import java.util.ArrayList;

class User1
{
    static  ArrayList<String> Show()
	{
		ArrayList<String>  obj=new ArrayList<String>();
		obj.add("madhu");
		obj.add("maansa");
		obj.add("raamu");
		return obj;
	}
}

public class Demo1 {

	public static void main(String[] args) {
		ArrayList<String> c=User1.Show();
	//	ArrayList c=User1.Show();
		System.out.println(c);
		
		
	}

}
