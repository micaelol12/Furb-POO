import java.time.LocalDate;

public  class Evento {
	protected String titulo;
	protected double valor;
	protected LocalDate data;
	protected Avaliacao avaliacao;
	
	
	public Evento(String titulo, double valor, LocalDate data) {
		super();
		this.setTitulo(titulo);
		this.setValor(valor);
		this.setData(data);
	}
	
	public void setAvalicao(Avaliacao a) {
		avaliacao = a;
	}
	
	public Avaliacao getAvalicao() {
		return avaliacao;	
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public LocalDate getData() {
		return data;
	}



	public void setData(LocalDate data) {
		this.data = data;
	}

	public String exibir() {
		String valorFormated = String.format("%.2f", this.getValor());
		String str = "";
		if(avaliacao != null) {
			str = "Evento: " + this.getTitulo() + " no dia " + this.getData() + ",ingressos a R$" + valorFormated + " teve " + avaliacao.getQtdPagantes() + " pagantes que acharam o evento " + avaliacao.getOpiniaoGeral();
		}else {
			str = "Evento: " + this.getTitulo() + " no dia " + this.getData() + " com ingressos a R$" + valorFormated + ". Ainda não avaliado" ;
		}
		return str;
	}
	
}
