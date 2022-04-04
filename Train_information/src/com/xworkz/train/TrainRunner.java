package com.xworkz.train;

import com.xworkz.train.dao.TrainDAO;
import com.xworkz.train.dao.TrainImplemation;
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
        
		TrainDAO dao=new TrainImplemation();
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
        
		TrainDTO dto5=new TrainDTO();
		dto5.setName("pooja");
		dto5.setId(106);
		dto5.setNumber("587319");
		dto5.setStartingpoint("mudhol");
		dto5.setDestination("Bangalore");
		dto5.setType(Type.general);
		boolean created5=dao.create(dto5);
		System.out.println(created5);
		
		
		TrainDTO dto6=new TrainDTO();
		dto6.setName("rekha");
		dto6.setId(107);
		dto6.setNumber("587376");
		dto6.setStartingpoint("bellary");
		dto6.setDestination("bagalakot");
		dto6.setType(Type.general);
		boolean created6=dao.create(dto6);
		System.out.println(created6);
		
		TrainDTO dto7=new TrainDTO();
		dto7.setName("geeta");
		dto7.setId(107);
		dto7.setNumber("587319");
		dto7.setStartingpoint("gulabarga");
		dto7.setDestination("bangalore");
		dto7.setType(Type.general);
		boolean created7=dao.create(dto7);
		System.out.println(created7);
		
		TrainDTO dto8=new TrainDTO();
		dto8.setName("neela");
		dto8.setId(105);
		dto8.setNumber("587364");
		dto8.setStartingpoint("bilagi");
		dto8.setDestination("mudhol");
		dto8.setType(Type.general);
		boolean created8=dao.create(dto8);
		System.out.println(created8);
		
		TrainDTO dto9=new TrainDTO();
		dto9.setName("akshata");
		dto9.setId(105);
		dto9.setNumber("587124");
		dto9.setStartingpoint("badami");
		dto9.setDestination("mandya");
		dto9.setType(Type.general);
		boolean created9=dao.create(dto9);
		System.out.println(created9);
		
		
		TrainDTO findbyStratinpoint=dao.findbyStratinpoint("badami");
		System.out.println(findbyStratinpoint);
		
		TrainDTO findbyname=dao.findbyName("mohan");
		System.out.println(findbyname);
		
		boolean m=dao.ispresent(dto);
		System.out.println(m);
		
		TrainDTO findbynumber=dao.findbyNumber("587315");
		System.out.println(findbynumber);
		
		
		 
		TrainDTO dtoupdate=new  TrainDTO();
		dtoupdate.setName("ramu");
		dtoupdate.setDestination("bagalakot");
		dtoupdate.setNumber("587121");
		dtoupdate.setId(101);
		dtoupdate.setType(Type.general);
		
		
		TrainImplemation  implemation=(TrainImplemation) dao;
		implemation.updatebyPersonName("mahendra",dtoupdate);
		
		int m1=dao.totaltrains();
	
		System.out.println(m1);
		
		
        System.out.println("total before delete "+implemation.gettotal());
		implemation.deletbyPersonName("neela");
		System.out.println("total after delete "+implemation.gettotal());
		
	}

}
