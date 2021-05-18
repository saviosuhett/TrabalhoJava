package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import model.Data;

public class Cao {

	private String nome;
	private String dtEntrada;
	private String raca;
	private String cor;
	private double peso;


	public Cao(String nome, String dtEntrada, String raca, String cor, double peso) {
		super();
		this.nome = nome;
		this.dtEntrada = dtEntrada;
		this.raca = raca;
		this.cor = cor;
		this.peso = peso;
	}

	public Cao() {
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDtEntrada() {
		return dtEntrada;
	}

	public void setDtEntrada(String dtEntrada) {
		this.dtEntrada = dtEntrada;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "nome do Cão: " + nome + " - " + "Entrada: " + dtEntrada + " - " + "Raça: " + raca + " - " + "Cor: "
				+ cor + " - " + "Peso: " + peso;
	}

	public String nutrido() {
		if (peso > 0 && peso <= 20) {
			return "\nO " + nome + " está Desnutrido";

		} else if (peso >= 21 && peso <= 30) {
			return "\nO " + nome + " normal";
		} else {
			return "\nO " + nome + " acima do peso";
		}
	

	}
}




