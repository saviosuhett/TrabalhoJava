package controller;

import java.util.*;

import model.Carro;

public class Q14 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Carro car = new Carro();

		
		System.out.println("Digite a opção desejada :\n1- Acelerar "
				+ "\n2 - Frente \n3 - Ré \n4 - Direita"
				+ "\n5 = Esquerda \n6 - Frear");
		
		int op = ler.nextInt();
		
		while(op!= 6) {
		
		switch(op) {
		
		case 1:
			car.acelerar();break;		
		case 2:
			car.goAhead();break;				
		case 3:
			car.back();break;
		case 4:
			car.right();break;
		case 5:
			car.left();break;
		case 6:
			car.frear();break;	
		}
		
		System.out.println("");
		
		System.out.println("Digite a opção desejada :\n1- Acelerar "
				+ "\n2 - Frente \n3 - Ré \n4 - Direita"
				+ "\n5 = Esquerda \n6 - Frear");
		op = ler.nextInt();
		
		}
		
		
		System.out.println("Você acelerou " + car.getVelo() + " km/h");
		System.out.println("Você andou " + car.getRe() + " metros para tras");
		System.out.println("Você andou " + car.getEsquerda() + " m para esquerda");
		System.out.println("Você andou " + car.getDireita() + " m para direita");
		
		
	}

}
