package Exercicio2_3;

public class videogame extends Produto implements Imposto{

	private String marca;
	private String modelo;
	private boolean usado;
	
	public videogame() {}

	public videogame(String nome, double preco, int qtd, String marca, String modelo, boolean usado) {
		super(nome, preco, qtd);
		setNome(nome);
		setPreco(preco);
		setQtd(qtd);
		this.marca = marca;
		this.modelo = modelo;
		this.usado = usado;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isUsado() {
		return usado;
	}

	public void setUsado(boolean isUsado) {
		this.usado = isUsado;
	}
	
	

	@Override
	public String toString() {
		return "Titulo : " + getNome() + ", preço : " + getPreco() +", quantidade : " + getQtd() + "em estoque";
	}

	@Override
	public double calculaImposto() {
		if(this.usado) {
			return getPreco() * 0.25;
		} else {
			return getPreco() * 0.45;
		}
	}
	
	
	
}