package com.xworkz.placedto;

import java.util.HashSet;
import java.util.Set;

public class PlaceRunner {

	public static void main(String[] args) {
		PlaceDTO placeDTO=new  PlaceDTO(101,"madhu","Mudhol","Karnatak","India");
		PlaceDTO placeDTO1=new  PlaceDTO(101,"affi","Bagalakot","Karnatak","India");
		PlaceDTO placeDTO2=new  PlaceDTO(101,"Neela","Badami","Karnatak","India");
		PlaceDTO placeDTO3=new  PlaceDTO(101,"RamanGouda","Banagalore","Karnatak","India");
		PlaceDTO placeDTO4=new  PlaceDTO(101,"Raamu","Belagum","Karnatak","India");
		PlaceDTO placeDTO5=new  PlaceDTO(101,"Pooja","Bagavati","Karnatak","India");
		PlaceDTO placeDTO6=new  PlaceDTO(101,"pooja kumbar","Mandya","Karnatak","India");
		PlaceDTO placeDTO7=new  PlaceDTO(101,"Madhumati","Bijapur","Karnatak","India");
		PlaceDTO placeDTO8=new  PlaceDTO(101,"MadhuShrii","Delhi","Karnatak","India");
		PlaceDTO placeDTO9=new  PlaceDTO(101,"Megha","Mysore","Karnatak","India");
	  
		Set<PlaceDTO>   placeDTOs=new HashSet<PlaceDTO>();
		placeDTOs.add(placeDTO);
		placeDTOs.add(placeDTO1);
		placeDTOs.add(placeDTO2);
		placeDTOs.add(placeDTO3);
		placeDTOs.add(placeDTO4);
		placeDTOs.add(placeDTO5);
		placeDTOs.add(placeDTO6);
		placeDTOs.add(placeDTO7);
		placeDTOs.add(placeDTO8);
		placeDTOs.add(placeDTO9);
		
		System.out.println(placeDTOs);
		
		System.out.println(placeDTOs.size());
		
	}

}
