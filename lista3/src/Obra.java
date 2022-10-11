

import java.util.ArrayList;

public class Obra {
	private String titulo;
	private String autor;
	private ArrayList<Parecer> pareceres = new ArrayList<>();
	private int indice;
	
	public Obra() {
		
	}
	
	public Obra(String titulo, String autor){
		this.titulo = titulo;
		this.autor = autor;
	}
	
	public void adicionarParecer(Parecer p) {
		if(this.pareceres.size() <= 3) {
			this.pareceres.add(p);
			indice++;
		}
	}
	

	public Parecer getParecer(int posicao) {
		return pareceres.get(posicao);
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public int getQtdePareceres() {
		return indice;
	}
}
