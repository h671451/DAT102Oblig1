package no.hvl.data102.klient;

import no.hvl.data102.Film;
import no.hvl.data102.Sjanger;

public class Meny {
	private Tekstgrensesnitt tekstgr;
	private FilmarkivADT filmarkiv;
	public Meny(FilmarkivADT filmarkiv){
	tekstgr = new Tekstgrensesnitt();
	this.filmarkiv = filmarkiv;
	}
	public void start(){
	 // legg inn en del forhåndsdefinerte filmer for å teste metodene
	// TODO
		Film film1 = new Film(1, "James Cameron", "Avatar", 2009, "Lightstorm", Sjanger.ACTION);
        Film film2 = new Film(2, "Chris Nolan", "Batman 2", 2008, "DC", Sjanger.ACTION);
        Film film3 = new Film(3, "Jerry Bruckheimer", "Pirates of the Caribbean", 2003, "Disney", Sjanger.ACTION);
	}

}
