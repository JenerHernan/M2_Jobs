package objects;

public abstract class Persona {

	protected double saldo;

	public double getSaldo() {
		return saldo;
	}
	
	public abstract void setSaldo(double saldo);

	
	@Override
	public String toString() {
		return "Persona [saldo=" + saldo + "]";
	}
	
	
	
}
