package com.xworkz.cricketteam;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IplTeamAndCaptain {

	public static void main(String[] args) {
		Map<String,String> iplteamAndCaptain=new HashMap<>();
		iplteamAndCaptain.put("RCB", "Virat kohli");
		iplteamAndCaptain.put("MI", "Rohit Shrma");
		iplteamAndCaptain.put("kkr", "Shreyasa lyer");
		iplteamAndCaptain.put("Delhi Cpitals", "Rshabh Pant");
		iplteamAndCaptain.put("Sunrisers Hyderabada", "Kane Williamson");
		iplteamAndCaptain.put("Rajastan Royals", "Sanju Samson");
		iplteamAndCaptain.put("Punjab Kings", "Mayank Agarawal");
		iplteamAndCaptain.put("Gujaraat Titans", "Hardik Pandya");
		iplteamAndCaptain.put("Lucknow super Giants", "KL Rahul");
		iplteamAndCaptain.put("CSK", "Ravindra Jadeja");
		
		System.out.println("reading only keys");
		Set<String>   keys=iplteamAndCaptain.keySet();
		keys.forEach(iplteam->System.out.println(iplteam));
		
		System.out.println("reading only values");
	   Collection<String>  values=	iplteamAndCaptain.values();
	   values.forEach(captainName->System.out.println(captainName));
		
	   System.out.println("reading key and values using entry");
	   Set<Entry<String,String>> KeyandValue=iplteamAndCaptain.entrySet();
	   for(Entry<String,String>  kv:KeyandValue)
	   {
		   System.out.println(kv.getKey()+" "+kv.getValue());
		
	   }
	 //  KeyandValue.forEach(iplTeamANdCaptain->System.out.println(iplTeamANdCaptain));
	   
	   
	   System.out.println("reading key and values using for eacm method");
	  iplteamAndCaptain.forEach((k,v)->System.out.println(k+" "+v));
	   
		
	}

}
