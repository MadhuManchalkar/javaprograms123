package com.xworkz.countrynameandpin;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountryNameAndPincode {

	public static void main(String[] args) {
		Map<String,Integer>  nameandpincode=new HashMap<>();
		nameandpincode.put("India", 110001);
		nameandpincode.put("America", 400021);
		nameandpincode.put("Japan", 1638001);
		nameandpincode.put("Pakistan", 382445);
		nameandpincode.put("china", 510000);
		nameandpincode.put("Australia", 2612);
		nameandpincode.put("France", 75001);
		nameandpincode.put("Canad", 874312);
		nameandpincode.put("Germany", 10115);
		nameandpincode.put("Afaghanistan", 1352);
		nameandpincode.put("Indonesia", 86554);
		nameandpincode.put("Philippines", 1071);
		nameandpincode.put("Thailand", 10000);
		nameandpincode.put("Italy", 11800);
		nameandpincode.put("Ukraine", 60629);
		
		System.out.println("reading only keys");
		Set<String>  keys=nameandpincode.keySet();
		keys.stream().sorted().forEach(name->System.out.println(name));
	
		System.out.println("reading only values");
		Collection<Integer> value=nameandpincode.values();
		value.stream().sorted().forEach(pincode->System.out.println(pincode));
		
		System.out.println("read key and values using entry ");
		Set<Entry<String,Integer>>  keyandvalue=nameandpincode.entrySet();
		keyandvalue.forEach(namePincode->System.out.println(namePincode));
		
		System.out.println("read values using for each method");
		nameandpincode.forEach((k,v)->System.out.println(k+" "+v));
		

	}

}
