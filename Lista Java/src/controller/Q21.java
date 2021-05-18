package controller;

import java.util.ArrayList;

import model.Quarto2;

public class Q21 {

	public static void main(String[] args) {
		
		//Normal
		Quarto2 v1 = new Quarto2();
		Quarto2 v2 = new Quarto2();
		Quarto2 v3 = new Quarto2();
		
		v1.setOn(true);
		v1.setVelocity(10);
		v1.status();
		
		v2.setOn(false);
		v2.setVelocity(0);
		v2.status();
		
		v3.setOn(true);
		v3.setVelocity(5);
		v3.status();
		
		
		
		
		
	}

}
