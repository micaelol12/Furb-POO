import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Aluno implements Comparable<Aluno> {
	private String nome;
	private LocalDate dataNascimento;
	
	
	public Aluno() {}
	
	public Aluno(String nome, LocalDate dataNascimento) {
		this.setNome(nome);
		this.setDataNascimento(dataNascimento);
	}
	
	public String getNome() {
		return nome;
	}
	
	
	@Override
	public int compareTo(Aluno o) {	
		// TODO Auto-generated method stub
		return this.nome.compareTo(o.getNome());
	}

	public void setNome(String nome) {
		System.out.printf(nome);
		if(nome.length() > 4) {
			this.nome = nome;
		}else  throw new IllegalArgumentException("O nome deve ter ao menos 5 letras");
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		if(dataNascimento.isAfter(LocalDate.now())) {
			 throw new IllegalArgumentException("Data de nascimento inválida");
		}else  this.dataNascimento = dataNascimento;
		
	}
	
	public long getIdade() {
		if(this.dataNascimento != null) {
			LocalDate today = LocalDate.now();
			   long diff = ChronoUnit.YEARS.between( this.dataNascimento,today);
			   return diff;
		} else throw new IllegalArgumentException("O aluno deve ter uma data de nascimento cadastrada");
	}
	
	public abstract String mostra();
	
}
