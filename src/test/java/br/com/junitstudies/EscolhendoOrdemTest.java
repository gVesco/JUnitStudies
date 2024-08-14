package br.com.junitstudies;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class) // Considera a ordem da annotation @Order
// @TestMethodOrder(MethodOrderer.MethodName.class) // Ordena métodos alfabeticamente
// @TestMethodOrder(MethodOrderer.DisplayName.class) // Ordena alfabeticamente considerando DisplayName

class EscolhendoOrdemTest {

	@DisplayName("Teste A")
	@Order(4) // Só necessário quando MethodOrderer.OrderAnnotation
	@Test
	void validaFluxoZ() {
		Assertions.assertTrue(true);
	}
	
	@DisplayName("Teste B")
	@Order(3)
	@Test
	void validaFluxoB() {
		assertTrue(true);
	}

	@DisplayName("Teste C")
	@Order(2)
	@Test
	void validaFluxoC() {
		assertTrue(true);
	}
	
	@DisplayName("Teste D")
	@Order(1)
	@Test
	void validaFluxoD() {
		assertTrue(true);
	}
	
}
