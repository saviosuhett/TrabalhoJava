package controller;
import java.util.Scanner;
import model.Pessoa;

public class Q11 {

public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Pessoa idade = new Pessoa();
		
		System.out.println("Informe o ano atual: ");
		idade.setAnoAtual(input.nextInt());
		
		System.out.println("Informe o seu ano de nascimento: ");
		idade.setAnoNasc(input.nextInt());
		
		idade.calcularIdade();
		
		input.close();
	}
}
