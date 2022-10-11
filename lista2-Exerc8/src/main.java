
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PassageirosHora teste = new PassageirosHora();
		
		for(int j = 0; j < 12;j ++) {
			for(int i = 0; i < 10;i ++) {
				teste.adiciona(j, 1, i);
				if(j == 0) {
					teste.adiciona(j+1, 1, i);
					teste.adiciona(j+1, 1, i);
					teste.adiciona(j+1, 1, i);
				}
				if(j == 11) {
					teste.adiciona(j+1, 1, i);
					teste.adiciona(j+1, 1, i);
					teste.adiciona(j+1, 1, i);
				}
			} 
		} 


		teste.quantosPassageiros(1, 1);
		teste.mesMenorFluxo();
		teste.picoTransporte();
	}

}
