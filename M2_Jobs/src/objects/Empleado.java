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
	
	public double neto() {
		double neto = 0;
		switch (tipo) {
		case Junior:
			neto = this.saldo * 0.98;
			break;
		case Mid:
			neto = this.saldo * 0.85;
			break;
		case Senior:
			neto = this.saldo * 0.76;
			break;

		default:
			break;
		}
		
		
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

