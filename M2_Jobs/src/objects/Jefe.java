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
}
