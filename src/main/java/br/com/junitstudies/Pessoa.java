package br.com.junitstudies;

import java.sql.Date;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa {

	private String nome;
	private LocalDate dataNascimento;
	
	public Pessoa(String nome, LocalDate dataNascimento) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}
	
	public int getIdade() {
		return (int) ChronoUnit.YEARS.between(dataNascimento, LocalDate.now());
	}
	
	public boolean ehMaiorDeIdade() {
		return getIdade() >= 18;
	}
	
	public String hello() {
		return "Hello World";
	}
	
	public String dataNascimento() {
		Date dataNascimento = new Date(1969-12-31);
		System.out.println(dataNascimento);
		return dataNascimento.toString();
	}
	
}
