import java.util.ArrayList;

public class Partido {
	private String nome;
	private int numero;
	private ArrayList<Vereador> vereadores = new ArrayList<>();
	
	public Partido(String no, int nu) {
		this.setNome(no);
		this.setNumero(nu);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if(numero > 9 && numero < 100) {
			this.numero = numero;			
		}
	}
	
	public int getTotalProjAprovados() {
		int total = 0;
		for(Vereador v : vereadores) {
			total += v.getQtdProjetosAprovados();
		}
		return total;
	}
	
	public int getTotalProjApresentados() {
		int total = 0;
		for(Vereador v : vereadores) {
			total += v.getQtdProjetosApresentados();
		}
		return total;
	}
	
	public void addVereador(Vereador v) {
		this.vereadores.add(v);
	}
	
	public double getMediaDesempenho() {
		double media = 0;
		for(Vereador v : vereadores) {
			media += v.calculaDesempenho();
		}
		return (media/vereadores.size());
	}
	
	public Vereador getVereadorMaisProjAprov() {
		if(this.vereadores.isEmpty()) {
			return null;
		}
		Vereador VMPA = this.vereadores.get(0);
		for(Vereador v : vereadores) {
			if(v.getQtdProjetosAprovados() > VMPA.getQtdProjetosAprovados()) {
				VMPA = v;
			}
		}
		return VMPA;
	}
	
	public Vereador getVereadorMenorDesempenho() {
		Vereador VMD = this.vereadores.get(0);
		for(Vereador v : vereadores) {
			if(v.calculaDesempenho() < VMD.calculaDesempenho()) {
				VMD = v;
			}
		}
		return VMD;
	}
	
	public ArrayList<Vereador> getVereadoresAcimaMedia(double media){
		ArrayList<Vereador> acima = new ArrayList<>();
		for(Vereador v : vereadores) {
			if(v.calculaDesempenho() > media) {
				acima.add(v);
			}
		}
		
		return acima;
	}

	public ArrayList<Vereador> getVeradores() {
		return this.vereadores;
	} 
	
}
