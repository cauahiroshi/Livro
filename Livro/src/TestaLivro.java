

public class TestaLivro {
	public static void main(String[] args) {

		Livro romance = new Romance("Don Casmurro");
		romance.setAutor("Machado de Assis ");
		romance.setPreco(20.00);
		
		System.out.println(romance.getNomeDoLivro());
		System.out.println(romance.getAutor());
		System.out.println(romance.getPreco());
		System.out.println();
		
		Livro ficcao = new FiccaoCientifica("O Guia do Mochileiro das Galaxias");
		ficcao.setAutor("Douglas Adams");
		ficcao.setPreco(30.00);
		
		System.out.println(ficcao.getNomeDoLivro());
		System.out.println(ficcao.getAutor());
		System.out.println(ficcao.getPreco());
		System.out.println();
		
		Livro distopia = new Distopia("Fahrenheit 451");
		distopia.setAutor("Ray Bradbury");
		distopia.setPreco(26.99);
		
		System.out.println(distopia.getNomeDoLivro());
		System.out.println(distopia.getAutor());
		System.out.println(distopia.getPreco());
		
	}
}
