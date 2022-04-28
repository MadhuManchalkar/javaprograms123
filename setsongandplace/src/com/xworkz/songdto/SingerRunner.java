package com.xworkz.songdto;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SingerRunner {

	public static void main(String[] args) {
		SongDTO songdto=new SongDTO(121,"diya","Ananya Bhat","4 minitues");
		SongDTO songdto1=new SongDTO(114,"Lovemockatail","Ananya Bhat","5 minitues");
		SongDTO songdto2=new SongDTO(117,"Lovemockatail2","shamita Malnad","2 minitues");
		SongDTO songdto3=new SongDTO(109,"Ashique","shamita Malnad","1 minitues");
		SongDTO songdto4=new SongDTO(93,"Bahubali","Archana Udup","3minitues");
		SongDTO songdto5=new SongDTO(82,"gogli","Archana Udup","5 minitues");
		SongDTO songdto6=new SongDTO(81,"KGF","shreya","2 minitues");
		SongDTO songdto7=new SongDTO(91,"KG2","shaan","2 minitues");
		SongDTO songdto8=new SongDTO(92,"KOTIGOBBA","shreya","6 minitues");
		SongDTO songdto9=new SongDTO(93,"KOTIGOBBA2","sanjeet hegde","1 minitues");
		SongDTO songdto10=new SongDTO(94,"kanasugar","sanjita hegde","4 minitues");
		SongDTO songdto11=new SongDTO(95,"yajaman","vijaya prakash","4 minitues");
		SongDTO songdto12=new SongDTO(96,"DDLJ","sonu nigam","5 minitues");
		SongDTO songdto13=new SongDTO(97,"Ulidavarukandante","vija prakash","3 minitues");
		SongDTO songdto14=new SongDTO(91,"vilan","vp","3 minitues");
		SongDTO songdto15=new SongDTO(112,"milan","arjun janya","3 minitues");
		SongDTO songdto16=new SongDTO(116,"appu","rajesh Krishnan","2 minitues");
		SongDTO songdto17=new SongDTO(117,"goli","neha kakkar","2 minitues");
		SongDTO songdto18=new SongDTO(118,"milan","shreya goshal","2 minitues");
		SongDTO songdto19=new SongDTO(119,"milan","shreya goshal","1 minitues");
  
		
		Set<SongDTO>  SongDTOs=new LinkedHashSet<SongDTO>();
		SongDTOs.add(songdto);
		SongDTOs.add(songdto1);
		SongDTOs.add(songdto2);
		SongDTOs.add(songdto3);
		SongDTOs.add(songdto4);
		SongDTOs.add(songdto5);
		SongDTOs.add(songdto6);
		SongDTOs.add(songdto7);
		SongDTOs.add(songdto8);
		SongDTOs.add(songdto9);
		SongDTOs.add(songdto10);
		SongDTOs.add(songdto11);
		SongDTOs.add(songdto12);
		SongDTOs.add(songdto13);
		SongDTOs.add(songdto14);
		SongDTOs.add(songdto15);
		SongDTOs.add(songdto16);
		SongDTOs.add(songdto17);
		SongDTOs.add(songdto18);
		
		System.out.println(SongDTOs);
		System.out.println(SongDTOs.size());
	}

}
