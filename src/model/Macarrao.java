package model;

import abstractModel.Massa;

public class Macarrao extends Massa {

	public Macarrao() {
		super(15.99f);		
	}
	
	@Override
	public String toString() {
		return "Macarrão:\n" + super.toString();
	}
}
