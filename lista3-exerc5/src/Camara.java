import java.util.ArrayList;

public class Camara {
	ArrayList<Partido> partidos = new ArrayList<>();
	
	public double getMediaDesempenho() {
		int vereadores = 0;
		double totalmedia = 0;
		for(Partido p : partidos) {
			ArrayList<Vereador> lista = p.getVeradores();
			for(Vereador v : lista) {
				totalmedia +=v.calculaDesempenho();
				vereadores++;
			}
		}
		return (totalmedia/vereadores);
	}
	
	public void addPartido(Partido p) {
		this.partidos.add(p);
	}
	
	public int getTotalProjApres() {
		int total = 0;
		for(Partido p : partidos) {
			total += p.getTotalProjApresentados();
		}
		return total;
	}
	
	public int getTotalProjAprov() {
		int total = 0;
		for(Partido p : partidos) {
			total += p.getTotalProjAprovados();
		}
		return total;
	}
	
	public Vereador getVereadorMaisProjAprov() {
		if(this.partidos.isEmpty()) {
			return null;
		}
		Vereador VMPA = null;
		for(Partido p : partidos) {
			Vereador verAtual = p.getVereadorMaisProjAprov();
			if(verAtual != null) {
				if(VMPA == null || verAtual.getQtdProjetosAprovados() > VMPA.getQtdProjetosAprovados()  ) {
					VMPA = verAtual;
				}
			}
		}
		return VMPA;
	}
	
	public Vereador getVereadorMenorDesempenho() {
		Vereador VMPA = this.partidos.get(0).getVereadorMenorDesempenho();
		for(Partido p : partidos) {
			if(p.getVereadorMenorDesempenho().calculaDesempenho() < VMPA.calculaDesempenho()) {
				VMPA = p.getVereadorMenorDesempenho();
			}
		}
		return VMPA;
	}
	
	public ArrayList<Vereador> getVereadoresAcimaMedia(){
		ArrayList<Vereador> acima = new ArrayList<>();
		double media = this.getMediaDesempenho();
		for(Partido p : partidos) {
			for(Vereador v : p.getVereadoresAcimaMedia(media)) {
				acima.add(v);
			}
		}
		return acima;
	} 
}
