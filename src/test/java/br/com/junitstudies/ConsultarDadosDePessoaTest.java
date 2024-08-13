package br.com.junitstudies;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConsultarDadosDePessoaTest {

	@BeforeAll
	static void configuraConexao() {
		BancoDeDados.iniciarConexao();
	}
	
	@BeforeEach
	void insereDadosParaTeste() {
		BancoDeDados.insereDados(new Pessoa("José Maria", LocalDate.now()));
	}
	
	@Test
	void ValidarDadosDeRetornoUm() {
		assertTrue(true);
		System.out.println("Executando teste 1...");
	}
	
	@Test
	void ValidarDadosDeRetornoDois() {
		assertTrue(true);
		System.out.println("Executando teste 2...");
	}
	
	@AfterEach
	void removeDadosParaTeste() {
		BancoDeDados.removeDados(new Pessoa("José Maria", LocalDate.now()));
	}
	
	@AfterAll
	static void finalizarConexao() {
		BancoDeDados.encerrarConexao();
	}

}
