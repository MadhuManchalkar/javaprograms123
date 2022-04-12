package com.xworkz.exceptions;

public class EmailRunner {

	public static void main(String[] args) {
		EmailService obj=new EmailService();
		try {
			obj.addemail("madhumanchalkar@gmail.com");
			obj.addemail("megha@gmail.com");
			obj.addemail("neela@gmail.com");
			obj.addemail("naheeda@gmail.com");
			obj.addemail("rekha@gmail.com");
			obj.addemail("laxman@gmail.com");
			obj.addemail("affi@gmail.com");
			obj.addemail("Ramu@gmail.com");
			obj.addemail("Ramangouda@gmail.com");
			obj.addemail("Barati@gmail.com");
			obj.addemail("laxmi@gmail.com");
			obj.addemail("pooja@gmail.com");
			obj.addemail("minakshi@gmail.com");
			obj.addemail("omkar@gmail.com");
		    obj.addemail("vinay@gmail.com");
			obj.addemail("girija@gmail.com");
		    obj.addemail("soubagya@gmail.com");
			obj.addemail("pallavi@gmail.com");
			obj.addemail("pavan@gmail.com");
			obj.addemail("naveen@gmail.com");
			obj.addemail("nayan@gmail.com");
			
		} catch (InvalidNameException e) {
			
		e.printStackTrace();	
		}
		catch(CanNotAddMoreThanTwentyEmail e)
		{
			e.printStackTrace();
		}
		
	
	}
}
