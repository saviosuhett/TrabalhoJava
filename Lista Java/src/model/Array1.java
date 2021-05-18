package model;

public class Array1 {

	
	private static int i;
	private static int j;
	private static int aux;
	private static int maior=0;
	private static int menor=9999;
	private static int soma=0;
	private static int media;
	

	public static void crescente (int[]num){
		for(i = 0; i <= 4; ++i) {
			for(j = i+1; j<4; ++j ) {
				if(num[i] > num[j+1]) {
					aux = num[i];
					num [i] = num[j+1];
					num[j+1] = aux;		
				}
			}		
			System.out.println(num[i]);
		}
	}
	
	public static void decrescente(int []num){

		

		
		for(i = 0; i <= 4; ++i) {
			for(j = i+1; j<4; ++j ) {
				if(num[i] < num[j+1]) {
					aux = num[i];
					num [i] = num[j+1];
					num[j+1] = aux;		
				}
			}		
			System.out.println(num[i]);
		}
	}

	public static void inverter(int []vet) {
		for(i=4;i>=0;i--) {
			System.out.println(vet[i]);
		}
	}
	
	
	public static void numMaior(int []vet) {
		for(i=0; i<=4; i++) {
			if(vet[i] > maior)
				maior = vet[i];
			if(vet[i] < menor)
				menor = vet[i];
		}
		System.out.println("O menor numero eh: " + menor);
		System.out.println("O maior numero eh: " + maior);
	}
	
	public static void media(int[] vet) {
		for(i=0; i<=4; i++) {
			soma = soma + vet[i];
		}

		media = soma/5;
		System.out.println("A media é: " + media);
	}

}