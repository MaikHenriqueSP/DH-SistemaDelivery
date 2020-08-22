package abstractModel;

public abstract class Massa extends Lanche {
	private String molho;
	
	public Massa(float preco) {
		super(preco, 30);		
	}

	public void setMolho(String molho) {
		this.molho = molho;
	}

	@Override
	public String toString() {
		return " - Molho: " + molho +  
				super.toString() ;
	}	
}
