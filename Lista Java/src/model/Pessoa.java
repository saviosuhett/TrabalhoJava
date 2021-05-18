package model;

public class Pessoa {
	
	private int idade;
	private int anoNasc;
	private int anoAtual;

	
	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public int getAnoNasc() {
		return anoNasc;
	}


	public void setAnoNasc(int anoNasc) {
		this.anoNasc = anoNasc;
	}


	public int getAnoAtual() {
		return anoAtual;
	}


	public void setAnoAtual(int anoAtual) {
		this.anoAtual = anoAtual;
	}

	public int calcularIdade() {
		this.idade = this.anoAtual - this.anoNasc;
		System.out.println("Idade: " + idade);
		return this.idade;
	}
	
}