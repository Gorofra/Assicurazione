package archivioElettronico;
import java.util.*;

public class ArchivioElettronico {
	ArrayList<Cliente> clienti;
	ArrayList<Auto> automobili;
	public ArchivioElettronico() {
		clienti= new ArrayList<>();
		automobili = new ArrayList<>();
		
	}
	public ArrayList<Cliente> getClienti() {
		return clienti;
	}
	public void setClienti(ArrayList<Cliente> clienti) {
		this.clienti = clienti;
	}
	public ArrayList<Auto> getAutomobili() {
		return automobili;
	}
	public void setAutomobili(ArrayList<Auto> automobili) {
		this.automobili = automobili;
	}
	public boolean addCliente(Cliente cli) {
		if(cli!=null) {
			boolean presente= false;
			for(Cliente c: clienti) {
				if(c.equals(cli)) {
					presente=true;
				}
			}
			if(!presente) {
				clienti.add(cli);
				return true;
			}
			else {return false;}

		}
		else {
			return false;
		}
	}
	public boolean addAutomobile(Auto auto, Cliente cli) {
		if(auto!=null & cli!=null) {
			boolean presente= false;
			for(Cliente c: clienti) {
				if(c.equals(cli)) {
					presente=true;
				}
			}
			if(!presente) {
				clienti.add(cli);
			}
			presente=false;
			for(Auto a: automobili) {
				if(a.equals(auto)) {
					presente=true;
				}
			}
			if(!presente) {
				automobili.add(auto);
				auto.getProprietario().autoParcheggiate++;
				return true;
			}
			else {return false;}
		}
		else {return false;}
	}
	public boolean removeAutomobile(Auto auto) {
		Iterator it=automobili.iterator();
		while(it.hasNext()) {
			if(it.next().equals(auto)) {
				it.remove();
				auto.getProprietario().autoParcheggiate--;
				return true;
			}
		}
		return false;
	}
	public String clienteTarga(Auto auto) {
		for(Auto a : this.automobili) {
			if(a.getNumeroDiTarga()==(auto.getNumeroDiTarga())) {
				return a.getProprietario().getNome();
			}
		}
		return null;
	}
	public int contaAuto(Cliente cli) {
		int res=0;
		for(Auto a: automobili) {
			if (a.getProprietario().equals(cli)){
				res++;
			}
		}
		return res;
	}
	public boolean removeCliente(Cliente cli) {
		Iterator<Cliente> it=clienti.iterator();
		if(it.next().equals(cli)) {
			it.remove();
			return true;
		}
		return false;
	}
	public Cliente maxAuto() {
		Cliente clim=new Cliente("");
		for(Cliente cli: clienti) {
			if(cli.autoParcheggiate>clim.autoParcheggiate) {
				clim=cli;
			}
		}
		return clim;
	}
	public HashSet<Integer> returnTarga(Cliente cli){
		HashSet<Integer> res=new HashSet<>();
			for(Auto a: automobili) {
				if(a.getProprietario().equals(cli)) {
					res.add(a.getNumeroDiTarga());
				}
			}
			if(res.size()==cli.autoParcheggiate) {
				return res;
			}
			System.out.println("eh voleeevi");
			return res;
	}

}

  