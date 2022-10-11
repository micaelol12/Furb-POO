import java.util.ArrayList;

public class Curso {
	private char sigla;
	private String nome;
	private ArrayList<AlunoUniversitario> alunos = new ArrayList<AlunoUniversitario>();
	
	public Curso() {};
	
	public Curso(char sigla, String nome) {
		this.sigla = sigla;
		this.nome = nome;
	}
	
	public char getSigla() {
		return sigla;
	}
	
	public void setSigla(char sigla) {
		this.sigla = sigla;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
