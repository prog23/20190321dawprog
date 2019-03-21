package examen.ejercicio1;

import java.awt.Color;

public class Cuadrado extends Graficos{
	
	float longitud=50f;
	public Cuadrado(Color color, float posicion, boolean indicaciones, String area, float perimetro, float longitud) {
		super(color, posicion, indicaciones, area, perimetro);
		this.longitud=longitud;
		
	}
	public float getLongitud() {
		return longitud;
	}
	
	public double area() {
		return Math.pow(getLongitud(), 2);
	}
	
	@Override
	public String toString() {
		return "Cuadrado [longitud=" + longitud + "]";
	}


	
	

}
