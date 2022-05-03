package com.xworkz.mobilenameandusername;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MoblieNumberUserName {

	public static void main(String[] args) {
		Map<Long,String>   mobileNoUserNames=new HashMap<>();
		mobileNoUserNames.put( 9148302612L,"Madhu");
		mobileNoUserNames.put(9380985251L, "Ramanagouda");
		mobileNoUserNames.put(7795246528L, "laxman");
		mobileNoUserNames.put(8123463679L, "Rekha");
		mobileNoUserNames.put(923419871l, "pooja");
		mobileNoUserNames.put(876542917l, "neela");
		mobileNoUserNames.put(9148302643l, "affi");
		mobileNoUserNames.put(9248302614l, "pavan");
		mobileNoUserNames.put(9347302612l, "anita");
		mobileNoUserNames.put(7896541212l, "ganga");
		mobileNoUserNames.put(8123467812l, "naheeda");
		mobileNoUserNames.put(9380985341l, "ramu");
		mobileNoUserNames.put(94808165l, "neha");
		mobileNoUserNames.put(765431219l, "geeta");
		
		System.out.println("read only key");
		Set<Long>  mobileNo=mobileNoUserNames.keySet();
		mobileNo.forEach(key->System.out.println(key));
		
		System.out.println("read only values");
		Collection<String>   userName=mobileNoUserNames.values();
		userName.forEach(name->System.out.println(name));
	
		System.out.println("read key and values");
		Set<Entry<Long,String>> keyValues=mobileNoUserNames.entrySet();
		keyValues.forEach(mobileNoandUsers->System.out.println(mobileNoandUsers));
		
		System.out.println("read using for each method");
		mobileNoUserNames.forEach((k,v)->System.out.println(k+" "+v));

	}

}
