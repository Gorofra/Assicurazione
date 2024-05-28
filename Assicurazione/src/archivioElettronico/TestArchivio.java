package archivioElettronico;

public class TestArchivio {

	public static void main(String[] args) {
		Cliente cli=new Cliente("francesco");
		Cliente cli1=new Cliente("luca");
		Auto a1=new Auto(123654, cli);
		Auto a2=new Auto(456321, cli1);	
		Auto a3=new Auto(789098, cli1);	
		ArchivioElettronico archivio=new ArchivioElettronico();
		archivio.addAutomobile(a1, cli);
		archivio.addAutomobile(a2, cli1);
		archivio.addAutomobile(a3, cli1);
		System.out.println("yeah");
		for(Auto a:archivio.getAutomobili()){
			System.out.println(a.getProprietario().getNome()+" "+a.getNumeroDiTarga());
		}
		System.out.println(archivio.returnTarga(cli1));
		System.out.println(archivio.maxAuto().getNome());
		
	}

}
