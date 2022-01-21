package objects;

public class Voluntario extends Persona{
	public Voluntario(int saldo) {
		this.saldo = 0;
	}

	@Override
	public void setSaldo(int saldo) {
		this.saldo = 0;
		System.out.println("Los voluntarios no cobran!");
	}
}