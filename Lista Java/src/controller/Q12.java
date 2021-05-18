package controller;

import java.util.*;

import model.Retangulo;

public class Q12 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		Retangulo retangulo = new Retangulo();
		Retangulo retangulo2 = new Retangulo();
		Retangulo retangulo3 = new Retangulo();
		
		System.out.println("Digite a base:");
		retangulo.setBase(ler.nextFloat());
		System.out.println("Digite a altura:");
		retangulo.setAltura(ler.nextFloat());
		System.out.println("A Área do retângulo é : " + retangulo.area());
		retangulo.perimetro(retangulo.getBase(), retangulo.getAltura());
		
		
		System.out.println("Digite a base:");
		retangulo2.setBase(ler.nextFloat());
		System.out.println("Digite a altura:");
		retangulo2.setAltura(ler.nextFloat());
		System.out.println("A Área do retângulo é : " + retangulo2.area());
		retangulo2.perimetro(retangulo2.getBase(), retangulo2.getAltura());
		
		
		System.out.println("Digite a base:");
		retangulo3.setBase(ler.nextFloat());
		System.out.println("Digite a altura:");
		retangulo3.setAltura(ler.nextFloat());
		System.out.println("A Área do retângulo é : " + retangulo3.area());
		retangulo3.perimetro(retangulo3.getBase(), retangulo3.getAltura());
		
		
		ler.close();
	}

}
