package model;

public class Automovel {

	double vM, tempo, distancia, d1, d2,distanciaFinal;
	
	
	
	public double getvM() {
		return vM;
	}

	public void setvM(double vM) {
		this.vM = vM;
	}

	public double getTempo() {
		return tempo;
	}

	public void setTempo(double tempo) {
		this.tempo = tempo;
	}


	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}

	public double getD1() {
		return d1;
	}

	public void setD1(double d1) {
		this.d1 = d1;
	}

	public double getD2() {
		return d2;
	}

	public void setD2(double d2) {
		this.d2 = d2;
	}

	public double getDistanciaFinal() {
		return distanciaFinal;
	}

	public void setDistanciaFinal(double distanciaFinal) {
		this.distanciaFinal = distanciaFinal;
	}

	public double DistanciaPercorrida(double distancia, double vM, double tempo) {
		
		return this.vM = this.distancia/this.tempo;
		
		
	}
	
	public void Correr() {
		distanciaFinal = d2 - d1;
		System.out.println("A quilometragem total percorrida é :"+ distanciaFinal);
		
		
	}
	
}