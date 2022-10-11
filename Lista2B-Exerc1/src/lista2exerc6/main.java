package lista2exerc6;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VetorDeReais a = new VetorDeReais(5);
		VetorDeReais b = new VetorDeReais(3);
		
		a.setValor(1, 0);
		a.setValor(2, 1);
		a.setValor(3, 2);
		a.setValor(4, 3);
		a.setValor(-10, 4);
		
		b.setValor(1, 0);
		b.setValor(2, 1);
		b.setValor(3, 2);
		
		VetorDeReais c = a.divide(b);
		
		double multi = a.multiplica(b);
		

		double teste = a.maiorDiferença();
		a.inverte();
	}

}
