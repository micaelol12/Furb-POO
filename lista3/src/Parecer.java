

import java.time.LocalDate;

public class Parecer {
	private String parceirista;
	private String conteudo;
	private LocalDate data;
	
	public Parecer() {
	}
	
	public Parecer(String parceirista, String conteudo, LocalDate data) {
		this.parceirista = parceirista;
		this.conteudo = conteudo;
		this.data = data;
	}

	public String getParceirista() {
		return parceirista;
	}

	public void setParceirista(String parceirista) {
		this.parceirista = parceirista;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}
}
