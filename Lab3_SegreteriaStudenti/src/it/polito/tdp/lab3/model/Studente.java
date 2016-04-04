package it.polito.tdp.lab3.model;

import java.util.ArrayList;
import java.util.List;


public class Studente {
	private String nome;
	private String cognome;
	private String matricola;
	private List<Corso> corsi = new ArrayList<Corso>();
	
	
	public Studente(String nome, String cognome, String matricola) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.matricola = matricola;
	}
	
	public String getNome() {
		return nome;
	}
	public String getCognome() {
		return cognome;
	}
	public String getMatricola() {
		return matricola;
	}
	public List<Corso> getCorsi() {
		return corsi;
	}
	
	public void iscriviCorso(Corso c){
		corsi.add(c);
		
	}

	@Override
	public String toString() {
		return "Studente [nome=" + nome + ", cognome=" + cognome + ", matricola=" + matricola + "]";
	}
	
	
}
