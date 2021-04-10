package teste.heranca;

import infra.DAO;
import modelo.heranca.Cachorro;
import modelo.heranca.Gato;

public class NovoAnimal {

	public static void main(String[] args) {
		
		Gato gato = new Gato("Woody", 6, true);
		Cachorro cachorro = new Cachorro("Billy", 12, true);
		
		DAO<Object> dao = new DAO<>();
		
		dao.abrirTransacao()
			.incluir(gato)
			.incluir(cachorro)
			.fecharTransacao();
		
		dao.fechar();
	}
}
