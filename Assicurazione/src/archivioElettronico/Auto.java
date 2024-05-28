package archivioElettronico;

public class Auto {
	private int numeroDiTarga;
	private Cliente proprietario;
	public Auto(int numeroDiTarga, Cliente proprietario) {
		this.setNumeroDiTarga(numeroDiTarga);
		this.setProprietario(proprietario);
	}
	public int getNumeroDiTarga() {
		return numeroDiTarga;
	}
	public boolean setNumeroDiTarga(int numeroDiTarga) {
		if(numeroDiTarga<0|numeroDiTarga>999999) {
			return false;
		}
		else {
			this.numeroDiTarga = numeroDiTarga;
			return true;	
		}
	}
	public Cliente getProprietario() {
		return proprietario;
	}
	public boolean setProprietario(Cliente proprietario) {
		if(proprietario!=null) {
			this.proprietario = proprietario;
			return true;
		}
		else {return false;}
	}

}