package controller;

import java.util.Scanner;

public class Karatsuba {

	public static double mult(double a, double b, double n) {
		if (n > 1) {
			double a1 = a / Math.pow(2, n / 2);
			double a0 = a % Math.pow(2, n / 2);
			double b1 = b / Math.pow(2, n / 2);
			double b0 = b % Math.pow(2, n / 2);
			
			double a1b1 = mult (a1, b1, n / 2);
			double a0b0 = mult (a1, b0, n / 2);
			
			double m3 = mult (a1 + a0, b1 + b0, n/2);
			
			return Math.pow(2, n) * a1b1 + Math.pow(2,n / 2 )* (m3 - a1b1 + a0b0) + a0b0;
		}
		
		else {
			return a * b;
		}
		
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a, b, n;
		String aB, bB;

		System.out.println("Digite: \n1 -Inserir Decimal \n2-Inserir Binario");
		int op = sc.nextInt();
		
		
		if (op == 1) {
			System.out.println("Informe o primeiro digito da multiplicação: ");
			a = sc.nextInt();

			System.out.println("Informe o segundo digito da multiplicação: ");
			b = sc.nextInt();

			System.out.println("Informe 1 ou >1 ");
			n = sc.nextInt();

			double resultado = mult(a, b, n);
			System.out.println("Resultado da Multiplicação padrão: " + resultado);
		}

		if (op == 2) {

			System.out.println("Informe o primeiro digito da multiplicação: ");
			aB = sc.next();
			int decimalValue = Integer.parseInt(aB, 2);

			System.out.println("Informe o segundo digito da multiplicação: ");
			b = sc.nextInt();
			int decimalValue2 = Integer.parseInt(aB, 2);

			System.out.println("Informe 1 ou >1 ");
			n = sc.nextInt();

			double resultado = mult(decimalValue, decimalValue2, n);
			
			
			int resultadoInt = (int)resultado;
			
			System.out.println(resultado);
			System.out.println("Resultado da Multiplicação padrão: " + Integer.toBinaryString(resultadoInt));
		}
		
		
		
	}
}
