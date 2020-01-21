package com.gft.model;

public class LivrariaFactory {
	
	public Livraria criarItem(String novoItem) {
		
		if(novoItem.equalsIgnoreCase("Java"))
			return new LivroJava();
		
		else if(novoItem.equalsIgnoreCase("Sapiens"))
			return new LivroSapiens();
		
		else if(novoItem.equalsIgnoreCase("Superinteressante"))
			return new RevistaSuperinteressante();
		
		else return null;
	} 

}
