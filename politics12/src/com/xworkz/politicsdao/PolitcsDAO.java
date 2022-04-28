package com.xworkz.politicsdao;

import java.util.Comparator;
import java.util.List;

import com.xworkz.politicsdto.PoliticalDTO;

public interface PolitcsDAO {
	  boolean save(PoliticalDTO dto);
      void deleteByName(String name);
      List<PoliticalDTO> sort(Comparator<PoliticalDTO> comparator);

}
