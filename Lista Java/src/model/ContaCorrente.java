package model;

public class ContaCorrente {
	
	private double saldo,numero,limite=1000;
	private double valor;
	
	private String nome;
	private boolean situa�ao;
	
	
	
	public double getValor() {
		return valor;
		
	}



	public void setValor(double valor) {
		this.valor = valor;
	}

	 
	 
	 public double getSaldo() {
		return saldo;
	}



	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}



	public double getNumero() {
		return numero;
	}



	public void setNumero(double numero) {
		this.numero = numero;
	}



	public double getLimite() {
		return limite;
	}



	public void setLimite(double limite) {
		this.limite = limite;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public boolean isSitua�ao() {
		return situage�ao;
	}



	public void setSitua�ao(boolean situa�ao) {
		this.situa�ao = situa�ao;
	}

	public ContaCorrente(int numero, String nome) {
		numero = numero;
		nome=nome;
	}

	public void sacar (double sacar) {
		
		if(sacar >=  this.limite) {
		System.out.println("Sem Limite !!!");
		}
		
		else {
			saldo = saldo - sacar;
			System.out.println("O seu saldo att � :" + saldo);	
		}	 
	 }
	 
	 
	 public void depositar(double deposito) {
		 saldo = saldo + deposito;
		 System.out.println("Saldo final com o deposito :" +getSaldo());
		 
	 }

	 public void transferir(double aux) {
		 
		 aux = aux + valor;
		 
	 }
	 
}
		 