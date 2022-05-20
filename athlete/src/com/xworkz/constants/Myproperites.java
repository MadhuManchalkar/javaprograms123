package com.xworkz.constants;

public enum Myproperites {
	URL("jdbc:mysql://localhost:3306/athlete"),USERNAME("root"),PASSWORD("MMMM1234");
	private String values;
	
	private Myproperites(String values)
	{
		this.values=values;
	}

	public String getValues() {
		return values;
	}

	
}
