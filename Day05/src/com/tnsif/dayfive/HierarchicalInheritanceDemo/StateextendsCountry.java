package com.tnsif.dayfive.HierarchicalInheritanceDemo;

public class StateextendsCountry {
	private String stateName;
	private String language;
	//getter and setter 
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	@Override
	public String toString() {
		return "State [stateName=" + stateName + ", language=" + language + ", getCountryname()=" + getCountryname()
				+ ", getCapital()=" + getCapital() + "]";
	}
	
	
	

}
