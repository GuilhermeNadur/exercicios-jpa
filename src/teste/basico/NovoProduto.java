package teste.basico;

import infra.DAO;
import modelo.basico.Produto;

public class NovoProduto {

	public static void main(String[] args) {
		
		DAO<Produto> dao = new DAO<>(Produto.class);
		
		Produto produto = new Produto("Frigobar", 500.0);
		
		dao.incluirAtomico(produto);
		
		System.out.println("ID do produto: " + produto.getId());
		
		dao.fechar();
	}
}
