package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario3 {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 7L);
		
		// Fun��o que tira o objeto do modo gerenci�vel
		em.detach(usuario);
		
		usuario.setNome("Leonardo");
		
		// Atualiza no banco de dados um objeto que n�o est� no modo gerenci�vel
		em.merge(usuario);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}