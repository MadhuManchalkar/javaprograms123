package com.xworkz.dao;

import com.xworkz.dto.TrainDTO;

public class TrainDAO {
	private TrainDTO[] trainDTOs = new TrainDTO[8];
	public int trainIndex = 0, n=0;

	public boolean create(TrainDTO trainDTO) {
		System.out.println("invoked create Train".concat(trainDTO.toString()));
		if (trainIndex < this.trainDTOs.length  && !isPresent(trainDTO)) 
		{
			
			this.trainDTOs[trainIndex] = trainDTO;
			trainIndex++;
		     return true;
		}
		else {
			System.err.println("train cannot be added,index is full");
		}
		return false;
	}

	public TrainDTO findByName(String name) {
		for (int i = 0; i < trainDTOs.length; i++) {
			if (trainDTOs[i].getName().equals(name)) {
				System.out.println("Name matched");
				return trainDTOs[i];
			}
		}
		return null;
	}

	public TrainDTO findByStringPoint(String startingPoint) {
		for (int i = 0; i < trainDTOs.length; i++) {
			if (trainDTOs[i].getStartingPoint().equals(startingPoint)) {
				System.out.println("StartingPoint matched");
				return trainDTOs[i];
			}
		}
		return null;
	}

	public boolean isPresent(TrainDTO trainDTO) {
		for (int i=0; i<trainDTOs.length; i++) {
			if(trainDTOs[i]!=null)
			{
			TrainDTO tempTrain = this.trainDTOs[i];
			if(tempTrain!=null)
			{
		    if (tempTrain.equals(trainDTO)) {
				System.err.println("Train is already found");
				return true;
			}
			}
			}

		}
		return false;
		
	}
	public int totalTrains()
	{
		for(int i=0;i<trainDTOs.length;i++)//8
		{
			if(trainDTOs[i]!=null)//
			{
				
				n++;
			}
			
		}
		System.out.println("total number of trains");
		return n;
	}
	
	
}
