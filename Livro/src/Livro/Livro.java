package Livro;

public abstract class Livro {

	private String nomeDoLivro; 
	private String autor;
	private double preco;
	
	public Livro(String nomeDoLivro, String autor, double preco){
		this.nomeDoLivro=nomeDoLivro; 
		this.autor=autor; 
		this.preco=preco; 
	}
	
	
	public String getNomeDoLivro() {
		return nomeDoLivro;
	}
	
	public void setNomeDoLivro(String nomeDoLivro) {
		this.nomeDoLivro = nomeDoLivro;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	} 
	
}
