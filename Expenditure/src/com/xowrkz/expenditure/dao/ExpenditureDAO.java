package com.xowrkz.expenditure.dao;

import com.xworkz.expediture.dto.ExpenditureDTO;


public class ExpenditureDAO {
	private ExpenditureDTO[]  expenditureDTOs=new  ExpenditureDTO[20];//
    
	public boolean create(ExpenditureDTO  dto)
	{
		System.out.println("invoked create  expenditure ".concat(dto.toString()));
	   for(int expenditureIndex=0;expenditureIndex<=expenditureDTOs.length;expenditureIndex++)
	   {
		   if(expenditureIndex<expenditureDTOs.length)
		   {
		     this.expenditureDTOs[expenditureIndex]=dto;//dto1
		   }
		   else
		   {
			   System.err.println("expendiure can");
		   }
	   }
		return false;
		
		
		
	}
	

}
