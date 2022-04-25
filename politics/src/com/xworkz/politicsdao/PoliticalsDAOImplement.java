package com.xworkz.politicsdao;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import com.xworkz.politicsdto.PolitaclaPartyDTO;

public class PoliticalsDAOImplement implements PoliticalsDAO {
   List<PolitaclaPartyDTO> list=new LinkedList<PolitaclaPartyDTO>();
  private int index=0,i=0;
	@Override
	public boolean save(PolitaclaPartyDTO dto) {
		
		System.out.println("running save method");
		list.add(dto);
	    System.out.println(list.get(index));
	    index++;
	    return true;
}
	
void addingDTOelementsTOCollection(PolitaclaPartyDTO dto)
{
	list.add(dto);
	
	
}
void iterato()
{
	System.out.println("iterator");
	
	ListIterator<PolitaclaPartyDTO>  h=list.listIterator();
	while(h.hasNext())
	{
		System.out.println("iterator"+h.next());
	}
}

	
	@Override
	public void deleteByName(String name) {
	System.out.println("finding name");
	
	for(int i=0;i<list.size();i++)
	{
		if(list.get(i).getName().equals(name))
		{
		System.out.println(list.get(i));
		list.remove(i);
		}
		else
		{
			System.out.println("method not removed");
			System.out.println(list.get(i));
		}
	}
		
  }
	
}
