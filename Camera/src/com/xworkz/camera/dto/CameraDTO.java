package com.xworkz.camera.dto;

public class CameraDTO {
   private int id;
   private String brand;
   private int cost;
   private double pixel;
   private  String type;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public int getCost() {
	return cost;
}
public void setCost(int cost) {
	this.cost = cost;
}
public double getPixel() {
	return pixel;
}
public void setPixel(double pixel) {
	this.pixel = pixel;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
@Override
public String toString() {
	return "CameraDTO [id=" + id + ", brand=" + brand + ", cost=" + cost + ", pixel=" + pixel + ", type=" + type + "]";
}

}
