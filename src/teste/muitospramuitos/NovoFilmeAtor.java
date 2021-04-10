package teste.muitospramuitos;

import infra.DAO;
import modelo.muitospramuitos.Ator;
import modelo.muitospramuitos.Filme;

public class NovoFilmeAtor {

	public static void main(String[] args) {
		
		Filme filmeA = new Filme("Star Wars", 8.9);
		Filme filmeB = new Filme("O Fugitivo", 8.1);
		
		Ator atorA = new Ator("Henry Caber");
		Ator atorB = new Ator("Bob Collin");
		
		filmeA.adicionarAtor(atorA);
		filmeA.adicionarAtor(atorB);
		
		filmeB.adicionarAtor(atorA);
		
		DAO<Object> dao = new DAO<>();
		
		dao.incluirAtomico(filmeA);
	}
}
