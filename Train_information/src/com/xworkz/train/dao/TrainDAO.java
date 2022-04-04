package com.xworkz.train.dao;

import com.xworkz.train.dto.TrainDTO;

public abstract class TrainDAO {

	private TrainDTO[] traindtos=new TrainDTO[10];
    private	int trainindex=0;
    public int getTrainindex() {
		return trainindex;
	}

	public void setTrainindex(int trainindex) {
		this.trainindex = trainindex;
	}

	public  boolean create(TrainDTO dto)
    {
    	System.out.println("invoked the method".concat(dto.toString()));
	      
		 if(trainindex<traindtos.length && !this.ispresent(dto))
		{
			this.traindtos[trainindex]=dto;
				 int a=10;
			trainindex++;
			return true;
			
		}
		else
		{
			System.err.println("its exceding the size");
			
		}
	  
	   return false;
    }
     
      public TrainDTO[] getTraindtos() {
		return traindtos;
	}

       public void setTraindtos(TrainDTO[] traindtos) {
		this.traindtos = traindtos;
	}

       public TrainDTO findbyStratinpoint(String startingpoint)
     {
    	 for(int i=0;i<traindtos.length;i++)
    	 {
    		 if(traindtos[i].getStartingpoint().equals(startingpoint))
    		 {
    			 System.out.println("find by startingpoint");
    			 
    			 return  traindtos[i];
    		 }
    	 }
    	 return  null;
     }
     public TrainDTO findbyName1(String name)
     {
    	 for(int i=0;i<traindtos.length;i++)
    	 {
    		 if(traindtos[i].getName().equals(name))
    		 {
    			 System.out.println("find by name");
    			 
    			 return  traindtos[i];
    		 }
    	 }
    	 return  null;
     }
     public TrainDTO findbyName(String name)
     {
    	 for(int m=0;m<=traindtos.length;m++)
    	 {
    		 if(traindtos[m].getName().equals(name))
    		 {
    			 System.out.println("find by name");
    			 
    			 return  traindtos[m];
    		 }
    	 }
    	 return  null;
     }
     public TrainDTO findbyNumber(String number)
     {
    	 for(int m=0;m<=traindtos.length;m++)
    	 {
    		 if(traindtos[m].getNumber().equals(number))
    		 {
    			 System.out.println("find by number");
    			 
    			 return  traindtos[m];
    		 }
    	 }
    	 return  null;
     }
     
     
    public boolean ispresent(TrainDTO dto)
    {
    	for(int index=0;index<traindtos.length;index++)
    	{
    		TrainDTO temptraindto=this.traindtos[index];
    		if(temptraindto!=null)
    		{
    		 if(temptraindto.equals(dto))
    		 {
    			System.err.println("train is already found "+dto);
    			return true;
    		 }
    		}
    	}
    	return false;
    	
    }
    
    public int totaltrains()
    {
    	int k=0;
    	for(int index=0;index<traindtos.length;index++)
    	{
    		if(traindtos[index]!=null)
    		{
    			k++;
    		}
    	}
    	System.out.println("total number of trains");
    	return k;
    }
      public int gettotal()
      {
    	 
    	  int k=0;
    	  for(int i=0;i<traindtos.length;i++)
    	  {
    	
    		    if( traindtos[i]!=null)
    		    {
    		      if(traindtos[i].getName()!=null)
    		       {
    			     	k++;
    			   }
    		  
    		      }
    	}
    	  return k;
    	  
      }
}



