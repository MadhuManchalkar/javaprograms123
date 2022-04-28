package com.xworkz.politicsdao;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import com.xworkz.politicsdto.PoliticalDTO;

public class PolitcsDAOImp implements PolitcsDAO {
	 List<PoliticalDTO> list=new LinkedList<PoliticalDTO>();
	@Override
	public boolean save(PoliticalDTO dto) {
		System.out.println("running save method");
		list.add(dto);
	
	    return true;
	}

	@Override
	public void deleteByName(String name) {
		ListIterator<PoliticalDTO> obj=list.listIterator();
		while(obj.hasNext())
		{
	     String s=obj.next().getName();
		    if(s.equals(name))
			{
		    	System.out.println(name+" -----"+s);
				
	            obj.remove();
	            
			}
	}
}
    @Override
	public List<PoliticalDTO> sort(Comparator<PoliticalDTO> comparator) {
		list.sort(comparator);
	    return list;
	}
	 
	}
