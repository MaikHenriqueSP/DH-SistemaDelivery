package menu;


import abstractModel.Lanche;
import model.Sanduiche;
import util.Reader;

public class SubmenuSanduiche implements ISubmenu {
	private Sanduiche sanduiche;

	@Override
	public Lanche realizarPedido() {
		sanduiche = new Sanduiche();
		System.out.println("Ótima pedida, precisamos que você nos diga os ingredientes que gostaria em seu sanduíche.");
		System.out.println("Lembrando que temos um limite de " + sanduiche.getLimiteIngredientes() + " por sanduíche!");
		System.out.println("Digite 0 caso não queira colocar mais ingredientes.");
		String ingrediente;
		while (!sanduiche.isSanduicheCheio()) {
			ingrediente = Reader.readString();
			if (ingrediente.equals("0") && sanduiche.getQuantidadeIngredientes() == 0) {
				System.out.println("Seu sanduíche necessita de ao menos um ingrediente!");
				continue;
			} else if (ingrediente.equals("0")) {
				break;
			}						
			sanduiche.inserirIngrediente(ingrediente);
		}
		
		if (sanduiche.isSanduicheCheio()) {
			System.out.println("Você alcançou o limite de 10 ingredientes!");
		}
		
		System.out.println("Ótima escolha de ingredientes!");

		sanduiche.calcularPrecoBase();
		
		return sanduiche;
	}

}
