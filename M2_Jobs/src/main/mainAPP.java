package main;

import Enums.Cargos;
import objects.Persona;

public class mainAPP {

	public static void main(String[] args) {
	
		Persona p1 = new Persona(Cargos.Manager,200) ;
		p1.setSaldo(200);
		
		System.out.println(p1);
		
		
	}
	
}
