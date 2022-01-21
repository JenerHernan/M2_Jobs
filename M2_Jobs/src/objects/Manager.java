package objects;

public class Manager extends Persona{
	public Manager(int saldo) {
		this.saldo *= 1.1;
	}

	@Override
	public void setSaldo(int saldo) {
		this.saldo *= 1.1;
	}
}
