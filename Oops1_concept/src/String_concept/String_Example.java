package String_concept;

public class String_Example {

	public static void main(String[] args) {
	String s1="java";
	String s2="JAVA";
	String s3="java";
	System.out.println("s1==s2"+(s1==s2));
	System.out.println("s1==s3"+(s1==s3));
	System.out.println("s2==s3"+(s2==s3));
	
	String s4=new String("java");
	String s5=new String("java");
	String s6=new String("JAVA");
	System.out.println("(s1==s4) :"+(s1==s4));
	System.out.println("(s4==s5) :"+(s4==s5));
	System.out.println("(s1==s6) :"+(s1==s6));
	}

}
