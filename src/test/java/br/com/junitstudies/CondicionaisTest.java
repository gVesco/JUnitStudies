package br.com.junitstudies;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledIf;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

class CondicionaisTest {

	// caso Assumptions.assumeTrue retorne FALSE, ignorá o teste atual e passará para o próximo
	
	@Test
	void validarAlgoSomenteParaUsuario() {
		Assumptions.assumeTrue("Usuario".equals(System.getenv("USERNAME"))); // validar algo apenas para o usuario Usuario
		assertEquals(10, 5 + 5);
	}
	
	@Test
	@EnabledIfEnvironmentVariable(named = "USERNAME", matches = "Guilherme")// validar algo apenas para o usuario Guilherme
	void validarAlgoSomenteParaGuilherme() {
		assertEquals(5, 5 + 5);
	}
	
	@Test
	@DisabledIfEnvironmentVariable(named = "USERNAME", matches = "Guilherme")// validar algo para todos usuarios, exceto Guilherme
	void validarAlgoExcetoParaGuilherme() {
		assertEquals(10, 5 + 5);
	}
	
	@Test
	@EnabledOnOs({OS.LINUX, OS.MAC}) // validar algo apenas para OS desejada
	void validarAlgoSomenteParaLinux() {
		assertEquals(5, 5 + 5);
	}
	
	@Test
	@EnabledForJreRange(min = JRE.JAVA_9, max = JRE.JAVA_21) // validar algo apenas para JRE desejada
	void validarAlgoSomenteParaJREEspecifica() {
		assertEquals(5, 5 + 5);
	}


}
