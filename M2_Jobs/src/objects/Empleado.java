package objects;

public class Empleado extends Persona{
	public Empleado(int saldo) {
		this.saldo *= 0.85;
	}

	@Override
	public void setSaldo(int saldo) {
		this.saldo *= 0.85;
	}
}

