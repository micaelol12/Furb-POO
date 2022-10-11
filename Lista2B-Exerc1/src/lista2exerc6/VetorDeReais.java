package lista2exerc6;

public class VetorDeReais {
	private double[] vetor;
	
	public VetorDeReais(int tamanho) {
		vetor = new double[tamanho];
	}
	
	public double getValor(int i) {
		return this.vetor[i];
	}
	
	public int getSize() {
		return this.vetor.length;
	}
	
	// item a
	public void setValor(double valor, int posicao) {
		this.vetor[posicao] = valor;
	}
	
	// item b
	public int getQuantidadePares() {
		int contador = 0;
		
		for (int i=0; i < this.vetor.length; i++) {
			if ((int)this.vetor[i] % 2 == 0) {  // parte inteira é par?
				contador++;
			}
		}
		
		return contador;
	}
	
	//item c 
	
	public VetorDeReais divide(VetorDeReais outro) {
		VetorDeReais c = new VetorDeReais(this.vetor.length);
		if(this.vetor.length == outro.getSize()) {
			for(int i =0;i<this.vetor.length;i++) {
				c.setValor(this.vetor[i]/outro.getValor(i), i);
			}
		}
		return c;
	}
	
	//item d
	
	public double multiplica(VetorDeReais outro) {
		double multiplicacao = 0;
		if(this.vetor.length == outro.getSize()) {
//		for(int i = 1; i<=this.vetor.length;i++) {
//			 int aux = outro.getSize()-i;
//			multiplicacao = multiplicacao + (this.vetor[i-1]*outro.getValor(aux));
//		}
		for(int i = 0, j = this.vetor.length-1; i<this.vetor.length;i++,j--) {
			multiplicacao += this.vetor[i]* outro.getValor(j);
		}
		}else return Double.NaN;
		return multiplicacao;
	}
	
	//item e 
	
	public void inverte() {
		double aux = 0;
//		for(int i =1;i<this.vetor.length;i++){
//			aux = this.vetor[i-1];
//			this.vetor[i-1]=this.vetor[this.vetor.length-i];
//			this.vetor[this.vetor.length-i] = aux;
//		}
		for(int i =0,j = this.vetor.length-1;i<j;i++,j--){
			aux = this.vetor[i];
			this.vetor[i] = this.vetor[j];
			this.vetor[j] = aux;
		}
	}
	
	public double maiorDiferença() {
		double maior = 0;
		for(int i =0;i<this.vetor.length-1;i++) {
			double diferença = Math.abs(this.vetor[i]- this.vetor[i+1]);
			if( diferença > maior) maior = diferença;
		}
		return maior;
	}
	
	
	
}