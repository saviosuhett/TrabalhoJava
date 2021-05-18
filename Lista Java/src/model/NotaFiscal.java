package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class NotaFiscal {

	
	private double valorCompra;
	String nomeComprador, endComprador;
	 Date data = new Date();
	private int Cpf, telComprador;
	private int notaFiscal;
	private boolean informe;
	private double juros;
	
	
//	public NotaFiscal(int notaFiscal,Date dataCompra,double valorCompra
//			, String nomeComprador,int telefoneComprador,
//			int cpf){       
//		
//		this.notaFiscal = notaFiscal; 
//		this.data = dataCompra;
//		this.valorCompra = valorCompra;
//		this.nomeComprador = nomeComprador;
//		this.telComprador = telefoneComprador; 
//		this.Cpf = cpf;
//	}


	public double getValorCompra() {
		return valorCompra;
	}


	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}


	public String getNomeComprador() {
		return nomeComprador;
	}


	public void setNomeComprador(String nomeComprador) {
		this.nomeComprador = nomeComprador;
	}


	public String getEndComprador() {
		return endComprador;
	}


	public void setEndComprador(String endComprador) {
		this.endComprador = endComprador;
	}


	public Date getData() {
		return data;
	}


	public void setData(Date data) {
		this.data = data;
	}


	public int getCpf() {
		return Cpf;
	}


	public void setCpf(int cpf) {
		Cpf = cpf;
	}


	public int getTelComprador() {
		return telComprador;
	}


	public void setTelComprador(int telComprador) {
		this.telComprador = telComprador;
	}

	public int getNotaFiscal() {
		return notaFiscal;
	}

	public void setNotaFiscal(int notaFiscal) {
		this.notaFiscal = notaFiscal;
		
	}
	

	public boolean isInforme() {
		return informe;
	}


	public void setInforme(boolean informe) {
		this.informe = informe;
	}


	public double getJuros() {
		return juros;
	}


	public void setJuros(double juros) {
		this.juros = juros;
	}


	public long diferencaData(){
		
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
		
	public double Juros() {
		if(this.informe == true) {
			return this.valorCompra;
		}
		
		else {
			
			return valorCompra = valorCompra * 1.0095 * diferencaData();
			
		}
	}

	
	
	
}
