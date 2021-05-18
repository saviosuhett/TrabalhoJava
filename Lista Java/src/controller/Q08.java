package controller;

import java.util.*;
public class Q08 {

	public static void main(String[] args) {
		Random gerador = new Random();
		Scanner ler = new Scanner(System.in);
		
		int num,cont=0;
		int aleatorio = gerador.nextInt(100 - 0) + 1;

		System.out.println("Digite um número entre 0 e 100");
		
		do {
			num = ler.nextInt();
			cont++;
			
		if(num >= 0 && num <=100) {
			
			if(num > aleatorio) {
				System.out.println(num +" É maior que o número suposto");
	
			}
			else if( num < aleatorio) {
				System.out.println(num + " É menor que o número suposto");
				
			}
			else {
				System.out.println("Acertou");
				System.out.println("Número de tentativas :" + cont);
				if(cont == 1) {
					System.out.println("Você e excelente”");
				}
				else if (cont <= 10) {
					System.out.println("você e bom");
					
				}
				else if (cont >= 10 && cont <=20){
					System.out.println("Voce nao foi tao bem");
					
				}
				else {
					System.out.println("Você precisa praticar");
				}
			}
		}
		else {
			System.out.println("Entre com um numero entre 0 e 100");
		}
	}while(num != aleatorio );

}
}