public class InteiroPositivo
{
    // atributos
    private int x;

    // item a
    public void setValor(int valor){
        if (valor >= 0){
            this.x = valor;
        }
    }

    public int getValor(){
        return this.x;
    }

    // item b
    public int multiplicar(InteiroPositivo outro){
        return outro.getValor() * this.x;
    }

    // item c
    public long fatorial(){
        long resultado = 1;
        for (int i=this.x; i>0; i--){
            resultado = resultado*i;
        }
        return resultado;
    }

    // item d
    public String identificaDivisoresInteiros(){
        String str = "Os divisores inteiros s�o ";
        int contador = 0;
        for (int divisor = 1; divisor <= this.x; divisor++){
            if (this.x % divisor == 0) {
            	if(divisor <this.x) {
            		str += divisor+",";
            	}else {
            		str += divisor+ " ";
            	}
                
                contador++;
            }
        }
        return str +"e a quantidade de divisores � "+contador;
        //return "Os divisores inteiros s�o 1, 2, 3, 4, 6, 12 e a quantidade de divisores � 6.";
    }

    // item e
    public int[] fibonacci(){
        int[] vetor = new int[this.x];
        if (this.x > 0){
            vetor[0] = 1;
            if (this.x > 1){
                vetor[1] = 1;
            }
        }
        for (int pos=2; pos < vetor.length; pos++){
            vetor[pos] = vetor[pos-1]+vetor[pos-2];
        }
        return vetor;
    }
}