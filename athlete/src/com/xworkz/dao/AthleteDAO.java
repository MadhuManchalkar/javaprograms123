package com.xworkz.dao;

import java.util.List;

import com.xworkz.athletedto.AthleteDTO;

public interface AthleteDAO {
   public boolean save(AthleteDTO dto);
   public boolean saveList(List<AthleteDTO> dto);
   default  AthleteDTO  findById(int id)
   {
	   return null;
   }
   default  AthleteDTO  findByNameAndId(String name,int id)
   {
	   return null;
   }
   default  AthleteDTO  findByNameAndSports(String name,String sports)
   
   {
	   return null;
   }
   default  AthleteDTO  findByNameAndContryAndSports(String name,String sports,String country)
   {
	   return null;
   }
   default String findNameById(String name,int id)
   {
	   return null;
   }
   default int findid(int id)
   {
	   return 0;
   }
}
