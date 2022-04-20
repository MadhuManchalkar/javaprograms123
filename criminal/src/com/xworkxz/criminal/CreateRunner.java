package com.xworkxz.criminal;

public class CreateRunner {

	public static void main(String[] args) {
		CriminalDAO obj=new Criminal_details();
		CriminalService criminalservice=new CriminalService(obj);
		CriminalDTO obj1=new CriminalDTO();
		obj1.setId(101);
		obj1.setImprisonment(1);
		obj1.setJailname("Arthur Road jail");
		obj1.setName("affi");
	    try {
			criminalservice.validateandsave(obj1);
		} catch (DTOInvalidException  e) {
			
			e.printStackTrace();
		}
	    
	    
	    
	    
		
      }

}
