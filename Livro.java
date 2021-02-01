package Exercicio2_3;

public class Livro extends Produto implements Imposto{

	private String autor;
	private String tema;
	private int qtdPag;
	
	public Livro() {}

	public Livro(String nome, double preco, int qtd, String autor, String tema, int qtdPag) {
		super(nome, preco, qtd);
		setNome(nome);
		setPreco(preco);
		setQtd(qtdPag);
		this.autor = autor;
		this.tema = tema;
		this.qtdPag = qtdPag;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public int getQtdPag() {
		return qtdPag;
	}

	public void setQtdPag(int qtdPag) {
		this.qtdPag = qtdPag;
	}

	
	
	@Override
	public String toString() {
		return "Titulo : " + getNome() + ", preço : " + getPreco() + ", quantidade : " + getQtd() + "em estoque" ;
	}

	@Override
	public double calculaImposto() {
		if(this.tema.equalsIgnoreCase("educativo")) {
			return 0;
			
		} else {
			return getPreco() * 0.10;
		}
	}
	
	
	
}
