package controller;

import java.util.Scanner;

import model.Cryptographye;

public class Q20 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);		
		        String nomeOriginal;
		        String nomeAlterado;
		        String criptografada = "";
		        String descriptografada = "";
		        int chave=3;

	        System.out.println("Entre com o nome para criptografar :");
	        nomeOriginal = ler.next();
	        
	        criptografada = Cryptographye.encryp(nomeOriginal, chave);
	        System.out.println(criptografada);

		    System.out.println("Entre com o nome para descriptografar :");
		    nomeAlterado = ler.next();
		        
		    descriptografada = Cryptographye.decrypt(nomeAlterado);
		    System.out.println(descriptografada);
		        
		        ler.close();
		        
		    }	   
}
