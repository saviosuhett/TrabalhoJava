package controller;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double n1,n2,n3, maior = 0;
		
		System.out.println("Entre com 3 números:");
		n1 =ler.nextDouble();
		n2 =ler.nextDouble();
		n3 =ler.nextDouble();
		
		if(n1 > maior) {
			maior = n1;
		}
		
		 if (n2 > maior) {
			maior = n2;	
		}
		
		if(n3>maior) {
			maior = n3;
		}
		
		System.out.println(maior);
	}
}