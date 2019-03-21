package examen.ejercicio1;

import java.awt.Color;

	public class Circulo extends Graficos{
		
	private final double PI = Math.PI;
	private double radio = 0d;
	
	public Circulo(Color color, float posicion, boolean indicaciones, String area, float perimetro, float radio) {
		super(color, posicion, indicaciones, area, posicion);	
		this.radio=radio;
	}
	public double getRadio() {
		return radio;
	}
	
	public double area() {
		return PI * Math.pow(this.radio, 2);
	}	
	
	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}
	
	
	
	

}
