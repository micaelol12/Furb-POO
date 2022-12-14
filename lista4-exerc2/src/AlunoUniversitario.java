import java.time.LocalDate;

public class AlunoUniversitario extends Aluno {
	char formaIngresso;
	Curso curso;
	
	
	public String mostra() {
		String texto = this.getNome() + "? aluno universit?rio do curso de " + this.getCurso() + ", ingressando por" + this.getMetodoExtenso();
		return texto;
	}

	
	public AlunoUniversitario() {
		super();
	}


	public AlunoUniversitario(String nome, LocalDate dataNascimento, char FormaIngresso, Curso curso) {
		super(nome, dataNascimento);
		this.setFormaIngresso(FormaIngresso);
		this.setCurso(curso);
	}


	public char getFormaIngresso() {
		return formaIngresso;
	}


	public void setFormaIngresso(char formaIngresso) {
		formaIngresso = Character.toUpperCase(formaIngresso);
		if(formaIngresso == 'V' || formaIngresso == 'E' || formaIngresso == 'S' || formaIngresso == 'T' || formaIngresso == 'I' ) {
			this.formaIngresso = formaIngresso;
		} else throw new IllegalArgumentException("A forma de ingresso n?o existe");
		
	}


	public Curso getCurso() {
		return this.curso;
	}


	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	private String getMetodoExtenso(){
		switch (this.getFormaIngresso()) {
		case 'V':
			return "Vestibular";
		case 'E':
			return "Enem";
		case 'S':
			return "Seletivo";
		case 'T':
			return "Transfer?ncia";
		case 'I':
			return "Interna";
		default:
			throw new IllegalArgumentException("A forma de ingresso n?o existe");
		}
	}
	
}
