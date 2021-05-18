package controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Scanner;

import model.Cao;
import model.Pessoa;

public class Principal {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		Scanner teste= new Scanner(System.in);
//		String nomeVerif;

		ArrayList<Cao> cachorro = new ArrayList<>();
		ArrayList<Pessoa> pessoa = new ArrayList<>();

		Cao c1 = new Cao("Kate", "12/06/2009", "Vira Lata", "Preta", 35.0);
		Cao c2 = new Cao("Bob", "10/09/2010", "Bulldog", "Preta", 22.0);
		Cao c3 = new Cao("Pitty", "02/03/2007", "Vira Lata", "Branca", 38.0);
		Cao c4 = new Cao("Kelly", "08/05/2001", " Labrador", "Amarela", 36.0);
		Cao c5 = new Cao("Peixe", "09/11/2008", "Vira Lata", "Amarela", 20.0);
		Cao c6 = new Cao("Grazi", "12/12/2012", "Pastor", "Amarela", 18.0);

		cachorro.add(c1);
		cachorro.add(c2);
		cachorro.add(c3);
		cachorro.add(c4);
		cachorro.add(c5);
		cachorro.add(c6);

		Pessoa p1 = new Pessoa("Diana", "24/12/2010", "Rua A", "21xxxxxxx", "teste@gmail.com", 'F', c1);
		Pessoa p2 = new Pessoa("Louis", "20/03/2011", "Rua B", "22xxxxxxx", "teste1@gmail.com", 'F', c2);
		Pessoa p3 = new Pessoa("Bruce", "18/06/2007", "Rua c", "24xxxxxxx", "teste2@gmail.com", 'M', c3);
		Pessoa p4 = new Pessoa("Clark", "01/09/2002", "Rua A", "25xxxxxxx", "teste3@gmail.com", 'M', c4);

		pessoa.add(p1);
		pessoa.add(p2);
		pessoa.add(p3);
		pessoa.add(p4);

		for (Cao c : cachorro) {
			System.out.println(c);
		}

		System.out.println();

		for (Pessoa p : pessoa) {

			System.out.println(p);
		}

		for (int i = 0; i < cachorro.size(); i++) {
			System.out.println(cachorro.get(i).nutrido());
		}

		System.out.println("\nDigite a opção desejada para verificar :");
		System.out.println(
				"1- Nome \n2- Maior Tempo de Adotado \n3- Quantos Cachorros vira latas foram adotado \n4- Quantos Cachorros estão desnutridos"
						+ "\n5- Quantos cachorros estão são vira latas \n6- Quantos são da cor amarela");
		int op = ler.nextInt();

		while (op != 0) {
			switch (op) {
			
			case 1:
				
				for (Pessoa p : pessoa) {
					
					
					if (p.caoAdotado.getNome() == "Kelly") {
						
						System.out.println("Cachorro existente");
					} else {
						//System.out.println("Cachorro não encontrado !!");
					}
				}
				break;

			case 2:
				//FALTA TERMINAR DE COLOCAR O NOME DO CACHORRO COM MAIOR TEMPO DE ADOTADO 
				long maior = 0;
				for (Pessoa p: pessoa) {
			

					if (p.diferenca() > maior) {
						maior = p.diferenca();

					}

				}
				System.out.println("O Cachorro com maior tempo de adotado tem :" + maior + " dias");
				break;

			case 3:
				int cont = 0;

				for (Pessoa p : pessoa) {
					
					if (p.caoAdotado.getRaca() == "Vira Lata") {
						cont++;
						
					}
				}
				System.out.println("\n" + cont + " cachorro Vira Lata foi Adotado\n");
				break;

			case 4:
				 cont = 0;
				for (Cao c : cachorro) {
					
					if (c.getPeso() > 0 && c.getPeso() <= 20) {
						cont++;
						
					}
				}
				System.out.println("\nExistem :" + cont + " cachorros desnutridos");
				break;

			case 5:
				 cont = 0;
				for (Cao c : cachorro) {
					
					if (c.getRaca() == "Vira Lata") {
						cont++;
						
					}
					
				}
				System.out.println("\nExistem :" + cont + " cachorros Vira Latas");
				break;

			case 6:
				  cont = 0;
				for (Cao c : cachorro) {
					
					
					if (c.getCor() == "Amarela") {
						cont++;
					}
					
				}
				
				System.out.println("\nExistem :" + cont + " cachorros da cor Amarela");
				
				break;

			}

			System.out.println("\nDigite a opção desejada para verificar :");
			System.out.println(
					"1- Nome \n2- Maior Tempo de Adotado \n3- Quantos Cachorros vira latas foram adotado \n4- Quantos Cachorros estão desnutridos"
							+ "\n5- Quantos cachorros estão são vira latas \n6- Quantos são da cor amarela");
			op = ler.nextInt();


		}

	}
}
