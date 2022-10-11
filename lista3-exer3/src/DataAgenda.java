import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;

public class DataAgenda {
	LocalDate data;
	String efemeride;
	private int totalHoras;
	ArrayList<Compromisso> compromissos = new ArrayList<>();
	
	public void addCompromisso(Compromisso c) {
		if(!check(c.hora)) {
			compromissos.add(c);
		}
	}
	
	private boolean check(LocalTime a) {
		boolean check = false;
		for(Compromisso c: compromissos) {
			if(c.getHora().equals(a)) {
				check = true;
			} ;
		}	
		return check;
	}
	
	
	public int getTempoMedio() {
		int total = compromissos.size();
		for(Compromisso c : compromissos) {
			this.totalHoras += c.getTempo();
		}
		
		return (totalHoras/total);
	}
	
	public Compromisso getMenorCompromisso() {
		Compromisso menor;
		menor = compromissos.get(0);
		for(Compromisso c : compromissos) {
			if(c.getTempo() < menor.getTempo()) {
				menor = c;
			}
		}
		return menor;
	}
	
	public ArrayList<Compromisso> getCompromissoPrioridade(char c) {
		ArrayList<Compromisso> prioridade = new ArrayList<>();
		for(Compromisso com: compromissos) {
			if(com.prioridade == Character.toUpperCase(c)) {
				prioridade.add(com);
			}
		}
		return prioridade;
	}
	
	public int getQTdCOmpromissosPrioridade(char c) {
		int total = 0;
		for(Compromisso com: compromissos) {
			if(com.prioridade == Character.toUpperCase(c)) {
				total ++;
			}
		}
		return total;
	}
	
	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}


	public String getEfemeride() {
		return efemeride;
	}


	public void setEfemeride(String efemeride) {
		this.efemeride = efemeride;
	}


	public DataAgenda(LocalDate ld, String ef) {
		this.setData(ld);
		this.setEfemeride(ef);
	}
}
