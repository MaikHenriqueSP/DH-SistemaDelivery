package menu;

import abstractModel.Lanche;
import model.Bolo;
import util.Reader;

public class SubmenuBolo implements ISubmenu {

	private Bolo bolo;
	
	@Override
	public Lanche realizarPedido() {
		this.bolo = new Bolo();
		System.out.println("Ótima pedida, precisamos que você nos diga a massa, recheio e cobertura que quer em seu bolo!");
		
		System.out.println("Digite o nome da cobertura:");
		String cobertura = Reader.readString();;
		
		bolo.setCobertura(cobertura);
		
		System.out.println("Digite o tipo de massa:");
		String massa = Reader.readString();
		bolo.setMassa(massa);
		
		System.out.println("Digite o tipo de recheio:");
		String recheio = Reader.readString();;
		bolo.setRecheio(recheio);
		
		return bolo;
	}
}
