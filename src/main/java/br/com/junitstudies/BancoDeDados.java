package br.com.junitstudies;

import java.util.logging.Logger;

public class BancoDeDados {

	private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());
	
	public static void iniciarConexao() {
		LOGGER.info("Iniciando conexão");		
	}
	
	public static void encerrarConexao() {
		LOGGER.info("Encerrando conexão");		
	}

	public static void insereDados(Pessoa pessoa) {
		LOGGER.info("Inserindo dados");
	}
	
	public static void removeDados(Pessoa pessoa) {
		LOGGER.info("Removendo dados");
	}
	
}
