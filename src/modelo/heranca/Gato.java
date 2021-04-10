package modelo.heranca;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "gatos")
public class Gato extends Animal {

	private boolean docio;

	public Gato() {}

	public Gato(String nome, int idade, boolean docio) {
		this.setNome(nome);
		this.setIdade(idade);
		this.setDocio(docio);
	}

	public boolean isDocio() {
		return docio;
	}

	public void setDocio(boolean docio) {
		this.docio = docio;
	}
}
