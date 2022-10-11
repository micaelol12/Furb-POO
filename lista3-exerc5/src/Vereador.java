
public class Vereador {
	private String nome ;
	private Partido partido;
	private int qtdProjetosAprovados;
	private int qtdProjetosApresentados;
	
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Partido getPartido() {
		return partido;
	}


	public void setPartido(Partido partido) {
		this.partido = partido;
	}


	public int getQtdProjetosAprovados() {
		return qtdProjetosAprovados;
	}


	public void setQtdProjetosAprovados(int qtdProjetosAprovados) {
		if(qtdProjetosAprovados >0) {
			this.qtdProjetosAprovados = qtdProjetosAprovados;			
		}
	}


	public int getQtdProjetosApresentados() {
		return qtdProjetosApresentados;
	}


	public void setQtdProjetosApresentados(int qtdProjetosApresentados) {
		if(qtdProjetosApresentados > 0) {
			this.qtdProjetosApresentados = qtdProjetosApresentados;
		}

	}


	public Vereador(String no, Partido pa, int qtdPrjApro, int qtdPrjApre) {
		this.setNome(no);;
		this.setPartido(pa);
		this.setQtdProjetosApresentados(qtdPrjApre);
		this.setQtdProjetosAprovados(qtdPrjApro);
	}
	
	
	public double calculaIndiceDeTrabalho() {
		if(qtdProjetosApresentados > 0 && qtdProjetosApresentados < 6) return 0.80;
		if(qtdProjetosApresentados > 5 && qtdProjetosApresentados < 11) return 1.00;
		if(qtdProjetosApresentados > 10 && qtdProjetosApresentados < 18) return 1.08;
		if(qtdProjetosApresentados > 17) return 1.22;
		return 0;
	}
	
	public double calculaDesempenho() {
		if(this.getQtdProjetosApresentados() == 0) {
			return 0;
		} 
		double res = Double.valueOf(this.getQtdProjetosAprovados())/Double.valueOf(this.getQtdProjetosApresentados());
		return res;
	}
}
