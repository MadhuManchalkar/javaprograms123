package com.xworkz.PoliticService;

import java.util.Comparator;
import java.util.List;

import com.xworkz.politicsdao.PolitcsDAO;
import com.xworkz.politicsdto.PoliticalDTO;

public class PoliticsServiceImp  implements PoliticalService{
	private PolitcsDAO dao;

	public PoliticsServiceImp(PolitcsDAO dao) {
		super();
		this.dao = dao;
	}

	@Override
	public boolean validateandsave(PoliticalDTO dto) {
		if(dto!=null)
    	{
    		if(dto.getId()>=0 &&(dto.getName().length()>=3 && dto.getName().length()<50 )&& dto.getNoOfMps()>=0 && (dto.getNationalParty().length()>=3 && dto.getNationalParty().length()<=50) )
    		{
    			dao.save(dto);
    		}
    	}
		return true;
		
	}

	@Override
	public void deleteByName(String name) {
		if(name!=null)
	   	 {
	   		 dao.deleteByName(name);
	   	 }
		
	}

	@Override
	public List<PoliticalDTO> sortById() {
		Comparator<PoliticalDTO>  id=new ComapareById();
	     
   	 return  dao.sort(id);
	}

	@Override
	public List<PoliticalDTO> sortByName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PoliticalDTO> sortByNameAndId() {
		// TODO Auto-generated method stub
		return null;
	}

}
