package examen.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Ejercicio4 ag = new Ejercicio4();
		ag.introducirTelefono("María", 600000001);
		ag.introducirTelefono("Alberto", 600000002);
		ag.introducirTelefono("Elena", 600000003);
		
		System.out.println("Introduce nombre: ");
		ag.nombre=sc.nextLine();
		System.out.println("Consulta: "+ ag.consultaTelefono(ag.nombre));
		
		ag.mostrarAgenda();
		System.out.print("Fin");
		
		

	}

}
