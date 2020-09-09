package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;
import entities.Item;
import entities.Pedido;
import entities.Produto;
import entities.enums.Status;

public class aplicacao {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		

		
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com os dados do cliente:");
		System.out.println("Nome:");
		String nome = sc.nextLine();
		System.out.println("E-mail:");
		String email = sc.nextLine();
		System.out.println("Data de aniversario:");
		Date dataNiver = sdf.parse(sc.nextLine());
		
		Cliente cliente = new Cliente(nome,email,dataNiver);
		
		System.out.println("Entre com os dados do pedido:");
		System.out.println("Status: ");
		Status status = Status.valueOf((sc.nextLine()));
		System.out.println("Quantos pedidos? ");
		int n = sc.nextInt();
		
		Pedido pedido = new Pedido(new Date(),status, cliente);
		

		
		for(int i=0; i<n; i++) {
			System.out.println("Entre com dados do item #"+(i+1)+":");
			System.out.println("Nome do produto:");
			String nomeProduto = sc.next();
			System.out.println("Preço do produto: ");
			Double preco = sc.nextDouble();	
			System.out.println("Quantidade:");
			Integer q = sc.nextInt();
			
			Produto produto = new Produto(nomeProduto,preco);
			
			Item item = new Item(q, preco, produto);
			
			pedido.addItem(item);
			
		}

		System.out.println("Sumário do pedido:");
		System.out.println(pedido.toString());
				
		
		
		sc.close();
	}

}
