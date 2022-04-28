package com.xworkz.runner;

import java.util.List;

import com.xworkz.PoliticService.PoliticalService;
import com.xworkz.PoliticService.PoliticsServiceImp;
import com.xworkz.politicsdao.PolitcsDAO;
import com.xworkz.politicsdao.PolitcsDAOImp;
import com.xworkz.politicsdto.PoliticalDTO;

public class PoliticalsRunner {

	public static void main(String[] args) {
		PolitcsDAO politicsDAO=new PolitcsDAOImp();
		PoliticalService politicalService=new PoliticsServiceImp(politicsDAO);
		
		PoliticalDTO politaclaPartyDTO1=new PoliticalDTO(101,"Basavarajabommai","Narendramodi","bjps",1);
		PoliticalDTO politaclaPartyDTO2=new PoliticalDTO(102,"Govind Krajol","sonia gandhi","congress",2);
		PoliticalDTO politaclaPartyDTO3=new PoliticalDTO(103,"Kumaraswami","Narendramodi","bjps",4);
		
		politicalService.validateandsave(politaclaPartyDTO1);
		politicalService.validateandsave(politaclaPartyDTO2);
		politicalService.validateandsave(politaclaPartyDTO3);
		
		List<PoliticalDTO> sort=politicalService.sortById();
		System.out.println("sort"+sort);
		
		List<PoliticalDTO> sort1=politicalService.sortById();
		System.out.println("sort"+sort1);
		
		List<PoliticalDTO> sort2=politicalService.sortById();
		System.out.println("sort"+sort2);
		politicalService.deleteByName("Basavarajabommai"); 
	}

}
