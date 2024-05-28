package archivioElettronico;

public class Cliente {
	
	private String nome;
	public int autoParcheggiate;
	public Cliente(String nome) {
		this.setNome(nome);
	}
	public String getNome() {
		return nome;
	}
	public boolean setNome(String nome) {
		if(nome!=null) {
			if(nome.length()>1) {
				this.nome = nome;
				return true;
			}
			else {
				return false; 
			}
		}
		else { return false; }
		}
		
	}

