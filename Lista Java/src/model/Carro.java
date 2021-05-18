package model;

public class Carro {

	private int velo;
	private int frente;
	private int re;
	private int freio;
	private int esquerda, direita;
	
	public int acelerar() {
		return velo = velo + 30;
	}
	
	public int frear() {
		return freio = 0;
	}
	
	public int goAhead() {
		return frente = frente + 1;
	}
	
	public int back() {
		return re = frente -1;
	}
	
	public int right() {
		return direita = direita + 1;
	}
	
	public int left() {
		return esquerda = esquerda + 1;
	}
	
	public int getVelo() {
		return velo;
	}
	
	public void setVelo(int velo) {
		this.velo = velo;
	}
	
	public int getEsquerda(){
		return esquerda;
		
	}
	
	public void setEsquerda(int esquerda) {
		this.esquerda = esquerda;
	}
	
	public int getDireita(){
		return direita;
		
	}
	
	public void setDireita(int direita) {
		this.direita = direita;
	}
	
	
	public int getRe() {
		return re;
	}
	
	public void setRe(int re) {
		this.re = re;
	}
	
	
	
	
}
