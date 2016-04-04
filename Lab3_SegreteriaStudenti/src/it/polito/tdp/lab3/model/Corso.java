package it.polito.tdp.lab3.model;

import java.util.ArrayList;
import java.util.List;

public class Corso {
	private String nomeCorso;
	private List<String> studentiIscrittiCorso = new ArrayList<String>();

		
	public Corso(String nomeCorso) {
		super();
		this.nomeCorso = nomeCorso;
	}

	/*
	Selezionato un corso ed inserita la matricola di uno studente, facendo click sul pulsante Iscrivi, è
	possibile iscrivere lo studente a quel corso.  
	 */
	public void iscriviStudente (String matricola){
		studentiIscrittiCorso.add(matricola);
	}

	public List<String> getStudentiIscrittiCorso() {
		return studentiIscrittiCorso;
	}
	public String getNomeCorso() {
		return nomeCorso;
	}
	
	
}
