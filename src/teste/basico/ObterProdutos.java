package teste.basico;

import java.util.List;

import infra.ProdutoDAO;
import modelo.basico.Produto;

public class ObterProdutos {

	public static void main(String[] args) {
		
		ProdutoDAO dao = new ProdutoDAO();
		List<Produto> produtos = dao.obterTodos();
		
		for (Produto produto : produtos) {
			System.out.println("ID: " + produto.getId() + " | Produto: " + produto.getNome()
					+ " | Pre�o: " + produto.getPreco());
		}
		
		double precoTotal = produtos.stream()
				.map(p -> p.getPreco())
				.reduce(0.0, (t, p) -> t + p);
		
		System.out.println("O pre�o total � de R$ " + precoTotal);
		
		dao.fechar();
	}
}
