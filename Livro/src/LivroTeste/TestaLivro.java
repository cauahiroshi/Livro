package LivroTeste;

import Livro.Distopia;
import Livro.FiccaoCientifica;
import Livro.Livro;
import Livro.Romance;

public class TestaLivro {
	public static void main(String[] args) {

		Livro romance = new Romance("Don Casmurro", "Machado de Assis", 20.00 );
		
		System.out.println("Nome da obra: " + romance.getNomeDoLivro());
		System.out.println("Autor:" + romance.getAutor());
		System.out.println("Pre�o:" + romance.getPreco());
		System.out.println();
		
		Livro ficcao = new FiccaoCientifica("O Guia do Mochileiro das Galaxias", "Douglas Adams", 30.00);

		System.out.println("Nome da obra: " + ficcao.getNomeDoLivro());
		System.out.println("Autor:" + ficcao.getAutor());
		System.out.println("Pre�o:" + ficcao.getPreco());
		System.out.println();
		
		Livro distopia = new Distopia("Fahrenheit 451", "Ray Bradbury", 27.00);
		
		System.out.println("Nome da obra: " + distopia.getNomeDoLivro());
		System.out.println("Autor:" + distopia.getAutor());
		System.out.println("Pre�o:" + distopia.getPreco());
		
	}
}
