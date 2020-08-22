package main;

import menu.Pedido;
import menu.SubmenuBolo;
import menu.SubmenuMassa;
import menu.SubmenuSanduiche;
import util.Reader;

public class Principal {
	public static void main(String[] args) {		
		System.out.println("Bem vindo ao sistema delivery DH");
		System.out.println("Digite o número do tipo de lanche que deseja:");
		System.out.println(" [1] - Sanduíches\n [2] - Massas\n [3] - Bolos");
		
		int opcao = Reader.readInt();
		
		while (opcao < 1 || opcao > 3) {
			System.out.println("Digite uma opção válida!");
			opcao = Reader.readInt();		
		}
		
		Pedido pedido;
		switch (opcao) {
			case 1:
				pedido = new Pedido(new SubmenuSanduiche());
				break;
			case 2:
				pedido = new Pedido(new SubmenuMassa());
				break;
			default:
				pedido = new Pedido(new SubmenuBolo());
				break;
		}
		
		pedido.realizarPedido();		
		Reader.closeScanner();
	}
}
