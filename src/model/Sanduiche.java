package model;

import abstractModel.Lanche;

public class Sanduiche extends Lanche {
	private String[] ingredientes;
	private int indexIngrediente;
	private final int LIMITE_INGREDIENTES = 10;

	
	public Sanduiche() {
		super(10.80f, 15);
		this.ingredientes = new String[LIMITE_INGREDIENTES];
	}	
	
	public void calcularPrecoBase() {
		float precoSanduiche = this.getPreco() + (indexIngrediente) * 0.50f;
		this.setPreco(precoSanduiche);		
	}

	public void inserirIngrediente(String ingrediente) {
		if (isSanduicheCheio()) {
			System.out.println("Já alcançamos o limite de " + LIMITE_INGREDIENTES + " não é possível adicionar mais ingredientes.");
			return;
		}
		ingredientes[indexIngrediente++] = ingrediente;
	}
	
	public boolean isSanduicheCheio() {
		return indexIngrediente == LIMITE_INGREDIENTES;
	}
	
	public int getQuantidadeIngredientes() {
		return indexIngrediente;
	};
	
	public int getLimiteIngredientes() {
		return LIMITE_INGREDIENTES;
	}
	
	public String listarIngredientes() {
		StringBuilder tempBuilder = new StringBuilder();
		int i = 0;
		for (; i < indexIngrediente - 1; i++) {
			tempBuilder.append(ingredientes[i] + ", ");
		}
		tempBuilder.append(ingredientes[i] + ".");
		return tempBuilder.toString();
	}

	@Override
	public String toString() {
				return "Sanduíche:" 
				+ "\n - Lista ingredientes: " + listarIngredientes() + super.toString();
	}
}
