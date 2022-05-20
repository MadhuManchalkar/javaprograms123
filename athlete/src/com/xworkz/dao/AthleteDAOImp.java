package com.xworkz.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.athletedto.AthleteDTO;
import com.xworkz.connection.util.DBUtil;

public class AthleteDAOImp  implements AthleteDAO{
   String  Query="insert into   athlete_details123 values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
	@Override
	public boolean save(AthleteDTO dto) {
		try(Connection con=DBUtil.getConnection();
				PreparedStatement prestm=con.prepareStatement(Query);)
		{
			
	       prestm.setInt(1, dto.getId());
			prestm.setString(2, dto.getName());
			prestm.setString(3,dto.getSports());
			prestm.setInt(4,dto.getNoOfGames());
			prestm.setString(5, dto.getCountry());
			prestm.setInt(6, dto.getLevel());
			prestm.setString(7, dto.getOlympics());
			prestm.setInt(8, dto.getAge());
			prestm.setInt(9, dto.getRetired());
			prestm.setString(10, dto.getCoachName());
			prestm.setInt(11, dto.getTotalMedals());
			prestm.setString(12, dto.getFit());
			prestm.setLong(13, dto.getSalary());
	 
			
			int noOfRowsAffected=prestm.executeUpdate();
			System.out.println(noOfRowsAffected);
			return noOfRowsAffected>0?true:false;
			
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean saveList(List<AthleteDTO> dto) {
		Iterator<AthleteDTO> list=dto.iterator();
		String  Query="insert  into  athlete_details123 values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		try(Connection con11=DBUtil.getConnection();PreparedStatement prestm1=con11.prepareStatement(Query);)
		{
			
			
			while(list.hasNext())
			{
				AthleteDTO dto1= list.next();
				    prestm1.setInt(1, dto1.getId());
					prestm1.setString(2, dto1.getName());
					prestm1.setString(3,dto1.getSports());
					prestm1.setInt(4,dto1.getNoOfGames());
					prestm1.setString(5, dto1.getCountry());
					prestm1.setInt(6, dto1.getLevel());
					prestm1.setString(7, dto1.getOlympics());
					prestm1.setInt(8, dto1.getAge());
					prestm1.setInt(9, dto1.getRetired());
					prestm1.setString(10, dto1.getCoachName());
					prestm1.setInt(11, dto1.getTotalMedals());
					prestm1.setString(12, dto1.getFit());
					prestm1.setLong(13, dto1.getSalary());
					int  rowsAffected=prestm1.executeUpdate();
					System.out.println(rowsAffected);
					return rowsAffected>0?true:false;
				//save(dto1);
					
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	
		return false;
	}
	public   AthleteDTO  findById(int id)
	   {
		String  Query="select * from  athlete_details123 where  id=?";
		
		
			try(Connection con=DBUtil.getConnection();
					PreparedStatement prestm=con.prepareStatement(Query);)
			{
				prestm.setInt(1, id);
			ResultSet resultSet=prestm.executeQuery();
					while(resultSet.next())
			{
						
			    int id1=resultSet.getInt(1);
			    String name= resultSet.getString(2);
		        String sports= resultSet.getString(3);
				int  noOfGames= resultSet.getInt(4);
		        String 	country= resultSet.getString(5);
			    int  level= resultSet.getInt(6);
				String 	olympics= resultSet.getString(7);
				int age=resultSet.getInt(8);
				int retired=resultSet.getInt(9);
				String 	coachName= resultSet.getString(10);
				int 	totalMedals= resultSet.getInt(11);
				String 	fit= resultSet.getString(12);
			   Long salary= resultSet.getLong(13);
			   AthleteDTO dtos=new AthleteDTO(id1,name,sports,noOfGames,country,level,olympics,age,retired,coachName,totalMedals,fit,salary);
		 return dtos;
				
				
			}
			
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
				
		   return null;
	   }
	   
	public    AthleteDTO  findByNameAndId(String name,int id)
	   {
		String  Query="select * from  athlete_details123 where name=? AND id=?";
		
		
		try(Connection con=DBUtil.getConnection();
				PreparedStatement prestm=con.prepareStatement(Query);)
		{
			prestm.setString(1, name);
			prestm.setInt(2, id);
			//prestm.setString(2, name);
		ResultSet resultSet=prestm.executeQuery();
				while(resultSet.next())
		{
					
		    int id1=resultSet.getInt(1);
		    String name1= resultSet.getString(2);
	        String sports= resultSet.getString(3);
			int  noOfGames= resultSet.getInt(4);
	        String 	country= resultSet.getString(5);
		    int  level= resultSet.getInt(6);
			String 	olympics= resultSet.getString(7);
			int age=resultSet.getInt(8);
			int retired=resultSet.getInt(9);
			String 	coachName= resultSet.getString(10);
			int 	totalMedals= resultSet.getInt(11);
			String 	fit= resultSet.getString(12);
		   Long salary= resultSet.getLong(13);
		  System.out.println("find by name and id");
		   AthleteDTO dtos=new AthleteDTO(id1,name1,sports,noOfGames,country,level,olympics,age,retired,coachName,totalMedals,fit,salary);
	 return dtos;
			
			
		}
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		   return null;
	   }
	public AthleteDTO  findByNameAndSports(String name,String sports)
	   
	   {
             String  Query="select * from  athlete_details123 where name=? AND sports=?";
		
		
		try(Connection con=DBUtil.getConnection();
				PreparedStatement prestm=con.prepareStatement(Query);)
		{
			prestm.setString(1, name);
			prestm.setString(2, sports);
		ResultSet resultSet=prestm.executeQuery();
				while(resultSet.next())
		{
					
		    int id1=resultSet.getInt(1);
		    String name1= resultSet.getString(2);
	        String sports1= resultSet.getString(3);
			int  noOfGames= resultSet.getInt(4);
	        String 	country= resultSet.getString(5);
		    int  level= resultSet.getInt(6);
			String 	olympics= resultSet.getString(7);
			int age=resultSet.getInt(8);
			int retired=resultSet.getInt(9);
			String 	coachName= resultSet.getString(10);
			int 	totalMedals= resultSet.getInt(11);
			String 	fit= resultSet.getString(12);
		   Long salary= resultSet.getLong(13);
		   AthleteDTO dtos=new AthleteDTO(id1,name1,sports1,noOfGames,country,level,olympics,age,retired,coachName,totalMedals,fit,salary);
	 return dtos;
			
			
		}
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		   return null;
	   }
	 public  AthleteDTO  findByNameAndContryAndSports(String name,String sports,String country)
	   {
		 String  Query="select * from  athlete_details123 where name=? AND sports=? AND country=?";
			
			
			try(Connection con=DBUtil.getConnection();
					PreparedStatement prestm=con.prepareStatement(Query);)
			{
				prestm.setString(1, name);
				prestm.setString(2, sports);
				prestm.setString(3, country);
			ResultSet resultSet=prestm.executeQuery();
					while(resultSet.next())
			{
						
			    int id1=resultSet.getInt(1);
			    String name1= resultSet.getString(2);
		        String sports1= resultSet.getString(3);
				int  noOfGames= resultSet.getInt(4);
		        String 	country1= resultSet.getString(5);
			    int  level= resultSet.getInt(6);
				String 	olympics= resultSet.getString(7);
				int age=resultSet.getInt(8);
				int retired=resultSet.getInt(9);
				String 	coachName= resultSet.getString(10);
				int 	totalMedals= resultSet.getInt(11);
				String 	fit= resultSet.getString(12);
			   Long salary= resultSet.getLong(13);
			   AthleteDTO dtos=new AthleteDTO(id1,name1,sports1,noOfGames,country1,level,olympics,age,retired,coachName,totalMedals,fit,salary);
		 return dtos;
				
				
			}
			
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		   return null;
	   }
	 public String findNameById(String name,int id)
	   {
		 String  Query="select * from  athlete_details123 where name=? AND id=?";
			
			
			try(Connection con=DBUtil.getConnection();
					PreparedStatement prestm=con.prepareStatement(Query);)
			{
				prestm.setString(1, name);
				prestm.setInt(2, id);
				
			ResultSet resultSet=prestm.executeQuery();
					while(resultSet.next())
			{
						
			    //int id1=resultSet.getInt(1);
			    String name1= resultSet.getString(2);
		        return name1;
				
				
			}
			
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		   return null;
	   }
	  public int findid(int id)
	   {
		  String  Query="select * from  athlete_details123 where  id=?";
			
			
			try(Connection con=DBUtil.getConnection();
					PreparedStatement prestm=con.prepareStatement(Query);)
			{
				prestm.setInt(1, id);
			ResultSet resultSet=prestm.executeQuery();
					while(resultSet.next())
			{
						
			    int id1=resultSet.getInt(1);
			    return id1;
				
			}
			
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
				
		   return 0;
	   }

}
