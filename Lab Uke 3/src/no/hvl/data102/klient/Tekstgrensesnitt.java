package no.hvl.data102.klient;

import java.util.Scanner;

import no.hvl.data102.Film;
import no.hvl.data102.Filmarkiv;
import no.hvl.data102.adt.FilmarkivADT;

public class Tekstgrensesnitt {
	
	private Film[] filmtab;
	private int antall= 0;
	
	public Tekstgrensesnitt(int plass) {
		filmtab = new Film[plass];
	}
	
	// lese opplysningene om en FILM fra tastatur
	public Film lesFilm(){
	// TODO
		Film film;
		Scanner input = new Scanner(System.in);
		System.out.print("Skriv inn filmnr");
		int filmnr = input.nextInt();
		
		for(int i = 0; i<filmtab.length; i++) {
			if(filmtab[i].getFilmnr() == filmnr) {
					

			}
		}


	
	}
	// vise en film med alle opplysninger på skjerm (husk tekst for sjanger)
	public void visFilm(Film film) {
		
		for(int i = 0; i<filmtab.length; i++) {
			if(filmtab[i].equals(film)) {
				System.out.print( filmtab[i].getFilmnr());
				System.out.print( filmtab[i].getProdusent());
				System.out.print( filmtab[i].getTittel());
				System.out.print( filmtab[i].getLansering());
				System.out.print( filmtab[i].getFilmselskap());

			}
		}
		
	// TODO
	}
	
	// Skrive ut alle Filmer med en spesiell delstreng i tittelen
	public void skrivUtFilmDelstrengITittel(FilmarkivADT filma,
	 String delstreng) {
	// TODO
		Film[] nyF = new Film[antall];
		nyF = filma.soekTittel(delstreng);
		
		for(int i = 0; i<filmtab.length; i++) {
			if(filmtab[i].getTittel() == delstreng) {
				filmtab[i] = nyF[i];
			System.out.println(filmtab[i]);
			}
		}
	}
	
	// Skriver ut alle Filmer av en produsent / en gruppe
	public void skrivUtFilmProdusent(FilmarkivADT filma, String delstreng) {
		
		   System.out.print(delstreng + ":");
		   
        for (int i = 0; i < filmtab.length; i++) {
         
            if (filmtab[i].getProdusent().equals(delstreng)) {
                System.out.print("\n" +  filma.soekTittel(delstreng));
            }
        }
	}
	
	// Skrive ut en enkel statistikk som inneholder antall Filmer totalt
	// og hvor mange det er i hver sjanger
	public void skrivUtStatistikk(FilmarkivADT filma) {
	// TODO
	}
	// … Ev. andre metoder


}
