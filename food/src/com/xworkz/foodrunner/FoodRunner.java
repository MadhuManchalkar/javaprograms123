package com.xworkz.foodrunner;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.xworkz.fooddto.FoodDTO;
import com.xworkz.fooddto.Quantity;

public class FoodRunner {

	public static void main(String[] args) {
		
		FoodDTO  foodDTO=new FoodDTO(101,"Gobimanchuri",25,Quantity.FIVEHUNDEREDGRAM,"Priyadarshini");
		FoodDTO  foodDTO1=new FoodDTO(102,"FrideRice",49,Quantity.FIVEHUNDEREDGRAM,"Shiv Sangam");
		FoodDTO  foodDTO2=new FoodDTO(103,"Mutton Birayani",250,Quantity.FIVEHUNDEREDGRAM,"Shabari");
		FoodDTO  foodDTO3=new FoodDTO(104,"Chicken Birayani",500,Quantity.FIVEHUNDEREDGRAM,"Gotilla");
		
		List<FoodDTO>   foodDTOs=new ArrayList<FoodDTO>();
		foodDTOs.add(foodDTO);
		foodDTOs.add(foodDTO1);
		foodDTOs.add(foodDTO2);
		foodDTOs.add(foodDTO3);
		
		
		
		//loop all the items and displaygobimanchuri
	//	List<FoodDTO> obj=foodDTOs.stream().collect(Collectors.toList());
		//System.out.println(obj);
		//loop and filter by non veg type.
		foodDTOs.stream().filter(nonveg->((nonveg.getName()=="Chicken Birayani")||(nonveg.getName()=="Mutton Birayani"))).map(dto->dto.getName()).collect(Collectors.toList()).forEach(dtr->System.out.println(dtr));
	/*
		// System.out.println(foodNames);	
	     //Loop and filter where price is greater than greater 50 and display
	     List<FoodDTO> Itemprice=  foodDTOs.stream().filter(price->price.getPrice()>50).collect(Collectors.toList());
	  //   System.out.println("the items greater than 50 are below\n"+Itemprice);
	     List<String>   FoodItemNamesLessThanFifty=  foodDTOs.stream().filter(price->price.getPrice()>50).map(hotelName->hotelName.getHotelName()).sorted().collect(Collectors.toList());
         	//System.out.println(FoodItemNamesLessThanFifty);
         	List<String>  nameSorted=foodDTOs.stream().map(name->name.getName()).sorted().collect(Collectors.toList());
         	//System.out.println(nameSorted);
         	//Loop and get only id's in desc order
         	List<Integer> itemId=foodDTOs.stream().map(id->id.getId()).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	        // System.out.println(itemId);
	         //Loop and get name where hotel name
	         List<String>  HotelNames=foodDTOs.stream().map(HotelName->HotelName.getHotelName()).collect(Collectors.toList());
             //  System.out.println(HotelNames);
               //Loop and sort--try once again
              // List<FoodDTO> loopAndSort=foodDTOs.stream().sorted().collect(Collectors.toList());
              // System.out.println(loopAndSort);
               //list and get only name in uppercase
             List<String> namesinUpperCase= foodDTOs.stream().map(name->name.getName().toUpperCase()).collect(Collectors.toList());
//	System.out.println(namesinUpperCase);
	
	List<String> hotelnamesinUpperCase= foodDTOs.stream().map(Hotelname->Hotelname.getHotelName().toUpperCase()).collect(Collectors.toList());
	System.out.println(hotelnamesinUpperCase);
	}
*/
}
}
