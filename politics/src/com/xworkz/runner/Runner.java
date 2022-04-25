package com.xworkz.runner;

import com.xworkz.politicsdao.PoliticalService;
import com.xworkz.politicsdao.PoliticalsDAO;
import com.xworkz.politicsdao.PoliticalsDAOImplement;
import com.xworkz.politicsdto.PolitaclaPartyDTO;

public class Runner {

	public static void main(String[] args) {
PoliticalsDAO politicalsDAOs=new PoliticalsDAOImplement();
		
		PoliticalService polticalService=new PoliticalService(politicalsDAOs);
		
		PolitaclaPartyDTO politaclaPartyDTO1=new PolitaclaPartyDTO(101,"Basavarajabommai","Narendramodi","bjp",1);
		PolitaclaPartyDTO politaclaPartyDTO2=new PolitaclaPartyDTO(102,"Govind Krajol","sonia gandhi","congress",2);
		PolitaclaPartyDTO politaclaPartyDTO3=new PolitaclaPartyDTO(103,"Kumaraswami","Narendramodi","bjp",4);
		polticalService.validateandsave(politaclaPartyDTO1);
		polticalService.validateandsave(politaclaPartyDTO2);
		polticalService.validateandsave(politaclaPartyDTO3);
		PoliticalsDAOImplement obj=new PoliticalsDAOImplement();
		obj.addingDTOelementsTOCollection(politaclaPartyDTO1);
		obj.addingDTOelementsTOCollection(politaclaPartyDTO2);
		obj.addingDTOelementsTOCollection(politaclaPartyDTO3);
		obj.iterato();
		
		polticalService.deletebyName("Basavarajabommai"); 
		
      
	}


	}

}
