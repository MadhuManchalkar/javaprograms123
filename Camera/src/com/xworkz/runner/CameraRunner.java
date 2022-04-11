package com.xworkz.runner;

import com.xworkz.camera.dao.CameraDAO;
import com.xworkz.camera.dao.ImplemenationCamera;
import com.xworkz.camera.dto.CameraDTO;

public class CameraRunner {

	public static void main(String[] args) {
		CameraDTO dto=new CameraDTO();
		dto.setBrand("canon");
		dto.setCost(7000);
		dto.setId(101);
		dto.setPixel(12.00);
		dto.setType("compact");
		
		CameraDAO dao=new ImplemenationCamera();
		
		boolean created=dao.create(dto);
		System.out.println(created);
		 
		
		CameraDTO dto1=new CameraDTO();
		dto1.setBrand("canon");
		dto1.setCost(15000);
		dto1.setId(102);
		dto1.setPixel(12.00);
		dto1.setType("compact");
		boolean created1=dao.create(dto1);
		System.out.println(created1);
		
		CameraDTO dto2=new CameraDTO();
		dto2.setBrand("canon");
		dto2.setCost(600000);
		dto2.setId(103);
		dto2.setPixel(12.00);
		dto2.setType("compact");
		boolean created2=dao.create(dto2);
		System.out.println(created2);
		
		
		CameraDTO dto3=new CameraDTO();
		dto3.setBrand("canon");
		dto3.setCost(50000);
		dto3.setId(107);
		dto3.setPixel(12.00);
		dto3.setType("compact");
		
		boolean created3=dao.create(dto3);
		System.out.println(created3);
		
	     //dao.diplay();
	   
		ImplemenationCamera impementationdao=(ImplemenationCamera)dao;
		CameraDTO findbyid1=impementationdao.findbyId(102);
		System.out.println(findbyid1);
	CameraDTO finmax=impementationdao.findbyMaxcost();
		System.out.println(finmax);
		
		
		
		//CameraDTO finmin=impementationdao.findbyMinCost();
		//System.out.println(finmin);
		
		
	}

}
