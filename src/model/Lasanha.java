package model;

import abstractModel.Massa;

public class Lasanha extends Massa {

	public Lasanha() {
		super(10.50f);
	}

	@Override
	public String toString() {
		return "Lasanha:\n" + super.toString();
	}
}
