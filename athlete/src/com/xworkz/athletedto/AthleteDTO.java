package com.xworkz.athletedto;

public class AthleteDTO {
	private int id;
	private String name;
	private String sports;
	private int noOfGames;
	private String country;
	private int level;
	private String olympics;
	private int age;
	private int retired;
	private String coachName;
	private int totalMedals;
	private String fit;
	private long salary;
	public AthleteDTO(int id, String name, String sports, int noOfGames, String country, int level, String olympics,
			int age, int retired, String coachName, int totalMedals, String fit, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.sports = sports;
		this.noOfGames = noOfGames;
		this.country = country;
		this.level = level;
		this.olympics = olympics;
		this.age = age;
		this.retired = retired;
		this.coachName = coachName;
		this.totalMedals = totalMedals;
		this.fit = fit;
		this.salary = salary;
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
	public String getSports() {
		return sports;
	}
	public void setSports(String sports) {
		this.sports = sports;
	}
	public int getNoOfGames() {
		return noOfGames;
	}
	public void setNoOfGames(int noOfGames) {
		this.noOfGames = noOfGames;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getOlympics() {
		return olympics;
	}
	public void setOlympics(String olympics) {
		this.olympics = olympics;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getRetired() {
		return retired;
	}
	public void setRetired(int retired) {
		this.retired = retired;
	}
	public String getCoachName() {
		return coachName;
	}
	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}
	public int getTotalMedals() {
		return totalMedals;
	}
	public void setTotalMedals(int totalMedals) {
		this.totalMedals = totalMedals;
	}
	public String getFit() {
		return fit;
	}
	public void setFit(String fit) {
		this.fit = fit;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "AthleteDTO [id=" + id + ", name=" + name + ", sports=" + sports + ", noOfGames=" + noOfGames
				+ ", country=" + country + ", level=" + level + ", olympics=" + olympics + ", age=" + age + ", retired="
				+ retired + ", coachName=" + coachName + ", totalMedals=" + totalMedals + ", fit=" + fit + ", salary="
				+ salary + "]";
	}
	
	
	
}
