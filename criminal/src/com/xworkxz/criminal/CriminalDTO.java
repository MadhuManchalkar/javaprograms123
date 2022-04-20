package com.xworkxz.criminal;

public class CriminalDTO {
       private int id;
       private String name;
       private  int imprisonment;
       private String jailname;
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
	public int getImprisonment() {
		return imprisonment;
	}
	public void setImprisonment(int imprisonment) {
		this.imprisonment = imprisonment;
	}
	public String getJailname() {
		return jailname;
	}
	public void setJailname(String jailname) {
		this.jailname = jailname;
	}
	@Override
	public String toString() {
		return "CriminalDTO [id=" + id + ", name=" + name + ", imprisonment=" + imprisonment + ", jailname=" + jailname
				+ "]";
	}
       
}
