import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;

public class Agenda {
	
	ArrayList<DataAgenda> datas = new ArrayList<>();
	
	public ArrayList<DataAgenda> getDatas() {
		return datas;
	}

	public void setDatas(ArrayList<DataAgenda> datas) {
		this.datas = datas;
	}

	public Agenda () {};
	
	public int searchByDate(LocalDate date) {
		int res = 0;
		for(DataAgenda d : datas) {
			if(d.getData().equals(date)) {
				System.out.print("achou"+ date);
				res = datas.indexOf(date);
				break;
			}
		}
		return res;
	}
	
	public void addDataAgenda(DataAgenda a){
		if(!check(a.data)) {
			this.datas.add(a);
		}	
	}
	
	private boolean check(LocalDate a) {
		boolean check = false;
		for(DataAgenda c: datas) {
			if(c.getData().equals(a)) {
				check = true;
			} ;
		}
		return check;
	}
	
	public Compromisso getMenorCompromisso() {
		Compromisso com;
		com = datas.get(0).getMenorCompromisso();
		for(DataAgenda d : datas) {
			if(d.getMenorCompromisso().getTempo() < com.getTempo()) {
				com = d.getMenorCompromisso();
			}
		}
		
		return com;
	}
}
