package no.hvl.data102;

import no.hvl.data102.adt.FilmarkivADT;

public class Filmarkiv2 implements FilmarkivADT{ 
    private int antall; 
    private LinearNode<Film> start;
    
    
    public Filmarkiv2(){
    	start = null;
    	antall = 0;
    }

	@Override
	public Film finnFilm(int nr) {
		// TODO Auto-generated method stub
		  LinearNode<Film> current = start;		
		    while (current != null) {
		        if (current.getElement().getFilmnr() == nr) {
		          return current.getElement();
		        }
		        current = current.next;
		      }
		      return null;
		    
	}
	
	@Override
	public void leggTilFilm(Film nyFilm) {
		// TODO Auto-generated method stub
		LinearNode<Film> newNode = new LinearNode<Film>(nyFilm);
		
		newNode.next = start;
		start = newNode;
		antall++;
		
	}
	@Override
	public boolean slettFilm(int filmnr) {
		// TODO Auto-generated method stub
		if(start == null) {
			return false;
		}
		
		if(start.getElement() == finnFilm(filmnr)) {
			start = start.next;
			return true;
		}
		
		
		while (start.next != null) {
		if (start.next.getElement() == finnFilm(filmnr)) {
			start.next = start.next.next;
				return true;
			}
		start = start.next;
		}		
		
		return false;
	}
	@Override
	public Film[] soekTittel(String delstreng) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int antall(Sjanger sjanger) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int antall() {
		// TODO Auto-generated method stub
		return 0;
	} 

    
} 