package model;

import abstractModel.Lanche;
import menu.ISubmenu;
import util.Reader;

public class Pedido {
	private ISubmenu submenu;
	private Lanche lanchePedido;
	public Pedido(ISubmenu submenu) {
		this.submenu = submenu;
	}
	
	public void realizarPedido() {		
		lanchePedido = this.submenu.realizarPedido();
		calcularTempoEntregaTotal();
		lanchePedido.calcularPrecoFinal();
		System.out.println("\nProntinho! Seu pedido está completo!\n");
		System.out.println("------------------------------------------------");
		System.out.println("Resumo pedido:\n");
		System.out.println(lanchePedido);
		System.out.println("------------------------------------------------");
		System.out.println("Agradecemos pela preferência!");
	}

	public void calcularTempoEntregaTotal() {
		System.out.println("\nEstamos quase acabando! Agora precisamos saber qual a distância entre nós!");
		System.out.println("Digite a sua distância do restaurante em kilometros:");
		int distancia = Reader.readInt();
		lanchePedido.calcularTempoTotalEntrega(distancia);
	}
}
