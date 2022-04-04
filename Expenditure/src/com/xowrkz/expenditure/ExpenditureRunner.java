package com.xowrkz.expenditure;

import com.xowrkz.expenditure.dao.ExpenditureDAO;
import com.xworkz.expediture.dto.ExpenditureDTO;
import com.xworkz.expediture.dto.ExpenditurePeriod;

public class ExpenditureRunner {

	public static void main(String[] args) {
		ExpenditureDTO dto=new  ExpenditureDTO();
		dto.setPersonName("madhu");
		dto.setSpenOn("dress");
		dto.setAmount(500);
		dto.setExpenditurePeriod(ExpenditurePeriod.WEEKLY);
		
		ExpenditureDAO  dao=new  ExpenditureDAO();
		boolean created=dao.create(dto);
		System.out.println("creadted "+created);
		
		ExpenditureDTO dto1=new  ExpenditureDTO();
		dto1.setPersonName("affi");
		dto1.setSpenOn("watch");
		dto1.setAmount(500);
		dto1.setExpenditurePeriod(ExpenditurePeriod.YEARLY);
		dao.create(dto1);
		
		 
		ExpenditureDTO dto2=new  ExpenditureDTO();
		dto2.setPersonName("neela");
		dto2.setSpenOn("bag");
		dto2.setAmount(5000);
		dto2.setExpenditurePeriod(ExpenditurePeriod.MONTHLY);
		dao.create(dto1);
				
		
		
		ExpenditureDTO dto3=new  ExpenditureDTO();
		dto3.setPersonName("raamu");
		dto3.setSpenOn("shirt");
		dto3.setAmount(5000);
		dto3.setExpenditurePeriod(ExpenditurePeriod.WEEKLY);
		dao.create(dto3);
		
		
		ExpenditureDTO dto4=new  ExpenditureDTO();
		dto4.setPersonName("mohan");
		dto4.setSpenOn("shirt");
		dto4.setAmount(600);
		dto4.setExpenditurePeriod(ExpenditurePeriod.MONTHLY);
		dao.create(dto4);
		
		
		ExpenditureDTO dto5=new  ExpenditureDTO();
		dto5.setPersonName("megha");
		dto5.setSpenOn("kajal");
		dto5.setAmount(800);
		dto5.setExpenditurePeriod(ExpenditurePeriod.MONTHLY);
		dao.create(dto5);
		
		ExpenditureDTO dto6=new  ExpenditureDTO();
		dto6.setPersonName("pooja");
		dto6.setSpenOn("lipstic");
		dto6.setAmount(900);
		dto6.setExpenditurePeriod(ExpenditurePeriod.MONTHLY);
		dao.create(dto5);
		
		
		ExpenditureDTO dto7=new  ExpenditureDTO();
		dto7.setPersonName("rekha");
		dto7.setSpenOn("saree");
		dto7.setAmount(1000);
		dto7.setExpenditurePeriod(ExpenditurePeriod.WEEKLY);
		dao.create(dto7);
		
		
		ExpenditureDTO dto8=new  ExpenditureDTO();
		dto8.setPersonName("laxman");
		dto8.setSpenOn("mobile");
		dto8.setAmount(50000);
		dto8.setExpenditurePeriod(ExpenditurePeriod.WEEKLY);
		dao.create(dto8);
		
		
		ExpenditureDTO dto9=new  ExpenditureDTO();
		dto9.setPersonName("barati");
		dto9.setSpenOn("ear rings");
		dto9.setAmount(200);
		dto9.setExpenditurePeriod(ExpenditurePeriod.MONTHLY);
		dao.create(dto9);
		
		
		ExpenditureDTO dto10=new  ExpenditureDTO();
		dto10.setPersonName("Ramangouda");
		dto10.setSpenOn("earphones");
		dto10.setAmount(5000);
		dto10.setExpenditurePeriod(ExpenditurePeriod.YEARLY);
		dao.create(dto10);
		
		
		ExpenditureDTO dto11=new  ExpenditureDTO();
		dto11.setPersonName("prakshila");
		dto11.setSpenOn("frok");
		dto11.setAmount(2000);
		dto11.setExpenditurePeriod(ExpenditurePeriod.DAILY);
		dao.create(dto11);
		
		
		ExpenditureDTO dto12=new  ExpenditureDTO();
		dto12.setPersonName("mahendra");
		dto12.setSpenOn("shrit");
		dto12.setAmount(4000);
		dto12.setExpenditurePeriod(ExpenditurePeriod.WEEKLY);
		dao.create(dto12);
		
		
		ExpenditureDTO dto13=new  ExpenditureDTO();
		dto13.setPersonName("pinku");
		dto13.setSpenOn("bangles");
		dto13.setAmount(400);
		dto13.setExpenditurePeriod(ExpenditurePeriod.WEEKLY);
		dao.create(dto13);
		
		
		ExpenditureDTO dto14=new  ExpenditureDTO();
		dto14.setPersonName("geeta");
		dto14.setSpenOn("lapotop");
		dto14.setAmount(50000);
		dto14.setExpenditurePeriod(ExpenditurePeriod.YEARLY);
		dao.create(dto14);
		
		ExpenditureDTO dto15=new  ExpenditureDTO();
		dto15.setPersonName("shoba");
		dto15.setSpenOn("gold ear rings");
		dto15.setAmount(25000);
		dto15.setExpenditurePeriod(ExpenditurePeriod.WEEKLY);
		dao.create(dto15);
		
		
		ExpenditureDTO dto16=new  ExpenditureDTO();
		dto16.setPersonName("jyoti");
		dto16.setSpenOn("scooty");
		dto16.setAmount(50000);
		dto16.setExpenditurePeriod(ExpenditurePeriod.YEARLY);
		dao.create(dto16);
		
		
		ExpenditureDTO dto17=new  ExpenditureDTO();
		dto17.setPersonName("savita");
		dto17.setSpenOn("car");
		dto17.setAmount(50000);
		dto17.setExpenditurePeriod(ExpenditurePeriod.YEARLY);
		dao.create(dto17);
		
		
		ExpenditureDTO dto18=new  ExpenditureDTO();
		dto18.setPersonName("laxmi");
		dto18.setSpenOn("books");
		dto18.setAmount(500);
		dto18.setExpenditurePeriod(ExpenditurePeriod.WEEKLY);
		dao.create(dto18);
		
		
		ExpenditureDTO dto19=new  ExpenditureDTO();
		dto19.setPersonName("namrata");
		dto19.setSpenOn("saree");
		dto19.setAmount(50000);
		dto19.setExpenditurePeriod(ExpenditurePeriod.WEEKLY);
		dao.create(dto19);
	
		
		
		
		
	}

}
