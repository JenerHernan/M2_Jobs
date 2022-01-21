package main;
import Enums.Tipos;
import objects.Empleado;
import objects.Jefe;
import objects.Manager;
import objects.Voluntario;

public class mainAPP {

	public static void main(String[] args) {
	
		Empleado p1 = new Empleado(1600,Tipos.Junior);
		Jefe j1 = new Jefe(8000);
		Manager m1 = new Manager(3000);
		Voluntario v1 = new Voluntario(0);
		//v1.setSaldo(0);
		
		System.out.println(j1);
		
		
	}
	
}
