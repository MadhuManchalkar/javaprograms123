package com.xworkz.camera.dao;

import com.xworkz.camera.dto.CameraDTO;

public class ImplemenationCamera  extends CameraDAO{
	CameraDTO[] temparrayfromparent=super.getCameradtos();
	int indexfromparent=super.getIndex();
	public  void save(CameraDTO dto)
	{
		this.temparrayfromparent[this.indexfromparent]=dto;
	}
	 public  CameraDTO findbyId(int id)
	{
		  if(id!=0)
		  {
			  CameraDTO[] temparrayfromparent=super.getCameradtos();
			for(int i=0;i<temparrayfromparent.length;i++)
			{
				if(temparrayfromparent[i].getId()!=id)
				{
					System.out.println("ID matched");
					return  temparrayfromparent[i];
				}
				
			}
		  }
		  
		  return null;
	}
   public 	 CameraDTO findbyMaxcost()
	{
	   
	   for(int i=0;i<super.getCameradtos.length;i++)
		{
		
	
		  if(temparrayfromparent[i]!=null) 
		{
			
	       if(temparrayfromparent[0].getCost()<temparrayfromparent[i+1].getCost() )
		  {
			
			  temparrayfromparent[0]=temparrayfromparent[i+1];
			  System.out.println(  temparrayfromparent[0]);
			  
		  }
			
	
		}
		}
	   System.out.println(temparrayfromparent[0].getCost()+" higest price");
	  
	   
		 return null;
	}
  
	
	public   CameraDTO findbyMinCost()
	{
		
		   for(int i=0;i<temparrayfromparent.length-1;i++)
			{
			   System.out.println(temparrayfromparent[i]+" "+i);
			   if(temparrayfromparent[i].getCost()!=0)
			   {
			  if(temparrayfromparent[0].getCost()>temparrayfromparent[i+1].getCost())
			    {
				
				  temparrayfromparent[0]=temparrayfromparent[i+1];
			
			      }
			   }
			}
		 System.out.println(temparrayfromparent[0].getCost()+" lowest price");
		  
			
		  return null;
	}
	
}
