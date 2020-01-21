package main.gft.main;

import java.util.Scanner;

import com.gft.model.Livraria;
import com.gft.model.LivrariaFactory;

public class Main {

	public static void main(String[] args) {
		
		LivrariaFactory livroFactory = new LivrariaFactory();

		Scanner userInput = new Scanner(System.in); 
		
		Livraria itemEscolhido = null;
		
		System.out.println("Qual item você deseja consultar?\nLivro Java / Livro Sapiens / Revista Superinteressante\n");
		
		if(userInput.hasNextLine()) {
			
			String tipoItem = userInput.nextLine();
			
			itemEscolhido =  livroFactory.criarItem(tipoItem);
	
		}
		
		if(itemEscolhido != null) {
			exibirInfo(itemEscolhido);
		}
		else System.out.println("Opção Inválida");
	}
	
	public static void exibirInfo(Livraria umItem) {
		umItem.comprarItem();
		umItem.alugarItem();
	}

}
