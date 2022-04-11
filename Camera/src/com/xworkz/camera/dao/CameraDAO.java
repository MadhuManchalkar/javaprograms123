package com.xworkz.camera.dao;
import  com.xworkz.camera.dto.*;

public abstract class CameraDAO {
	private CameraDTO[] cameradtos=new CameraDTO[4];
	public CameraDTO[] getCameradtos() {
		return cameradtos;
	}
	
	private int index=0;
	
	public boolean create(CameraDTO dto)
    {
		if(index>=1)
		  {
			 for(int i=0;i<index;i++)
		      {
			      if(cameradtos[i] !=null)
				  {
					 CameraDTO temp1=dto;
			         if(cameradtos[i].getId()==temp1.getId())
				        {
					       System.err.println("found the id from ");
					       return true;
					     }
			        }
		         }
		  }
		System.out.println("invoked".concat(dto.toString()));
		
			if(index<cameradtos.length  )
			{
				cameradtos[index]=dto;
				index++;
				return true;
			}
			else
			{
				System.err.println("its exceeding the size");
			}
			
	
		return false;
	}

	
	abstract void save(CameraDTO DTO); 
	abstract  CameraDTO findbyId(int id);
	abstract  CameraDTO findbyMaxcost();
	abstract  CameraDTO findbyMinCost();


	public int getIndex() {
		return index;
	}


	public void setIndex(int index) {
		this.index = index;
	}


	public void setCameradtos(CameraDTO[] cameradtos) {
		this.cameradtos = cameradtos;
	}
}
