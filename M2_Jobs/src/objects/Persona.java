package objects;

public abstract class Persona {

	protected int saldo;

	public int getSaldo() {
		return saldo;
	}
	
	public abstract void setSaldo(int saldo);

	
	@Override
	public String toString() {
		return "Persona [saldo=" + saldo + "]";
	}
	
	
	
}
