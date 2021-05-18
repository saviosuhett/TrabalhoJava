package controller;

import model.Quarto;

public class Q13 {

	public static void main(String[] args) {
		Quarto q1 = new Quarto();
		q1.ar = 23;
		q1.ventilador = 2;
		q1.canal = 4;
		q1.tv();
		q1.luz();
		q1.update();
		q1.canal();
		
		
		
	}

}
