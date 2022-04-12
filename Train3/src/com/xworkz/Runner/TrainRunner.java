package com.xworkz.Runner;

import com.xworkz.dao.TrainDAO;
import com.xworkz.dto.TrainDTO;
import com.xworkz.dto.Type;

public class TrainRunner {

	public static void main(String[] args) {
       
		TrainDTO trainDTO=new TrainDTO();
		
		trainDTO.setId(201);
		trainDTO.setName("Madhu");
		trainDTO.setNumber(57421);
		trainDTO.setStartingPoint("Baghawati");
		trainDTO.setDestination("Bengalore");
		trainDTO.setType(Type.AC);
		
		TrainDAO trainDAO=new TrainDAO();
		boolean created=trainDAO.create(trainDTO);
		System.out.println(created);
		
		TrainDTO trainDTO1=new TrainDTO();
		trainDTO1.setId(202);
		trainDTO1.setName("neela");
		trainDTO1.setNumber(52481);
		trainDTO1.setStartingPoint("sirol");
		trainDTO1.setDestination("Bengalore");
		trainDTO1.setType(Type.AC);
		
		
		boolean created1=trainDAO.create(trainDTO1);
		System.out.println(created1);
		
		TrainDTO trainDTO2=new TrainDTO();
		trainDTO2.setId(202);
		trainDTO2.setName("Afreen");
		trainDTO2.setNumber(58142);
		trainDTO2.setStartingPoint("Badami");
		trainDTO2.setDestination("Mysore");
		trainDTO2.setType(Type.EXPRESS);
		
		
		boolean created2=trainDAO.create(trainDTO2);
		System.out.println(created2);
		
		
		TrainDTO name=trainDAO.findByName("Madhu");
		System.out.println(name);
		
		TrainDTO place=trainDAO.findByStringPoint("Baghawati");
		System.out.println(place);
		
		boolean pre=trainDAO.isPresent(trainDTO);
		System.out.println(pre);
		
		int k=trainDAO.totalTrains();
		System.out.println(k);

	}
       
	}


