package it.polito.tdp.lab3.model;

public class Esempio {

	
	public static void main(String[] args) {
		Segreteria s = new Segreteria();
		
		Corso c1 = new Corso("Analisi");
		Corso c2 = new Corso("Info");
		
		Studente s1 = s.creaStudente("111", "Mario", "Rossi");
		Studente s2 = s.creaStudente("222", "Angela", "gialli");
		Studente s3 = s.creaStudente("333", "Carlo", "Verdi");
		
		s1.iscriviCorso(c2);
		s1.iscriviCorso(c2);
		s2.iscriviCorso(c2);
		c2.iscriviStudente("111");
		c2.iscriviStudente("222");
		c1.iscriviStudente("111");
		
		System.out.println("Nome e cognome studente 111: " + s.cercaStudente("111"));
		System.out.println("Studenti iscritti al corso Info :\n" + s.studentiIscrittiCorso(c2));
		System.out.println("Elenco corsi a cui è iscritto studente 111: \n" +  s.cercaCorsiStudente("111"));
		System.out.println("Elenco corsi a cui è iscritto studente 888: \n" +  s.cercaCorsiStudente("888"));
		System.out.println("Studente 111 iscritto a corso c1?: " + s.studenteIscrittoSiNo(c1, "111"));
		System.out.println("Studente 333 iscritto a corso c1?: " + s.studenteIscrittoSiNo(c1, "333"));

	}

}
