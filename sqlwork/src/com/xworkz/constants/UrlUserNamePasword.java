package com.xworkz.constants;

public enum UrlUserNamePasword {
	URL("jdbc:mysql://localhost:3306/bakery_items"),USERNAME("root"),PASSWORD("MMMM1234");
	private String value;
	
	UrlUserNamePasword(String value)
	{
		this.value=value;
	}
	public String getValue() {
		return value;
	}
	
}
