package com.xworkz.exceptions;
public class EmailService {
   private String[] emails=new  String[20];
   private int index=0;
   public boolean addemail  (String  emailname) throws InvalidNameException
   {
	   if(emailname!=null)
	   {
		   if((index<emails.length) )
		   {
			   if( emailname.contains("@") && ((emailname.endsWith(".com")||(emailname.endsWith(".org")||
				   (emailname.endsWith(".in"))))))
		   {
				   this.emails[index]=emailname;
			 System.out.println("the given mail is valid"); 
			 index++;
			 
		   }	   
		   else
		   {
			
			   System.out.println("not valid ");
			  throw new InvalidNameException();
		   }
			   
		   } 
		   else
		   {
			   throw new CanNotAddMoreThanTwentyEmail("can not add more than 20 email");
		   }
	   }
	   return false;
	   
   }
   
}
