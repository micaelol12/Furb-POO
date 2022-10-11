
public class PassageirosHora {
	private int[][][] passageiros;
	
	
	public PassageirosHora() {
		this.passageiros = new int[12][30][24];
	}
	
	public void adiciona(int m,int d,int h) {
		if(m > 0 && d > 0) {
			this.passageiros[m-1][d-1][h] ++;
		}
		
	}
	
	public int quantosPassageiros(int m, int d) {
		int totalPassageiros = 0;
		if(m > 0 && d > 0) {
		int[] dia = this.passageiros[m-1][d-1];
		for(int i = 0;i< dia.length; i++) {
			totalPassageiros = totalPassageiros + dia[i];
		}
		}
		return totalPassageiros;
	}
	
	private int quantosPassageiros(int m) {
		int totalMes = 0;
		for(int d = 0; d < this.passageiros[m][0].length;d++) {
			totalMes = totalMes + this.quantosPassageiros(m+1, d+1);
		}
		return totalMes;
	}
	
	public int mesMenorFluxo() {
		int menorMes = 0;
		int menorQuant = this.quantosPassageiros(0);
		for(int m = 0; m< this.passageiros.length; m++) {
			int totalMes = this.quantosPassageiros(m);
			if(totalMes < menorQuant) {
				menorMes = m;
				menorQuant = totalMes;
			} 
		}
		return menorMes + 1; 
	}
	public int[] picoTransporte() {
		int diaM,mesM,horaM,qtdeM;
		diaM = mesM = horaM = qtdeM = 0;
		for(int m = 0; m< this.passageiros.length; m++) {
			for(int d = 0; d< this.passageiros[m].length; d++) {
				for(int h = 0; h< this.passageiros[m][d].length; h++) {
					if(this.passageiros[m][d][h] > qtdeM) {
						qtdeM = this.passageiros[m][d][h];
						horaM = h;
						diaM = d+1;
						mesM = m+1;
					}
				}
			}
		}
		int[] retorno = {diaM,mesM,horaM,qtdeM};
		return retorno; 
	}
}
