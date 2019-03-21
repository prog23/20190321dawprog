package examen.ejercicio4;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio4 {
	
	private Map<String, Integer> agenda = new HashMap<>();	
	String nombre;
	int numero;
	
	public void introducirTelefono(String nombre, int numero) {
		agenda.put(nombre, numero);		
	}	
	
	
	public int consultaTelefono(String nombre) {
		int tel=agenda.get(nombre);		
		if(tel==numero) {
			return 0;
		}else {
			return tel;
		}
		
	}
	
	public boolean estaIncluido(String nombre) {		
		
		return agenda.containsKey(nombre);		
	}
	
	public void mostrarAgenda() {
		Set<Entry<String, Integer>> lista=agenda.entrySet();
		System.out.println();
		for(Entry<String, Integer> e : lista) {
		System.out.print("Entrada: "+e.getKey() + " - " + e.getValue()+" ");
		}
	}
	
	
}
