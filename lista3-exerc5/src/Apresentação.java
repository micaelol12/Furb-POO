import java.util.ArrayList;

public class Apresentação {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Camara c = new Camara();
		
		Partido p = new Partido("Partido do Micael", 23);
		Partido p2 = new Partido("Partido da Ana", 23);
		
		Vereador a = new Vereador("ana", p, 10, 20);
		Vereador a2  = new Vereador("ana bona", p, 20,30);
		Vereador a3  = new Vereador("ana bona2", p, 30,30);
		
		Vereador m = new Vereador("Micael", p, 10, 20);
		Vereador m2  = new Vereador("Micael conti", p, 20,20);
		
		p2.addVereador(a);
		p2.addVereador(a2);
		p2.addVereador(a3);
		
		p.addVereador(m);
		p.addVereador(m2);
		c.addPartido(p);
		c.addPartido(p2);

		int teste1 = c.getTotalProjApres();
		int teste2 = c.getTotalProjAprov();
		double teste3 = c.getMediaDesempenho();
		Vereador teste4 = c.getVereadorMaisProjAprov();
		ArrayList<Vereador> teste5 = c.getVereadoresAcimaMedia();
		Vereador teste6 = c.getVereadorMenorDesempenho();
		
	}

}
