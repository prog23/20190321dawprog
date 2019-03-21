package examen.ejercicio1;

import java.awt.Color;


public class Rectangulo extends Graficos{
	private double altura 	= 0d;
	private double longitud = 0d;
	public Rectangulo(Color color, float posicion, boolean indicaciones, String area, float perimetro, double longitud, double altura) {
		super(color, posicion, indicaciones, area, perimetro);
		this.longitud=longitud;
		this.altura=altura;
		
	}
	
	public double getLongitud() {
		return longitud();
	}
	
	
	public double getAltura() {
		return altura;
	}
	
	public double area() {
		
		return getAltura() * getLongitud();
	}	
	
	@Override
	public String toString() {
		return "Rectangulo [longitud=" + longitud + ", altura=" + altura + "]";
	}

	
	
	
	
	

}
