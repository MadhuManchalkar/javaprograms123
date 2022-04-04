package com.xworkz.train.dao;

import com.xworkz.train.dto.TrainDTO;

public class TrainImplemation extends TrainDAO{
	
	public void updatebyPersonName(String name,TrainDTO updateDTO)
	{
		System.out.println(super.gettotal());
		if(name!=null &&  updateDTO!=null)
		{
			
			TrainDTO[] tempfromparent=super.getTraindtos();
			
				
			for(int i=0;i<tempfromparent.length;i++)
			{
				
				if(tempfromparent[i].getName().equals(name))
				{
					
					System.out.println("index"+i);
					tempfromparent[i]=updateDTO;
					return;
				}
			}
		}
	}
	
	public void  deletbyPersonName(String name)
	{
		if(name!=null)
		{
			TrainDTO[] tempfromparent=super.getTraindtos();
			for(int i=0;i<tempfromparent.length;i++)
			{
				if(tempfromparent[i].getName().equals(name))
				{
					System.out.println("delet by name");
					//System.out.println("index"+i);
					tempfromparent[i]=null;
					break;
				}
			}
		}
	}

}
