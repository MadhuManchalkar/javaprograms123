package com.xworkz.PoliticService;

import java.util.Comparator;

import com.xworkz.politicsdto.PoliticalDTO;

public class CompareByNameAndId implements Comparator<PoliticalDTO>{

	@Override
	public int compare(PoliticalDTO o1, PoliticalDTO o2) {
		
		Integer id1=o1.getId();
		Integer id2=o2.getId();
		id1.compareTo(id2);
		return o1.getName().compareTo(o2.getName()) ;
	}

}
