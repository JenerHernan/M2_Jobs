package objects;

public class Jefe extends Persona {
	public Jefe(double saldo) {
		try {
			if(saldo * 1.5 < 8000)
				throw new NullPointerException();
			else
				this.saldo = saldo * 1.5;
		}
		catch(NullPointerException e) {
			System.out.println("Saldo introducido no valido");
		}
		
	}

	@Override
	public void setSaldo(double saldo) {
		try {
			if(saldo * 1.5 < 8000)
				throw new NullPointerException();
		}
		catch(NullPointerException e) {
			System.out.println("Saldo introducido no valido");
		}
	}
	
	public double neto() {
		double neto = this.saldo * 0.68 ;
		
		return neto;
	}
	public double brutoanual() {
		double bruto = this.saldo * 12;
		
		return bruto;
	}

	public double netoanual() {
		double neto = (this.saldo * 12)*0.68;
		
		return neto;
	}
	
	public double bonus(double anual) {
		anual *= 1.10;
		return anual;
	}
}
