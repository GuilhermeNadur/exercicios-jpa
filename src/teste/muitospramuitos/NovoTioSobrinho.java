package teste.muitospramuitos;

import infra.DAO;
import modelo.muitospramuitos.Sobrinho;
import modelo.muitospramuitos.Tio;

public class NovoTioSobrinho {

	public static void main(String[] args) {
		
		DAO<Object> dao = new DAO<>();
		
		Tio tia = new Tio("Maria");
		Tio tio = new Tio("Alberto");
		
		Sobrinho sobrinho = new Sobrinho("João");
		Sobrinho sobrinha = new Sobrinho("Lívia");
		
		tio.getSobrinhos().add(sobrinho);
		sobrinho.getTios().add(tio);
		
		tio.getSobrinhos().add(sobrinha);
		sobrinha.getTios().add(tio);
		
		tia.getSobrinhos().add(sobrinho);
		sobrinho.getTios().add(tia);
		
		tia.getSobrinhos().add(sobrinha);
		sobrinha.getTios().add(tia);
		
		dao.abrirTransacao()
			.incluir(tio)
			.incluir(tia)
			.incluir(sobrinho)
			.incluir(sobrinha)
			.fecharTransacao();
		
		dao.fechar();
	}
}
