import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InteiroPositivoTest {

	@Test
	void testeCaso01_fatorial_Valor10_3628800() {
		//Arrange 
		InteiroPositivo c = new InteiroPositivo();
		c.setValor(10);
		
		//Act
		long fatorial = c.fatorial();
		
		//Assert
		assertEquals(3628800,fatorial);
	}
	
	@Test
	void testeCaso02_fatorial_Valor20_2432902008176640000() {
		//Arrange 
		InteiroPositivo c = new InteiroPositivo();
		c.setValor(20);
		
		//Act
		long fatorial = c.fatorial();

		//Assert
		assertEquals(2432902008176640000L,fatorial);
	}
	
	@Test
	void testeCaso03_divisoresInteiros_Valor14() {
		//Arrange 
		InteiroPositivo c = new InteiroPositivo();
		c.setValor(14);
		
		//Act
		String diviInteiros = c.identificaDivisoresInteiros();
		String expected =  "Os divisores inteiros são 1,2,7,14 e a quantidade de divisores é 4";
		
		//Assert
		assertEquals(expected,diviInteiros);
	}
	
	@Test
	void testeCaso04_divisoresInteiros_Valor18() {
		//Arrange 
		InteiroPositivo c = new InteiroPositivo();
		c.setValor(18);
		
		//Act
		String diviInteiros = c.identificaDivisoresInteiros();
		String expected =  "Os divisores inteiros são 1,2,3,6,9,18 e a quantidade de divisores é 6";
		
		//Assert
		assertEquals(expected,diviInteiros);
	}
	
	@Test
	void testeCaso05_fibonacci_Valor9() {
		//Arrange 
		InteiroPositivo c = new InteiroPositivo();
		c.setValor(9);
		
		//Act
		int[] fibonacci = c.fibonacci();
		int[] expected = {1, 1, 2, 3, 5, 8, 13, 21, 34};
		//Assert
		assertArrayEquals(expected, fibonacci);
	}
	
	@Test
	void testeCaso06_fibonacci_Valor15() {
		//Arrange 
		InteiroPositivo c = new InteiroPositivo();
		c.setValor(15);
		
		//Act
		int[] fibonacci = c.fibonacci();
		int[] expected = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};
		//Assert
		assertArrayEquals(expected, fibonacci);
	}
}
