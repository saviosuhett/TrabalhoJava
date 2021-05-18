package model;

public class Retangulo {
	
	private float base, altura,area,perimetro;

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getArea() {
		return area;
	}

	public void setArea(float area) {
		this.area = area;
	}
	
	public float area() {
		return area = base * altura;
}
	
	public void perimetro(float base,float altura) {
	 this.perimetro = (2*this.base) + (2*this.altura);
	 System.out.println("O Perimetro do retângulo é : " + perimetro);
	}

}
