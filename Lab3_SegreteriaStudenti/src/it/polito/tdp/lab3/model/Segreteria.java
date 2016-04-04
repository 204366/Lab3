package it.polito.tdp.lab3.model;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Segreteria {
	private Map<String, Studente> studenti;
	

	public Segreteria(){
		 studenti =  new TreeMap<String, Studente>();
	}
	
	public Studente creaStudente (String matricola, String nome, String cognome){
		Studente s = new Studente(nome, cognome, matricola);
		studenti.put(matricola, s);
		return s;
		
	}
	
	public String cercaStudente(String matricola){
		for(Studente s: studenti.values()){
			if(s.getMatricola().compareTo(matricola) == 0)
				return s.getNome() + " " + s.getCognome();
		}
		return null;
		
	}
	
	/*
	Data la matricola di uno studente (nessun corso selezionato), facendo click sul pulsante Cerca,
	controllare se è presente nel database ed in caso visualizzare tutti i corsi ai quali lo studente è iscritto.
	Se non è presente, visualizzare un messaggio di errore. (Esempio Fig. 3) 
	 */
	public List<Corso> cercaCorsiStudente(String matricola){
		if(studenti.containsKey(matricola) == true){
			return  studenti.get(matricola).getCorsi();
		}
		else
			System.out.println("Errore!!! Lo studente inserito non esiste!");
		return null; 
		
	}
	
	public String studentiIscrittiCorso(Corso c){
		String risultato = "";
		for(String stemp: c.getStudentiIscrittiCorso())
			risultato += this.cercaStudente(stemp) + "\n";
		return  risultato;
			
	}
	
	/*
	Selezionato un corso ed inserita la matricola di uno studente, facendo click su Cerca, è possibile sapere
	se lo studente specificato è iscritto a quel corso. (Esempio Fig. 4) 
	 */
	public String studenteIscrittoSiNo(Corso c, String matricola){
		if(c.getStudentiIscrittiCorso().contains(matricola) == true){
			return this.cercaStudente(matricola) + " " + " è iscritto al corso " + c.getNomeCorso();
		}
		return this.cercaStudente(matricola) + " " + " non è iscritto al corso " + c.getNomeCorso();
		
	}
}
