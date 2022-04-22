package com.xworkz.collectiondto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

import com.xworkz.collectiondto.constants.Type;

public class WashingmachineRunner {

	public static void main(String[] args) {
WashingmachineDTO washigDTO=new WashingmachineDTO(101,"pink","Samsung",1,Type.FRONTLOAD,2000,501);
WashingmachineDTO washigDTO1=new WashingmachineDTO(102,"BLUE","LG",2,Type.TOPlOAD,5000,502);
WashingmachineDTO washigDTO2=new WashingmachineDTO(103,"black","Hafele",2,Type.FRONTLOAD,3000,503);
WashingmachineDTO washigDTO3=new WashingmachineDTO(104,"gray","whirlpool",3,Type.FRONTLOAD,4000,504);
WashingmachineDTO washigDTO4=new WashingmachineDTO(105,"red","IFB",1,Type.TOPlOAD,25000,505);
WashingmachineDTO washigDTO5=new WashingmachineDTO(106,"grey","Bosch",1,Type.FRONTLOAD,26000,506);
WashingmachineDTO washigDTO6=new WashingmachineDTO(107,"White","Haier",2,Type.FRONTLOAD,27000,507);
WashingmachineDTO washigDTO7=new WashingmachineDTO(108,"Brown","Panasonic",1,Type.TOPlOAD,28000,508);
WashingmachineDTO washigDTO8=new WashingmachineDTO(109,"black","Godrej",9,Type.TOPlOAD,30000,509);
WashingmachineDTO washigDTO9=new WashingmachineDTO(200,"pink","Onid",3,Type.FRONTLOAD,36040,510);
WashingmachineDTO washigDTO10=new WashingmachineDTO(201,"pink","Hafele 8.0",1,Type.TOPlOAD,22100,511);
WashingmachineDTO washigDTO11=new WashingmachineDTO(202,"maroon","Samsung 8.0",4,Type.FRONTLOAD,45000,512);
WashingmachineDTO washigDTO12=new WashingmachineDTO(203,"silver ","AmazonBasic",4,Type.FRONTLOAD,50000,524);
WashingmachineDTO washigDTO13=new WashingmachineDTO(204,"gold","LG 7.0",4,Type.TOPlOAD,1000,518);
WashingmachineDTO washigDTO14=new WashingmachineDTO(205,"black","LG 6.0",6,Type.FRONTLOAD,1500,593);
WashingmachineDTO washigDTO15=new WashingmachineDTO(206,"blue","Samsung 6.0",1,Type.FRONTLOAD,3000,534);
WashingmachineDTO washigDTO16=new WashingmachineDTO(207,"grey","IFB 6.0",1,Type.TOPlOAD,2500,589);
WashingmachineDTO washigDTO17=new WashingmachineDTO(208,"green","Amazon",19,Type.FRONTLOAD,3500,601);
WashingmachineDTO washigDTO18=new WashingmachineDTO(209,"yellow","BOSCH 8.0",3,Type.TOPlOAD,12000,401);
WashingmachineDTO washigDTO19=new WashingmachineDTO(300,"gold","Lloyd",3,Type.FRONTLOAD,14000,501);
WashingmachineDTO washigDTO20=new WashingmachineDTO(301,"pink","Samsung 4.0",5,Type.TOPlOAD,18000,501);


      Collection<WashingmachineDTO>   machineDTOs=new LinkedList<WashingmachineDTO>();
      machineDTOs.add(washigDTO);
      machineDTOs.add(washigDTO1);
      machineDTOs.add(washigDTO2);
      machineDTOs.add(washigDTO3);
      machineDTOs.add(washigDTO4);
      machineDTOs.add(washigDTO5);
      machineDTOs.add(washigDTO6);
      machineDTOs.add(washigDTO7);
      machineDTOs.add(washigDTO8);
      machineDTOs.add(washigDTO9);
      machineDTOs.add(washigDTO10);
      machineDTOs.add(washigDTO11);
      machineDTOs.add(washigDTO12);
      machineDTOs.add(washigDTO13);
      machineDTOs.add(washigDTO14);
      machineDTOs.add(washigDTO15);
      machineDTOs.add(washigDTO16);
      machineDTOs.add(washigDTO17);
      machineDTOs.add(washigDTO18);
      machineDTOs.add(washigDTO19);
      machineDTOs.add(washigDTO20);
  
     
    for(WashingmachineDTO k:machineDTOs)
      {
          if(k.getPrice()>5000)
          {
          	System.out.println(k);
          }
      }
      for(WashingmachineDTO k:machineDTOs)
      {
          if(k.getPrice()<5000)
          {
          	System.out.println(k);
          }
      }
      for(WashingmachineDTO k:machineDTOs)
      {
          if(k.getCapacity()>5)
          {
          	System.out.println(k);
          }
      }
      for(WashingmachineDTO k:machineDTOs)
      {
          if(k.getCapacity()>5 && k.getCapacity()<15)
          {
          	System.out.println(k);
          }
      }
      for(WashingmachineDTO k:machineDTOs)
      {
          if( k.getCapacity()>15)
          {
          	System.out.println(k);
          }
      }
          for(WashingmachineDTO k:machineDTOs)
        {
            System.out.println(k.getBrand().toUpperCase());
        }
          for(WashingmachineDTO k:machineDTOs)
          {
              String m=k.getBrand();
              for(int i=0;i<m.length();i++)
              {
            	  if(('f'==m.charAt(i))||('F'==m.charAt(i)))
            	  {
            		  System.out.println(k.getBrand());
            	  }
              }
          }
          for(WashingmachineDTO k:machineDTOs)
          {
              if(k.getBrand().length()>10)
              {
            	  System.out.println(k);
              }
          }
      
        Iterator<WashingmachineDTO>  iterator=machineDTOs.iterator();
        while(iterator.hasNext())//boolean if true
        {
        	int k=iterator.next().getCapacity();
        	if(k<5)
        	{
        		iterator.remove();
        	}	
        	else
        	{
        		System.out.println(k);
        		
        	}
        		
        	
        }
        
	}

}
