package Livro;

import java.util.ArrayList;
import java.util.List;

public class ArmazenaLivro {
	public static void main(String[] args) {
		
		
		List<String> testList = new ArrayList <>();
        testList.add("Don Casmurro");
        testList.add("O Guia do Mochileiro das Galaxias");
        testList.add("Fahrenheit 451");
        
  
		
		    if(!testList.contains("ola")){
		        testList.add("ola");
		        System.out.println("Livro adicionado");
		    }else{
		        System.out.println("Este livro ja foi adicionado");
		    }
		   
		
	}
}

