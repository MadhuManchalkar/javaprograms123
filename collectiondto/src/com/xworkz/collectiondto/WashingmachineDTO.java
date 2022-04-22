package com.xworkz.collectiondto;

import com.xworkz.collectiondto.constants.Type;

public class WashingmachineDTO {
	private int id;
	private String brand ;
	private String color;
	private int capacity;
	private Type type;
	private int price;
	private int modelNo;
	public WashingmachineDTO(int id, String color, String brand, int capacity, Type type, int price, int modelNo) {
		super();
		this.id = id;
		this.color = color;
		this.brand = brand;
		this.capacity = capacity;
		this.type = type;
		this.price = price;
		this.modelNo = modelNo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getModelNo() {
		return modelNo;
	}
	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}
	@Override
	public String toString() {
		return "WashingmachineDTO [id=" + id + ", color=" + color + ", brand=" + brand + ", capacity=" + capacity
				+ ", type=" + type + ", price=" + price + ", modelNo=" + modelNo + "]";
	}
	
	
	

}
