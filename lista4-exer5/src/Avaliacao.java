
public class Avaliacao {
	private int qtdPagantes;
	private String opiniaoGeral;
	
	public Avaliacao(int qtdPagantes, String opiniaoGeral) {
		this.setQtdPagantes(qtdPagantes);;
		this.setOpiniaoGeral(opiniaoGeral);;
	}
	
	public int getQtdPagantes() {
		return qtdPagantes;
	}
	public void setQtdPagantes(int qtdPagantes) {
		this.qtdPagantes = qtdPagantes;
	}
	public String getOpiniaoGeral() {
		return opiniaoGeral;
	}
	public void setOpiniaoGeral(String opiniaoGeral) {
		this.opiniaoGeral = opiniaoGeral;
	}
	
	
}	
