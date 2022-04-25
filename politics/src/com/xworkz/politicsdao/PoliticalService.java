package com.xworkz.politicsdao;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import com.xworkz.politicsdto.PolitaclaPartyDTO;

public class PoliticalService {
  private PoliticalsDAO dao;

public PoliticalService(PoliticalsDAO dao) {
	super();
	this.dao = dao;
}
    void  validateandsave(PolitaclaPartyDTO dto)
    {
    	if(dto!=null)
    	{
    		if(dto.getId()>=0 &&(dto.getName().length()>3 && dto.getName().length()<50 )&& dto.getNoOfMps()>=0 && (dto.getNationalParty().length()>3 && dto.getNationalParty().length()<50) )
    		{
    			dao.save(dto);
    		}
    	}
    }
     void 
  

}
