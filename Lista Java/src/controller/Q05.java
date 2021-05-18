package controller;

import java.util.*;
public class Q05 {

	public static void main(String[] args) {
		Random gerador = new Random();
		Scanner ler = new Scanner(System.in);
		
		int num;
		int aleatorio = gerador.nextInt(100 - 0) + 1;

		System.out.println("Digite um número entre 0 e 100");
		num = ler.nextInt();
		
		if(num >= 0 && num <=100) {
			
			if(num > aleatorio) {
				System.out.println("Maior que o número gerado");
				System.out.println();
			}
			if( num < aleatorio) {
				System.out.println("Menor que o número gerado");
				System.out.println(aleatorio);
			}
			else {
				System.out.println("Acertou");
			}
		}
		
		else {
			System.out.println("Entre com um numero entre 0 e 100");
		}
	}

}
