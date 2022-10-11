import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContribuinteTest {

	@Test
	void testeCaso01_GetImposto_Renda3000_ImpostoZero() {
		// Arrange
		Contribuinte c = new Contribuinte();
		c.setRendaAnual(3000);
		
		// Act
		double imposto = c.getImposto();
		
		// Assert
		assertEquals(0,imposto);
	}
	
	@Test
	void testeCaso02_GetImposto_Renda9000_Imposto522() {
		// Arrange
		Contribuinte c = new Contribuinte();
		c.setRendaAnual(9000);
		
		// Act
		double imposto = c.getImposto();
		
		// Assert
		assertEquals(522,imposto);
	}
	
	@Test
	void testeCaso03_GetImposto_Renda10000_Imposto10000() {
		// Arrange
		Contribuinte c = new Contribuinte();
		c.setRendaAnual(10000);
		
		// Act
		double imposto = c.getImposto();
		
		// Assert
		assertEquals(1500,imposto);
	}
	
	@Test
	void testeCaso04_GetImposto_Renda34911_9600() {
		// Arrange
		Contribuinte c = new Contribuinte();
		c.setRendaAnual(34911.73);
		
		// Act
		double imposto = c.getImposto();
		
		// Assert
		assertEquals(9600.72,imposto, 0.01);
	}
	
	@Test
	void testeCaso05_SetRenda_negativa_valorAnterior() {
		// Arrange
		Contribuinte c = new Contribuinte();
		c.setRendaAnual(34911);
		
		// Act
		c.setRendaAnual(-3000);
		double renda = c.getRendaAnual();
		
		// Assert
		assertEquals(34911,renda);
	}
	
	@Test
	void testeCaso06_SetEstado_SC_SC() {
		// Arrange
		Contribuinte c = new Contribuinte();
		c.setUf("SC");
		
		// Act
		String uf = c.getUf();
		
		// Assert
		assertEquals("SC",uf);
	}
	
	@Test
	void testeCaso07_SetEstado_PR_PR() {
		// Arrange
		Contribuinte c = new Contribuinte();
		c.setUf("PR");
		
		// Act
		String uf = c.getUf();
		
		// Assert
		assertEquals("PR",uf);
	}
	
	@Test
	void testeCaso08_SetEstado_RS_RS() {
		// Arrange
		Contribuinte c = new Contribuinte();
		c.setUf("RS");
		
		// Act
		String uf = c.getUf();
		
		// Assert
		assertEquals("RS",uf);
	}
	@Test
	void testeCaso09_SetEstado_SP_naoAlterado() {
		// Arrange
		Contribuinte c = new Contribuinte();
		c.setUf("SP");
		
		// Act
		String uf = c.getUf();
		
		// Assert
		assertNull(uf);
	}
	@Test
	void testeCaso10_SetEstado_RJ_naoAlterado() {
		// Arrange
		Contribuinte c = new Contribuinte();
		c.setUf("RJ");
		
		// Act
		String uf = c.getUf();
		
		// Assert
		assertNull(uf);
	}
}
