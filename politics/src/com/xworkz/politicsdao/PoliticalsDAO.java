package com.xworkz.politicsdao;

import java.util.LinkedList;

import com.xworkz.politicsdto.PolitaclaPartyDTO;

public interface PoliticalsDAO {
      boolean save(PolitaclaPartyDTO dto);
       void deleteByName(String name);

}
