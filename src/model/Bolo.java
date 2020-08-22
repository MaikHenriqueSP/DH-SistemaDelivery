package model;

import abstractModel.Lanche;

public class Bolo extends Lanche {
	private String massa;
	private String recheio;
	private String cobertura;
	
	public Bolo() {
		super(18.20f, 10);
	}

	public void setMassa(String massa) {
		this.massa = massa;
	}

	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}

	public void setCobertura(String cobertura) {
		this.cobertura = cobertura;
	}

	@Override
	public String toString() {
		return "Bolo:" 
			   + "\n - Massa:" + massa 
			   + "\n - Recheio:" + recheio
			   + "\n - Cobertura:" + cobertura 
			   + super.toString();			
	}	
}
