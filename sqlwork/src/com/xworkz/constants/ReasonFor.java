package com.xworkz.constants;

public enum ReasonFor {
        CRICKET("cricket"),MOVIE("movie");
	String value;

	private ReasonFor(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
}
