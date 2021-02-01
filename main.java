package Exercicio2_3;
import java.util.ArrayList;
import java.util.List;


public class main {

	public static void main(String[] args) {

		Livro l1 = new Livro("Harry Potter", 40.0, 50, "J. K. Rowling", "fantasia", 50);
		Livro l2 = new Livro("Senhor dos Anéis", 60.0, 30, "J. R. R. Tolkien", "fantasia", 30);
		Livro l3 = new Livro("Java POO", 20.0, 50, "GFT", "educativo", 50);

		videogame ps4 = new videogame("PS4", 1800.0, 100, "Sony", "Slim", false);
		videogame ps4Usado = new videogame("PS4", 1000.0, 7, "Sony", "Slim", true);
		videogame xbox = new videogame("XBOX", 1500.0, 500, "Microsoft", "One", false);

		List<Livro> livros = new ArrayList<>();
		livros.add(l1);
		livros.add(l2);
		livros.add(l3);

		List<videogame> games = new ArrayList<>();
		games.add(ps4);
		games.add(ps4Usado);
		games.add(xbox);

		Loja americanas = new Loja("Americanas", "12345678", livros, games);

		System.out.println("-----------Testando calculo de imposto-------------");
		System.out.println(l2.calculaImposto());
		System.out.println(l3.calculaImposto());
		System.out.println(ps4Usado.calculaImposto());
		System.out.println(ps4.calculaImposto());
		System.out.println("------------Fim do teste do calculo de imposto--------------");
		
		System.out.println();
		
		System.out.println("------------Testando métodos listaLivros e listaVideoGames");
		System.out.println("A loja americanas possui estes livros para a venda : ");
		americanas.listaLivros();
		System.out.println("A loja americanas possui estes video games para a venda : ");
		americanas.listaVideoGames();
		System.out.println("------------Fim dos testes dos métodos listaLivros e listaVideoGames---");
		
		System.out.println();
		
		System.out.println("------------Testando método calculaPatrimonio ------------");
		System.out.println("O patrimonio da loja " + americanas.getNome() + "é igual a R$ " + americanas.calcularPatrimonio());
		System.out.println("------------Fim dos testes calculaPatrimonio -------------");
		

	}

}