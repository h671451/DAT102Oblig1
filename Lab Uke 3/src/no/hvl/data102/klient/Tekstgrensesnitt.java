package no.hvl.data102.klient;

import java.util.Scanner;

import no.hvl.data102.Film;
import no.hvl.data102.Filmarkiv;
import no.hvl.data102.Sjanger;
import no.hvl.data102.adt.FilmarkivADT;

public class Tekstgrensesnitt {
	
	private Film[] filmtab;
	private int antall= 0;
	
	public Tekstgrensesnitt(int plass) {
		filmtab = new Film[plass];
	}
	
	// lese opplysningene om en FILM fra tastatur
	public Film lesFilm(){
        Film film;
        
        Scanner scanner = new Scanner (System.in);
        System.out.println("Skriv inn filmnr.");
        int filmnr = scanner.nextInt();
        
        System.out.println("Skriv inn Filmskaper");
        String Filmsakper = scanner.nextLine();
        
        System.out.println("Skriv inn Filmtittel");
        String filmTittel = scanner.nextLine();
        
        System.out.println("Skriv inn lanseringsår");
        int lanseringsår = scanner.nextInt();
        
        System.out.println("Skriv inn Filmselskap");
        String Filmselskap = scanner.nextLine();
        
        System.out.println("Velg sjanger, mellom: Action, Drama, History og Scifi.");
        String sjanger = scanner.nextLine();
        Sjanger sjang = null;
        
        do {
        if(sjanger.equals("Action")) {
            sjang = Sjanger.ACTION;
        } else if(sjanger.equals("Drama")) {
            sjang = Sjanger.DRAMA;
        } else if(sjanger.equals("History")) {
            sjang = Sjanger.HISTORY;
        } else if(sjanger.equals("Scifi")) {
            sjang = Sjanger.SCIFI;
        } else {
            System.out.println("Ugyldig sjanger, prøv igjen");
            sjanger = scanner.nextLine();
        }
        } while(sjang == null);
        
    film = new Film(filmnr,Filmsakper,filmTittel,lanseringsår,Filmselskap,sjang);
    
    return film; 
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
        
        System.out.println("Antall filmer totalt: " + filma.antall());
        System.out.println("Antall filmer i Action sjangeren: " + filma.antall(Sjanger.ACTION));
        System.out.println("Antall filmer i Drama sjangeren: " + filma.antall(Sjanger.DRAMA));
        System.out.println("Antall filmer i History sjangeren: " + filma.antall(Sjanger.HISTORY));
        System.out.println("Antall filmer i Scifi sjangeren: " + filma.antall(Sjanger.SCIFI));
	}
	// … Ev. andre metoder


}
