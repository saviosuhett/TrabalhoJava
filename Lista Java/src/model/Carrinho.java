package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Carrinho {
	
	private String nome;
	private double valorCompra,valorVenda;
	private Date validade;
	
	ArrayList<String> mercadorias = new ArrayList<String>();
	
	public Carrinho() {
		
	}	
	
	public Carrinho(String nome, double valorCompra, double valorVenda, 
			Date validade, ArrayList<String> mercadorias) {
		super();
		this.nome = nome;
		this.valorCompra = valorCompra;
		this.valorVenda = valorVenda;
		this.validade = validade;
		this.mercadorias = mercadorias;
	}
	
	
	public double Juros(double valorVenda) {
		
		valorVenda = valorCompra * 1.30;
		return valorVenda;		
	}
	
	public long calcularValidade() {	
		try {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date segundoDt,primeiraDt;
		primeiraDt = sdf.parse("14/03/2021");
		segundoDt = sdf.parse("15/03/2021");
		
		long diffEmMil = Math.abs(segundoDt.getTime() - primeiraDt.getTime());
		long diff = TimeUnit.DAYS.convert(diffEmMil,TimeUnit.MILLISECONDS);
		
		return diff;
		
	} catch (ParseException e) {
		return 0;
	}
	}
	
	public void validade() {
		if(calcularValidade() >=0) {
			System.out.println("O produto está na validade !!!  ");
		}
		else {
			System.out.println("O produto está vencido a" +calcularValidade()*-1 + " dias" );
		}
		
	}
	

	
}
	
