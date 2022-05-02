package com.xworkz.fooddto;

public class FoodDTO {
	private int id;
	private String name;
	private int price;
	private  Quantity quatity;
	private String hotelName;
	public FoodDTO(int id, String name, int price, Quantity quatity, String hotelName) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quatity = quatity;
		this.hotelName = hotelName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Quantity getQuatity() {
		return quatity;
	}
	public void setQuatity(Quantity quatity) {
		this.quatity = quatity;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	@Override
	public String toString() {
		return "FoodDTO [id=" + id + ", name=" + name + ", price=" + price + ", quatity=" + quatity + ", hotelName="
				+ hotelName + "]";
	}
	

}
