package com.xworkz.ceo.company;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CeoAndCompanyName {

	public static void main(String[] args) {
		
		Map<String,String>   ceoAndComapanyName=new  HashMap<>();
		ceoAndComapanyName.put("Julie Sweet", "Accenture");
		ceoAndComapanyName.put("Jason Chen", "Acer");
		ceoAndComapanyName.put("Sudipta Bhattacharya", "Adani Group");
		ceoAndComapanyName.put("Karan Adani", "Adanin ports");
		ceoAndComapanyName.put("Shantanu", "Adobe");
		ceoAndComapanyName.put("Shivakumar Pattabhiraman", "Apollo Hospital");
		ceoAndComapanyName.put("Tim  Cook", "Apple Inc");
		ceoAndComapanyName.put("Giorgio", "Armani");
		ceoAndComapanyName.put("Rupert Stadler", "Audi");
		ceoAndComapanyName.put("Amitabh Chudhry", "Axis Bank");
		ceoAndComapanyName.put("R.S Sodhi", "Amul");
		ceoAndComapanyName.put("Doug Parker", "Airlines Group");
		ceoAndComapanyName.put("Lisa su", "AMD American");
		ceoAndComapanyName.put("Neeraja Akhoury", "Ambuja cements ");
		ceoAndComapanyName.put("Andy Jassy", "Amazon");
		
           System.out.println("read only key");
          Set<String> keys=ceoAndComapanyName.keySet();  
         keys.forEach(Ceo->System.out.println(Ceo));
         
         System.out.println("read only value");
        Collection<String> values=ceoAndComapanyName.values();
        values.forEach(val->System.out.println(val));
        
        System.out.println("read  key and value using entry");
       Set<Entry<String,String>> keyAndValue=ceoAndComapanyName.entrySet();
       keyAndValue.forEach(ceoName->System.out.println(ceoName));
       
       System.out.println("read key and value using foreach");
       ceoAndComapanyName.forEach((k,v)->System.out.println(k+"  "+v));
	}

}
