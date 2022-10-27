import java.time.LocalDate;
import java.util.ArrayList;

public class Transatlantico extends Embarcacao {
	private String nome;
	private LocalDate dataInauguracao;
	private ArrayList<BoteSalvaVidas> botes = new ArrayList<>();
	
	public Transatlantico(String registroCapitania, int qtdePessoas,LocalDate dataInauguracao,String nome) {
		super(registroCapitania, qtdePessoas);
		this.setNome(nome);
		this.setDataInauguracao(dataInauguracao);
	}
	
	public void addBote(BoteSalvaVidas b) {
		botes.add(b);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDataInauguracao() {
		return dataInauguracao;
	}
	public void setDataInauguracao(LocalDate dataInauguracao) {
		this.dataInauguracao = dataInauguracao;
	}
	
	private int CapacidadeTotalBotes() {
		int total = 0;
		for(BoteSalvaVidas b : botes) {
			total += b.getQtdePessoas();
		}
		return total;
	}
	
	@Override
	public String verificaSeguranca() {
		LocalDate hoje = LocalDate.now();
		String str = "Está em condições adequadas de segurança";
		if(CapacidadeTotalBotes() < getQtdePessoas()) {
			if(dataInauguracao.isBefore(hoje)) {
				str = "“ALERTA: navio necessitando de mais botes!";
			} else {
				str = "CUIDADO: navio em perigo";
			}
		}
		return str;
	}
	
	
}
