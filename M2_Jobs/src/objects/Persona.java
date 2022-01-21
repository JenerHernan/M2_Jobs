package objects;

public abstract class Persona {

	protected double saldo;

	public double getSaldo() {
		return saldo;
	}
	
	public abstract void setSaldo(double saldo);

	public abstract double neto();

	public abstract double brutoanual();

	public abstract double netoanual();

	
	public abstract double bonus(double anual);
	
	@Override
	public String toString() {
		return "Persona [saldo=" + saldo + " saldo neto="+ neto()+ " bruto anual= " + brutoanual()+ " neto anual= " +netoanual() + " incluido el bonus="+ bonus(brutoanual())+ "]";
	}
	
	
	
}
