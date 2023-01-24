package no.hvl.data102;

public class Film {
	private int filmnr;
	private String produsent;
	private String tittel;
	private int lansering;
	private String filmselskap;
	
	enum Sjanger{
		
	}
	
	public Film(){
		
	}
	
	public Film(int filmnr, String produsent, String tittel, int lansering,Sjanger sjanger, String filmselskap) {
		this.filmnr = filmnr;
		this.produsent = produsent;
		this.tittel = tittel;
		this.lansering = lansering;
		this.filmselskap = filmselskap;
	}

	public int getFilmnr() {
		return filmnr;
	}

	public void setFilmnr(int filmnr) {
		this.filmnr = filmnr;
	}

	public String getProdusent() {
		return produsent;
	}

	public void setProdusent(String produsent) {
		this.produsent = produsent;
	}

	public String getTittel() {
		return tittel;
	}

	public void setTittel(String tittel) {
		this.tittel = tittel;
	}

	public int getLansering() {
		return lansering;
	}

	public void setLansering(int lansering) {
		this.lansering = lansering;
	}
	
	



	public String getFilmselskap() {
		return filmselskap;
	}

	public void setFilmselskap(String filmselskap) {
		this.filmselskap = filmselskap;
	}
	
	@Override
	public boolean equals(Object lik) {
		return this.getFilmnr() == ((Film) lik).getFilmnr();
		
	}
	
	@Override
	public int hashCode() {
	 Integer temp = filmnr;
	 return temp.hashCode();
	}
	
	
	
	
	
	

}
