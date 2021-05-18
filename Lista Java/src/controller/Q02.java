package controller;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		float nota1, nota2, media,Pf;
		
		System.out.println("Digite as notas do aluno :");
		
			nota1 = ler.nextFloat();
			nota2 = ler.nextFloat();
			
			media = (nota1+nota2)/2;
		
		if((nota1 <=10 && nota2 <=10 ) && (nota1 >=0 && nota2 >= 0)){
			System.out.println("Notas válidas");
			
			if(media >=6) {
				System.out.println("Aprovado");
			}
			else if(media <=2) {
				System.out.println("Reprovado");
			}
			else {
				System.out.println("Você está de PF !!");
				System.out.println("Entre com o valor da PF");
				Pf = ler.nextFloat();
				if(Pf >= 5) {
					System.out.println("Aprovado");
				}
				else {
					System.out.println("Reprovado");
				}
			}
		}
		else {
			System.out.println("Nota superior a 10, tente novamente");
		}
		
		
		
	
	}

}
