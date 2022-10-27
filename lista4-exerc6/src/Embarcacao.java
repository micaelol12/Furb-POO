
public abstract class Embarcacao implements AtivoEmRisco {
	private String registroCapitania;
	int  qtdePessoas;
	
	public Embarcacao(String registroCapitania, int qtdePessoas) {
		this.setRegistroCapitania(registroCapitania);
		this.setQtdePessoas(qtdePessoas);
	}
	
	public String getRegistroCapitania() {
		return registroCapitania;
	}
	public void setRegistroCapitania(String registroCapitania) {
		this.registroCapitania = registroCapitania;
	}
	public int getQtdePessoas() {
		return qtdePessoas;
	}
	public void setQtdePessoas(int qtdePessoas) {
		this.qtdePessoas = qtdePessoas;
	}
	
	public abstract String verificaSeguranca();

}
