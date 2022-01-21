package objects;

import Enums.Tipos;

public class Empleado extends Persona{
	
	private Tipos tipo;
	
	public Empleado(double saldo , Tipos tipo) {
		this.tipo = tipo;
		
		try {
			switch(tipo) {
				case Junior:
					if(saldo * 0.85 < 900 || saldo * 0.85 > 1600 )
						throw new NullPointerException();
					else
						this.saldo = saldo * 0.85;
					break;
				case Mid:
					if(saldo * 0.90 < 1800 || saldo * 0.90 > 2500 )
						throw new NullPointerException();
					else
						this.saldo = saldo * 0.90;
					break;
				case Senior:
					if(saldo * 0.95 < 2700 || saldo * 0.95 > 4000 )
						throw new NullPointerException();
					else
						this.saldo = saldo * 0.95;
					break;
			}
		}	
		catch(NullPointerException e){
			System.out.println("Sueldo no valido!");
		}
		
	}

	@Override
	public void setSaldo(double saldo) {
		
		try {
			switch(tipo) {
				case Junior:
					if(saldo * 0.85 < 900 || saldo * 0.85 > 1600 )
						throw new NullPointerException();
					else
						this.saldo = saldo * 0.85;
					break;
				case Mid:
					if(saldo * 0.90 < 1800 || saldo * 0.90 > 2500 )
						throw new NullPointerException();
					else
						this.saldo = saldo * 0.90;
					break;
				case Senior:
					if(saldo * 0.95 < 2700 || saldo * 0.95 > 4000 )
						throw new NullPointerException();
					else
						this.saldo = saldo * 0.95;
					break;
			}
		}	
		catch(NullPointerException e){
			System.out.println("Sueldo no valido!");
		}
	}
}

