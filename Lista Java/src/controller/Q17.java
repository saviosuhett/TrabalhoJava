package controller;
import java.util.Scanner;
import model.Array1;
public class Q17 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		  int [] array = new int[5];
		 int i=0;
		
		 
		 
		 for(i=0; i<=4;i++) {
			 System.out.println("Digite os números: ");
			 array[i] = input.nextInt(); 
		 }
		 
		 System.out.println("-----------------------");
		 Array1.crescente(array);
		 System.out.println("-----------------------");
		 Array1.decrescente(array);
		 System.out.println("-----------------------");
	
		 
		 for(i=0; i<=4; i++) {
				System.out.println("Digite os número: ");
				array[i] = input.nextInt();
			}
		
		 Array1.inverter(array);
		 Array1.numMaior(array);
		 Array1.media(array);
		 input.close();
}	
}