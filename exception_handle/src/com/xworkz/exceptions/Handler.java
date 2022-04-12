package com.xworkz.exceptions;

public class Handler {
	

	public boolean  add(String name)
	{
		int i=0;
		if(name!=null)
		{
			for(char ch='a';ch<='z';ch++ )
			{
		       if(name.charAt(i)==ch)
		       {
		    	   i++;
		       }
		       else
		       {
		    	   System.out.println("from first if");
		    	   return false;
		       }
		       
			}
		       if(name.length()>3 &&  name.length()<=50 )
				{
					System.out.println("name is valid");
					return true;
				}
		       else
		       {
		    	   System.out.println("name is not in valid");
		       }
		}
		return false;
	}

}
