package examen.ejercicio3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Ejercicio3 {
	public static void main(String[] args) {
	
		
	List<String> quimicos = new ArrayList<String>();	
	
	quimicos.add("Ce O");
	quimicos.add("Mo O Ce");
	quimicos.add("Ee");
	quimicos.add("Mo");		
		
	List<Character> duplicados = new ArrayList<>();
	Iterator<String> itr = quimicos.iterator();
    while(itr.hasNext()) {
        String s = itr.next();
        char c = s.charAt(0);
        if(duplicados.contains(c)) {
            itr.remove();
            continue;
        }
        duplicados.add(c);
    }
    System.out.println(quimicos);
	}
	

	}
	
	
	
	
	
