package br.com.junitstudies;

import static org.junit.jupiter.api.Assertions.*; // Import dos métodos do Assertions, dispensando uso de 'Assertions.assert...'

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PessoaTest {

	@Test
	void dizHelloWorld() {
		Pessoa joao = new Pessoa("João Bolão", LocalDate.of(2006, 8, 11));
		Assertions.assertEquals("Hello World", joao.hello());
	}
	
	@Test 
	void verificarIdadeCorreta() {
		Pessoa joao = new Pessoa("João Bolão", LocalDate.of(2006, 8, 11));
		assertEquals(18, joao.getIdade());
	}
	
	@Test
	void verificarSeEhMaiorDeIdade() {
		Pessoa joao = new Pessoa("João Bolão", LocalDate.of(2006, 8, 11));
		assertTrue(joao.ehMaiorDeIdade());
	}

	@Test
	void validarSeObjetoEstaNulo() {
		Pessoa pessoa = null;
		Assertions.assertNull(pessoa);
		
		pessoa = new Pessoa("Luciano", LocalDate.now());
		Assertions.assertNotNull(pessoa);
	}
	
}