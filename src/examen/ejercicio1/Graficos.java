package examen.ejercicio1;

import java.awt.Color;

public abstract class Graficos {
	private Color color;
	private float posicion;
	private boolean indicaciones;
	private String area;
	private float perimetro;
	
	
	public Graficos(Color color, float posicion, boolean indicaciones, String area, float perimetro) {
		this.color=color;
		this.posicion=posicion;
		this.indicaciones=indicaciones;
		this.area=area;
		this.perimetro=perimetro;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public float getPosicion() {
		return posicion;
	}

	public void setPosicion(float posicion) {
		this.posicion = posicion;
	}

	public boolean isIndicaciones() {
		return indicaciones;
	}

	public void setIndicaciones(boolean indicaciones) {
		this.indicaciones = indicaciones;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public float getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(float perimetro) {
		this.perimetro = perimetro;
	}

	public abstract double area();
	
	@Override
	public String toString() {
		return "Graficos [color=" + color + ", posicion=" + posicion + ", indicaciones=" + indicaciones + ", area="
				+ area + ", perimetro=" + perimetro + "]";
	}	
	
	
}
