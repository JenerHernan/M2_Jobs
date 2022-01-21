package objects;

public class Manager extends Persona{
	public Manager(double saldo) {
		try {
			if(saldo * 1.1 < 3000 || saldo * 1.1 > 5000)
				throw new NullPointerException();
			else
				this.saldo = saldo * 1.1;
		}
		catch(NullPointerException e) {
			System.out.println("Saldo introducido no valido");
		}
	}

	@Override
	public void setSaldo(double saldo) {
		this.saldo *= 1.1;
	}
}
