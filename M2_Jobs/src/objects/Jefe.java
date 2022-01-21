package objects;

public class Jefe extends Persona {
	public Jefe(int saldo) {
		this.saldo *= saldo * 1.5;
	}

	@Override
	public void setSaldo(int saldo) {
		this.saldo *= saldo * 1.5;
	}
}
