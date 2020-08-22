package abstractModel;

public abstract class Lanche {
	private float preco;
	private int tempoEntrega;
	private int tempoPreparo;
	
	public Lanche(float preco, int tempoPrepraro) {
		this.preco = preco;
		this.tempoPreparo = tempoPrepraro;
		this.tempoEntrega= 10;
	}
	
	public Lanche(int tempoPrepraro) {		
		this.tempoPreparo = tempoPrepraro;
		this.tempoEntrega= 10;
	}
	
	public void calcularTempoTotalEntrega(int distancia) {
		tempoEntrega = (tempoEntrega * distancia) + tempoPreparo;  
	}
	
	public void calcularPrecoFinal() {
		preco += tempoEntrega * 0.10f;
	}
		
	protected void setPreco(float preco) {
		this.preco = preco;
	}

	public float getPreco() {
		return preco;
	}

	public int getTempoEntrega() {
		return tempoEntrega;
	}

	public int getTempoPreparo() {
		return tempoPreparo;
	}
	
	@Override
	public String toString() {
		return "\n\nPreco: R$" + preco + 
				"\nTempo de entrega: " + tempoEntrega + " minutos";
	}
}
