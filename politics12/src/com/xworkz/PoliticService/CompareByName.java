package com.xworkz.PoliticService;

import java.util.Comparator;

import com.xworkz.politicsdto.PoliticalDTO;

public class CompareByName implements Comparator<PoliticalDTO>{

	@Override
	public int compare(PoliticalDTO o1, PoliticalDTO o2) {
		return o1.getName().compareTo(o2.getName());
	}

	

}
