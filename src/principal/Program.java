package principal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import entities.Produto;

public class Program {
	
	public static void main(String[] args) {
		
		List<Produto> lista = new ArrayList<Produto>();
		
		lista.add(new Produto(1, "Notebook", 4000.0, 10));
		lista.add(new Produto(2, "Monitor", 200.0, 20));
		lista.add(new Produto(3, "Controle gamer", 400.0, 15));
		
		System.out.println("Quantidade de produtos " + lista.size());
		
		for(Produto produto : lista) {
			
			System.out.println(produto.toString());
			
		}
	}

}
