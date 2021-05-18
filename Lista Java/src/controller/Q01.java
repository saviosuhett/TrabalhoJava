package controller;

import java.util.*;


public class Q01 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		float med1, med2;
		
		
	System.out.println("Digite as medias do aluno"); //syso + cntrll
	med1 = ler.nextFloat();
	med2 = ler.nextFloat();

		
	if (med1 >= 7) {
		
		System.out.println("Aprovado");
	}
		
		else{
			System.out.println("Reprovado");
		}
	
	if (med2 >= 7) {
		
		System.out.println("Aprovado");
	}
		
		else{
			System.out.println("Reprovado");
		}
	
}
}
