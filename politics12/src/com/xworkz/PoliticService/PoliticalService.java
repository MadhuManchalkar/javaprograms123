package com.xworkz.PoliticService;

import java.util.List;

import com.xworkz.politicsdto.PoliticalDTO;

public interface PoliticalService {
	boolean validateandsave(PoliticalDTO dto);
    void deleteByName(String name);
    List<PoliticalDTO> sortById();
    List<PoliticalDTO> sortByName();
    List<PoliticalDTO> sortByNameAndId();

}
