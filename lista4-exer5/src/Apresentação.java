import java.time.LocalDate;

public class Apresentação {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Evento e = new Evento("Teatro às 18", 20.00, LocalDate.parse("2019-10-09"));
		Evento e2 = new Evento("Teatro às 18", 20.00, LocalDate.parse("2019-10-09"));
		ShowMusical s = new ShowMusical("Tempo  passado", 15.00, LocalDate.parse("2019-09-15"), "Grupo  GFD", "rock  progressivo");
		Avaliacao a = new Avaliacao(265, " Muuuito louco...");
		
		s.setAvalicao(a);
		System.out.println(e.exibir());
		System.out.println(e2.exibir());
		System.out.println(s.exibir());
	}
}
