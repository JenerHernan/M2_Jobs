package objects;

import Enums.Cargos;

public class Persona {

	private Cargos cargo;
	private int saldo;
	
	
	public Enum getCargo() {
		return cargo;
	}

	public void setCargo(Cargos cargo) {
		this.cargo = cargo;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		
		switch (cargo) {
		case Jefe:
			saldo *= 1.50;
			break;
		case Manager:
			saldo *= 1.10;
			break;
		case Empleado:
			saldo *= 0.85;
			break;
		case Voluntario:
			saldo = 0; 
			break;

		default:
			break;
		}
		this.saldo = saldo;
		
	}
	
	public Persona(Cargos cargo, int saldo) {
		super();
		this.cargo = cargo;
		this.saldo = saldo;
	}

	
	@Override
	public String toString() {
		return "Persona [cargo=" + cargo + ", saldo=" + saldo + "]";
	}
	
	
	
}
