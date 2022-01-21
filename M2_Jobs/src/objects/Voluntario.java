package objects;

public class Voluntario extends Persona{
	public Voluntario(double saldo) {
		this.saldo = 0;
	}

	@Override
	public void setSaldo(double saldo) {
		this.saldo = 0;
		System.out.println("Los voluntarios no cobran!");
	}
}