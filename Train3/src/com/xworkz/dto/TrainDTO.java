package com.xworkz.dto;

import java.util.Objects;

public class TrainDTO {
private int id;
	private int number;
	private Type type;
	private String name;
	private String startingPoint;
	private String destination;
	
	public TrainDTO() {
		System.out.println("Crected"+this.getClass().getSimpleName());
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStartingPoint() {
		return startingPoint;
	}

	public void setStartingPoint(String startingPoint) {
		this.startingPoint = startingPoint;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	@Override
	public String toString() {
		return "TrainDTO [id=" + id + ", number=" + number + ", type=" + type + ", name=" + name + ", startingPoint="
				+ startingPoint + ", destination=" + destination + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, number, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TrainDTO other = (TrainDTO) obj;
		return Objects.equals(name, other.name) && number == other.number && type == other.type;
	}

	

}
