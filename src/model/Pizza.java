package model;

import abstractModel.Massa;

public class Pizza extends Massa {

	public Pizza() {
		super(30.05f);		
	}
	
	@Override
	public String toString() {
		return "Pizza:\n" + super.toString();
	}
}
