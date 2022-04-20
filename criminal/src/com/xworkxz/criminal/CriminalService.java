package com.xworkxz.criminal;

class CriminalService {
private  CriminalDAO dao;

   public CriminalService(CriminalDAO dao) {
	super();
	this.dao = dao;
}

public void validateandsave(CriminalDTO dto) throws DTOInvalidException
   {
	   if(dto!=null)
	   {
		  
		 if(dto.getId()>0 && (dto.getName().length()>3 &&dto.getName().length()<50)
			&& dto.getImprisonment()>0 )
             {
			 
			if( dto.getJailname().length()>4 && dto.getJailname().length()<30)
			{
				
				System.out.println("invoking validateandsave");
				
				boolean m=dao.save(dto);
				 
				System.out.println(m);
			}
			 
			 
       }
		 else
		   {
			 
			   throw new DTOInvalidException("condition failed");

		   }
	   }
	  
	  
   }
   
    

}
