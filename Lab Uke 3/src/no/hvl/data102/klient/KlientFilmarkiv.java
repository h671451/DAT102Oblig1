package no.hvl.data102.klient;

public class KlientFilmarkiv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FilmarkivADT filma = new Filmarkiv(100);
		Meny meny = new Meny(filma);
		meny.start();

	}

}
