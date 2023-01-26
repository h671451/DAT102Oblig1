package no.hvl.data102;

import no.hvl.data102.adt.FilmarkivADT;

public class Filmarkiv implements FilmarkivADT {
	
	private Film[] filmtab;
	private int antall= 0;
	
	public Filmarkiv(int plass) {
		filmtab = new Film[plass];
	}
	
	

	
	private void utvid () {
		int newSize = filmtab.length * 2;
		Film[] newFilmer = new Film[newSize];
		for(int i = 0; i<filmtab.length; i++) {
			newFilmer[i] = filmtab[i];
		}
		filmtab = newFilmer;
	}
	
	private Film[] trim(Film[] filmTab) {
        int n = 0;
        
        Film[] trimmet = new Film[antall];
        
        for (int i = 0; i < filmTab.length; i++) {
            if (filmTab[i] != null) {
                trimmet[n] = filmTab[i];
                n++;
            }
        }
        filmTab = trimmet;
        return filmTab;
    }

	@Override
	public Film finnFilm(int nr) {
		// TODO Auto-generated method stub
		for(int i = 0; i<filmtab.length; i++) {
			if(filmtab[i].getFilmnr() == nr) {				
				return filmtab[i];
			}
		}
		return null;
	}

	@Override
	public void leggTilFilm(Film nyFilm) {
		// TODO Auto-generated method stub
		if(antall<filmtab.length) {
			filmtab[antall] = nyFilm;
			antall++;
		} else {
			utvid();
			filmtab[antall] = nyFilm;
			antall++;
		}
		
	}

	@Override
	public boolean slettFilm(int filmnr) {
		for(int i = 0; i<antall; i++) {
			if(filmtab[i].getFilmnr() == filmnr) {
				filmtab[i] = filmtab[antall -1];
				filmtab[antall -1] = null;
				antall--;
				
				
				return true;
			}
		}
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Film[] soekTittel(String delstreng) {
		// TODO Auto-generated method stub
		Film[] FilmT = new Film[antall];
		for(int i =0; i<antall; i++) {
			if(filmtab[i].getTittel() == delstreng) {
				FilmT[i] = filmtab[i];
				trim(FilmT);
				return FilmT;
			}
		}
		return null;
	}

	@Override
	public int antall(Sjanger sjanger) {
		// TODO Auto-generated method stub
		int nyttall = 0;
		int n = 0;
		for ( int i = 0; i<antall; i++) {
			if( (Sjanger.ACTION == sjanger) ) {
				n++;
				nyttall = n;
			} else if((Sjanger.DRAMA == sjanger) || (Sjanger.HISTORY == sjanger) || (Sjanger.SCIFI == sjanger))
				
		}
		return nyttall;
	}

	@Override
	public int antall() {
		// TODO Auto-generated method stub
		return 0;
	}


	
	
	

}
