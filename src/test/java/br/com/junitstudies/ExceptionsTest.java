package br.com.junitstudies;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExceptionsTest {

	@Test
	void validarCenarioDeExcecaoNaTranferencia() {
		Conta contaOrigem = new Conta("12345-X", 0);
		Conta contaDestino = new Conta("6789-X", 13.72);
		
		TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();
		
		// espera lançar exceção
		assertThrows(IllegalArgumentException.class, () ->
				transferenciaEntreContas.transfere(contaOrigem, contaDestino, -1));
		
		// espera NÃO lançar exceção
		assertDoesNotThrow(() -> transferenciaEntreContas.transfere(contaOrigem, contaDestino, 1));
	}
	
}
