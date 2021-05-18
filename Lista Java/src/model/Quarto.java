package model;

public class Quarto {
	
	public boolean luz;
	public int ventilador;
	public int ar;
	public boolean tv;
	public int canal;
	
	public void update() {
		//temperatura
		//canal
		//luz ligada ou desligada
		//velocidade ventilador
		System.out.println("A temperatura do quarto é :" + ar);
		System.out.println("A luz esta ligada ?" + luz);
		System.out.println("A velocidade do ventilador é :" +ventilador);
		System.out.println("A tv está ligada ?" + tv);
		
		
	}
	
	public void tv() {
		this.tv=false;
	
	}
	public void luz() {
		this.luz=true;
	}
	
	public void canal() {
		
		if (this.tv == true) {
			System.out.println("A tv esta no canal" + canal);
		}
		
	}

}
