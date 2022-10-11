import java.time.LocalDate;

public class AlunoEnsinoMedio extends Aluno {
	private int ano;

	
	
	public AlunoEnsinoMedio() {
		super();
	}


	public AlunoEnsinoMedio(String nome, LocalDate dataNascimento, int ano) {
		super(nome, dataNascimento);
		this.setAno(ano);
	}


	public String mostra() {
		String texto = this.getNome() + "est� cursando o" + this.getAno() + "o ano do ensino m�dio e tem " + this.getIdade() + "anos";
		return texto;
	}


	public int getAno() {
		return ano;
	}


	public void setAno(int ano) {
		if(this.ano < 1 || this.ano >3) {
			throw new IllegalArgumentException("O ano do ensino m�dio est� incorreto");
		}else
		this.ano = ano;
	}
	
	
}
