package com.xworkz.athlete.runner;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.athletedto.AthleteDTO;
import com.xworkz.dao.AthleteDAO;
import com.xworkz.dao.AthleteDAOImp;

public class AthleteRunner {

	public static void main(String[] args) {
		AthleteDTO dto=new AthleteDTO(0,"Rahul Dravid","cricket",10,"india",10,"ipl",23,5,"NNN",5,"yes",1234456l);
		AthleteDTO dto1=new AthleteDTO(0,"Sachin Tendulkar","cricket",10,"india",10,"ipl",23,5,"kkk",5,"yes",1234456l);
        
		List<AthleteDTO> list=new ArrayList<>();
       list.add(dto);
       list.add(dto1);
		AthleteDAO dao=new AthleteDAOImp();
		//dao.save(dto);
    //    dao.saveList(list);
      //  dao.saveList(list);
        
        AthleteDTO findbyid= dao.findById(2);
        System.out.println(findbyid);
        
        
        AthleteDTO findBynameAndId1= dao.findByNameAndId("kohli", 1);
        System.out.println(findBynameAndId1);
        
        AthleteDTO findBynameAndSports= dao.findByNameAndSports("kohli", "cricket");
        System.out.println(findBynameAndSports);
        
        
        AthleteDTO findBynameAndSportsandCountry= dao.findByNameAndContryAndSports("kohli", "cricket","india");
        System.out.println(findBynameAndSportsandCountry);
        
        
        String findName=dao.findNameById("kohli", 3);
        System.out.println(findName);
        
         int findId= dao.findid(1);
         System.out.println(findId);
        
        
        
}
}
