package com.xworkxz.criminal;

public class Criminal_details implements CriminalDAO {

	@Override
	public boolean save(CriminalDTO dto) {
		 
		
	     System.out.println("running save method");
	     System.out.println(dto);
		 return true;
	}
}
