import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VetorDeReaisTest {

	@Test
	void testeCaso01_divisao_objeto1_nul() {
		//Arrange 
		VetorDeReais c = new VetorDeReais(3);
		VetorDeReais d = new VetorDeReais(1);
		c.setValor(2, 0);
		c.setValor(-1, 1);
		c.setValor(3.5, 2);
		d.setValor(3, 0);
		
		//Act
		VetorDeReais divisao = c.divide(d);
		
		//Arrange
		assertNull(divisao);
	}
	
	@Test
	void testeCaso02_divisao_objeto1() {
		//Arrange 
		VetorDeReais c = new VetorDeReais(3);
		VetorDeReais d = new VetorDeReais(3);
		c.setValor(2, 0);
		c.setValor(-1, 1);
		c.setValor(3.5, 2);
		d.setValor(3, 0);
		d.setValor(2, 1);
		d.setValor(1, 2);
		
		//Act
		VetorDeReais divisao = c.divide(d);
		VetorDeReais expected = new VetorDeReais(3);
		expected.setValor(0.666666, 0);
		expected.setValor(-0.5, 1);
		expected.setValor(3.5, 2);
		
		//Assert
		for(int i = 0;i < 3;i++) {
			assertEquals(expected.getValor(i), divisao.getValor(i), 0.0001);
		}
		

		
	}

}
