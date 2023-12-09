package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Fatura;

public class FaturaTeste {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
        
		System.out.print("Numero do Pedido: ");
		int id = sc.nextInt();
		System.out.print("Descricao do Produto: ");
		String descricao = sc.next();
	    System.out.print("Quantitade: ");
	    int quantidade = sc.nextInt();
	    System.out.print("Preco: ");
	    double preco = sc.nextDouble();
	    
	    Fatura fatura = new Fatura(id, descricao, quantidade, preco);
	    
	    System.out.println(fatura);
	    
		sc.close();
	}

}
