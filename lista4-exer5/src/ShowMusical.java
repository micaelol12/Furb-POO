import java.time.LocalDate;

public class ShowMusical extends Evento {
	private String nomeBanda;
	private String estiloMusical;
	
	public ShowMusical(String titulo, double valor, LocalDate data, String nomeBanda, String estiloMusical) {
		super(titulo, valor, data);
		setNomeBanda(nomeBanda);
		setEstiloMusical(estiloMusical);
	}
	public String getNomeBanda() {
		return nomeBanda;
	}
	public void setNomeBanda(String nomeBanda) {
		this.nomeBanda = nomeBanda;
	}
	public String getEstiloMusical() {
		return estiloMusical;
	}
	public void setEstiloMusical(String estiloMusical) {
		this.estiloMusical = estiloMusical;
	}
	 @Override
	 public String exibir() {
			String str = "";
			String valorFormated = String.format("%.2f", this.getValor());
			if(avaliacao != null) {
				str = "Show musical "+  this.getTitulo() + " de " + this.getEstiloMusical() +" de " + this.getNomeBanda() + " com ingresso a R$" + valorFormated + ", contou com " + this.avaliacao.getQtdPagantes() + " pagantes que acharam o evento" + this.avaliacao.getOpiniaoGeral(); 
			}else {
				str = "Show musical " + this.getTitulo() + " de " + this.getNomeBanda() + " com igresso a R$" + valorFormated + ", dia " + this.getData() + ".Ainda não avaliado";
			}
			return str;
	 }
	
	
	
}
