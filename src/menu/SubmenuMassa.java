package menu;

import abstractModel.Lanche;
import abstractModel.Massa;
import model.Lasanha;
import model.Macarrao;
import model.Pizza;
import util.Reader;

public class SubmenuMassa implements ISubmenu {
	private Massa massa;
	
	@Override
	public Lanche realizarPedido() {
		System.out.println("Ótima pedida! Temos \n [1] - Pizza\n [2] - Lasanha\n [3] - Macarrao");
		int opcao = Reader.readInt();
		
		while (opcao < 1 || opcao > 3) {
			System.out.println("Opção inválida, tente novamente");
			opcao = Reader.readInt();
		}
		
		switch (opcao) {
			case 1: 
				massa = new Pizza();
				break;
			case 2:
				massa = new Lasanha();
				break;
			case 3: 
				massa = new Macarrao();
				break;		
		}
		
		System.out.println("Agora digite o molho que quer na(o) " + massa.getClass().getSimpleName() + ":");
		String molho = Reader.readString();
		massa.setMolho(molho);
			
		return massa;
	}
}
