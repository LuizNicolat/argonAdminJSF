package br.com.escriba.briefing;

import javax.inject.Named;

@Named
public class TesteBean {

	private String teste="Admin";

	public String getTeste() {
		return teste;
	}

	public void setTeste(String teste) {
		this.teste = teste;
	}
	
	
}
