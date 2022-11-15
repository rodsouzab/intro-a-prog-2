package atividade_um;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Cliente {
	String cpf;
	String nome;
	LocalDate dataNascimento;
	
	public Cliente(String cpf, String nome, LocalDate dataNascimento) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}

	public int calcularIdade() {
		int idade = (int) this.dataNascimento.until(LocalDate.now(), ChronoUnit.YEARS);
		if (this.dataNascimento.getMonthValue() > LocalDate.now().getMonthValue())
			return idade--;
		if (this.dataNascimento.getMonthValue() == LocalDate.now().getMonthValue()) {
			if (this.dataNascimento.getDayOfMonth() > LocalDate.now().getDayOfMonth())
				return idade--;
		}
		return idade;
		
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
	
}
