package teste.heranca;

import infra.DAO;
import modelo.heranca.Aluno;
import modelo.heranca.AlunoBolsista;

public class NovoAluno {

	public static void main(String[] args) {
		
		DAO<Aluno> dao = new DAO<>();
		
		Aluno aluno1 = new Aluno(9937841L, "Guilherme");
		AlunoBolsista aluno2 = new AlunoBolsista(8132765L, "João", 750);
		
		dao.incluirAtomico(aluno1);
		dao.incluirAtomico(aluno2);
		
		dao.fechar();
	}
}
