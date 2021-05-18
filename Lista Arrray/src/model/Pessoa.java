package model;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import model.Cao;
import model.Data;
public class Pessoa {
	
	private String nome;
	public Cao caoAdotado;
	public Data diferencaData;
	public String dataAdocao;
	private String endereco,telefone,email;
	private char sexo;
	

	//@Override
	public String toString() {
		return caoAdotado + " - " + "Pessoa: " + nome + " - " 
	+ "Data de adoção :" + dataAdocao + " Tempo na ONG : " + Data.calcularData(this.caoAdotado.getDtEntrada(),this.dataAdocao);
	}
	
	public long diferenca() {
		
		return Data.tempoAdotado(dataAdocao,caoAdotado);
	}
	
	public Pessoa(String nome, String dataAdocao, String endereco, String telefone, String email, char sexo, Cao caoAdotado) {
	
		this.nome = nome;
		this.dataAdocao = dataAdocao;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
		this.sexo = sexo;
		this.caoAdotado = caoAdotado;
	}

	
	public String teste(String dataAdoção) {
		return dataAdoção;
	}
	public char getSexo() {
		return sexo;
	}


	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	
	public String verificarNome(String nomeVerif) {
	
		if (nomeVerif == nome) {
			return "Cachorro existente";
		} else {
			return " ";
		}
	
	}

}



