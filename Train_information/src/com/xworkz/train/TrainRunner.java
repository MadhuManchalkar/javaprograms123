package com.xworkz.train;

import com.xworkz.train.dao.TrainDAO;
import com.xworkz.train.dto.TrainDTO;
import com.xworkz.train.dto.Type;

public class TrainRunner {

	public static void main(String[] args) {
		TrainDTO dto=new TrainDTO();
		dto.setName("madhu");
		dto.setId(101);
		dto.setNumber("587312");
		dto.setStartingpoint("mudhol");
		dto.setDestination("Bangalore");
		dto.setType(Type.express);
        
		TrainDAO dao=new TrainDAO();
		boolean created=dao.create(dto);
		System.out.println(created);
		
		
		TrainDTO dto1=new TrainDTO();
		dto1.setName("affi");
		dto1.setId(102);
		dto1.setNumber("587313");
		dto1.setStartingpoint("badami");
		dto1.setDestination("Bangalore");
		dto1.setType(Type.general);
		
		boolean created1=dao.create(dto1);
		System.out.println(created1);
		
		TrainDTO dto2=new TrainDTO();
		dto2.setName("megha");
		dto2.setId(103);
		dto2.setNumber("587314");
		dto2.setStartingpoint("gulabarga");
		dto2.setDestination("mudhol");
		dto2.setType(Type.express);
		
		boolean created2=dao.create(dto2);
		System.out.println(created2);
		
		TrainDTO dto3=new TrainDTO();
		dto3.setName("mohan");
		dto3.setId(104);
		dto3.setNumber("587314");
		dto3.setStartingpoint("mudhol");
		dto3.setDestination("bijapur");
		dto3.setType(Type.express);
		boolean created3=dao.create(dto3);
		System.out.println(created3);
          
		
		TrainDTO dto4=new TrainDTO();
		dto4.setName("mahendra");
		dto4.setId(105);
		dto4.setNumber("587315");
		dto4.setStartingpoint("mudhol");
		dto4.setDestination("mandya");
		dto4.setType(Type.general);
		boolean created4=dao.create(dto4);
		System.out.println(created4);
        
		
		
		
		TrainDTO findbyStratinpoint=dao.findbyStratinpoint("badami");
		System.out.println(findbyStratinpoint);
		
		TrainDTO findbyname=dao.findbyName("mohan");
		System.out.println(findbyname);
		
		boolean m=dao.ispresent(dto);
		System.out.println(m);
		
		
		
		
      
      
	}

}
