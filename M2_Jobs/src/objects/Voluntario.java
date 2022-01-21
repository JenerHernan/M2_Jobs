package objects;

import javax.swing.JOptionPane;

public class Voluntario extends Persona{
	public Voluntario(double saldo) {
		this.saldo = 0;
	}

	@Override
	public void setSaldo(double saldo) {
		
		String ayuda = JOptionPane.showInputDialog("Le interesa recibir una ayuda del govierno de 300€ (si/no)");
		
		switch (ayuda) {
		case "si":
			this.saldo = 300;
			break;

		default:
			this.saldo = 0;
			break;
		}
		
	}
	
	public double neto() {
		// TODO Auto-generated method stub
		return 0;
	}
	

	@Override
	public double brutoanual() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double netoanual() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double bonus(double anual) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}