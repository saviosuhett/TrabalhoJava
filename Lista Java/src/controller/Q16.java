package controller;

import java.util.*;

import model.ContaCorrente;

public class Q16 {

	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		int op;
		
		
	 ContaCorrente cc1 = new ContaCorrente(202, "Savio");
	 ContaCorrente cc2 = new ContaCorrente(212, "Caio");
	 
	 System.out.println("Digite a operação desejada: \n0- Encerrar \n1- Sacar \n2- Depositar ");
	 op = ler.nextInt();
	 
	switch(op) {
	
	 case 1:
		 System.out.println("Quanto você deseja sacar ? ");
			cc1.sacar(ler.nextDouble());break;
	 
	 case 2:
		 System.out.println("Quanto você deseja Depositar ? ");
			cc1.depositar(ler.nextDouble());break;
	 }		
	 

}
}
