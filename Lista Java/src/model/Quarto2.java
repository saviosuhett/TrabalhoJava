package model;

import java.util.ArrayList;

public class Quarto2 {
	
	private int vent [] = new int[2];
	private int lamp [] = new int [1];
	private int velocity;
	private boolean on;

	
	
	public boolean isOn() {
		return on;
	}


	public void setOn(boolean on) {
		this.on = on;
	}
	
	public int getVelocity() {
		return velocity;
	}


	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}


	public void status() {
		if(on == true) {
			System.out.println("O ventilador está ligado na velocidade :"+ velocity);
			
		}
		else {
			System.out.println("O ventilador está desligado");
		}
	}
	
}
